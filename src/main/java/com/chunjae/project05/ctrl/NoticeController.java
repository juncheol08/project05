package com.chunjae.project05.ctrl;

import com.chunjae.project05.biz.NoticeService;
import com.chunjae.project05.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    HttpSession session;    // 세션 생성

    @GetMapping("list")  // notice/list
    public String getNoticeList(Model model) throws Exception {
        List<Notice> noticeList = noticeService.noticeList();

        // 새로운 날짜 형식을 위한 포매터
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 각 Notice 객체의 resdate를 새로운 형식으로 변환하여 추가
        noticeList.forEach(notice -> {
            LocalDateTime resDateTime = LocalDateTime.parse(notice.getResdate(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            // 변환된 날짜를 String으로 다시 설정
            notice.setResdate(formatter.format(resDateTime));
        });

        model.addAttribute("noticeList", noticeList);
        return "notice/noticeList";
    }

    @GetMapping("detail")    // notice/detail?no=1
    public String getNoticeDetail(HttpServletRequest request, Model model) throws Exception {
        int no = Integer.parseInt(request.getParameter("no"));
        Notice dto = noticeService.noticeDetail(no);
        System.out.println(dto.toString());
        model.addAttribute("dto", dto);

        HttpSession session = request.getSession();
        Cookie[] cookieFromRequest = request.getCookies();
        String cookieValue = null;
        for(int i = 0 ; i<cookieFromRequest.length; i++) {
            // 요청정보로부터 쿠키를 가져온다.
            cookieValue = cookieFromRequest[0].getValue();  // 테스트라서 추가 데이터나 보안사항은 고려하지 않으므로 1번째 쿠키만 가져옴
        }
        // 쿠키 세션 입력
        if (session.getAttribute(no+":cookieNotice") == null) {
            session.setAttribute(no+":cookieNotice", no + ":" + cookieValue);
        } else {
            session.setAttribute(no+":cookieNotice ex", session.getAttribute(no+":cookieNotice"));
            if (!session.getAttribute(no+":cookieNotice").equals(no + ":" + cookieValue)) {
                session.setAttribute(no+":cookieNotice", no + ":" + cookieValue);
            }
        }
// 쿠키와 세션이 없는 경우 조회수 카운트
        if (!session.getAttribute(no+":cookieNotice").equals(session.getAttribute(no+":cookieNotice ex"))) {
            noticeService.countUp(no);
            dto.setCnt(dto.getCnt()+1);
        }

        return "notice/detail";
    }

    @GetMapping("insert")
    public String insertForm(HttpServletRequest request, Model model) throws Exception {
        return "notice/insert";
    }

    @PostMapping("insert")
    public String noticeInsert(HttpServletRequest request, Model model) throws Exception {
        Notice dto = new Notice();
        dto.setTitle(request.getParameter("title"));
        dto.setContent(request.getParameter("content"));
        noticeService.noticeInsert(dto);
        return "redirect:list";
    }

    @GetMapping("delete")
    public String noticeDelete(HttpServletRequest request, Model model) throws Exception {
        int no = Integer.parseInt(request.getParameter("no"));
        noticeService.noticeDelete(no);
        return "redirect:list";
    }

    @GetMapping("edit")
    public String editForm(HttpServletRequest request, Model model) throws Exception {
        int no = Integer.parseInt(request.getParameter("no"));
        Notice dto = noticeService.noticeDetail(no);
        model.addAttribute("dto", dto);
        return "notice/noticeEdit";
    }

    @PostMapping("edit")
    public String noticeEdit(HttpServletRequest request, Model model) throws Exception {
        int no = Integer.parseInt(request.getParameter("no"));
        Notice dto = new Notice();
        dto.setNo(no);
        dto.setTitle(request.getParameter("title"));
        dto.setContent(request.getParameter("content"));
        noticeService.noticeEdit(dto);
        return "redirect:list";
    }
}
