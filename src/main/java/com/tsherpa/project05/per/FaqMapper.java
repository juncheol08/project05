package com.tsherpa.project05.per;

import com.tsherpa.project05.entity.Faq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaqMapper {

    List<Faq> getList();
}
