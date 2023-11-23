package com.tsherpa.team35.biz;

import com.tsherpa.team35.entity.Notice;
import com.tsherpa.team35.per.NoticeMapper;
import com.tsherpa.team35.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    public List<Notice> getList(Page page) { return noticeMapper.getList(page); }
    public Notice getNotice(@Param("no") int no) {return noticeMapper.getNotice(no); }
    public int getCount(Page page) { return noticeMapper.getCount(page); }
    public void noticeInsert(@Param("param") Notice param) { noticeMapper.noticeInsert(param); }
    public void noticeUpdate(@Param("param") Notice param) { noticeMapper.noticeUpdate(param); }
    public void noticeDelete(int no) { noticeMapper.noticeDelete(no); }
    public void cntUpdate(int no) { noticeMapper.cntUpdate(no); };
}
