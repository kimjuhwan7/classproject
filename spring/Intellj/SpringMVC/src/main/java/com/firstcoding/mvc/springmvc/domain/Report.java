package com.firstcoding.mvc.springmvc.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Report {

    private String snum;
    private String sname;
    private MultipartFile report;


}
