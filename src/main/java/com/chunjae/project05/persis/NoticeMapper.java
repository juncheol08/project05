package com.chunjae.project05.persis;


import com.chunjae.project05.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface NoticeMapper {


    List<Notice> noticeList();
    Notice noticeDetail(int no);
    void noticeInsert(Notice dto);
    void noticeDelete(int no);
    void noticeEdit(Notice dto);
    void countUp(int no);
}
