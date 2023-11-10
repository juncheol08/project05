package com.chunjae.project05.biz;

import com.chunjae.project05.entity.Notice;
import com.chunjae.project05.persis.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;


    public List<Notice> noticeList()  {
        return noticeMapper.noticeList();
    }


    public Notice noticeDetail(int no)  {
        return noticeMapper.noticeDetail(no);
    }


    public void noticeInsert(Notice dto)  {
        noticeMapper.noticeInsert(dto);
    }


    public void noticeDelete(int no)  {
        noticeMapper.noticeDelete(no);
    }


    public void noticeEdit(Notice dto)  {
        noticeMapper.noticeEdit(dto);
    }


    public void countUp(int no)  {
        noticeMapper.countUp(no);
    }


}
