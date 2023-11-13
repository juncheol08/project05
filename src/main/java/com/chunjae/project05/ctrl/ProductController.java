package com.chunjae.project05.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/test")
    public String test() {

        return "/product/test";
    }

    @GetMapping("/editTest")
    public String editTest(Model model) {

        //상품 수정시 기존 위치정보 전달
        //지도에서 기존 위치 정보대로 마커 표시
        //상품테이블에서  double로 생성?


        //테스트 데이터
        double xdata =126.8853549;
        double ydata = 37.4810984;
        model.addAttribute("xdata",xdata);
        model.addAttribute("ydata",ydata);
        model.addAttribute("selectedAddress","서울특별시 금천구 벚꽃로36길  30");
        model.addAttribute("detailAddress","1층 후문");

        return "/product/editTest";
    }


}
