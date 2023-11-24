package com.tsherpa.project05.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TotalVO {
    private int marketNo;
    private String title;
    private int price;
    private String content;
    private String loginId;
    private String active;
    private String conditions;
    private String regdate;
    private String selectedAddress;
    private String detailAddress;
    private double xdata;
    private double ydata;
    private String saveFolder;
    private String originFile;
    private String saveFile;
    private String mainSaveFolder;
    private String mainOriginFile;
    private String mainSaveFile;

}