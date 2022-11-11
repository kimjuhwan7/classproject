package com.firstcoding.firstapp.dept;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Dept {

    private int deptno;
    private String dname;
    private String loc;

}