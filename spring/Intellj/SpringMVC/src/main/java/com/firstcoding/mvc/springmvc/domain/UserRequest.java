package com.firstcoding.mvc.springmvc.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRequest {
    private LocalDate date;


//    public void setDate(String date) {
//        this.date = LocalDate.parse(date);
//    }


}
