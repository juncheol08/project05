package com.tsherpa.project05.per;

import com.tsherpa.project05.entity.Mainphoto;
import com.tsherpa.project05.entity.Market;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MainphotoMapper {
    public List<Mainphoto> mainphotoList(int marketNo) throws Exception;
    public void mainphotoInsert(Market market) throws Exception;
    public void mainphotoDelete(int marketNo) throws Exception;
    public void mainphotoEdit(Market market) throws Exception;
}
