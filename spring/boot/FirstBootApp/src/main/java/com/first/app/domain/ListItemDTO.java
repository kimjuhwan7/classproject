package com.first.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ListItemDTO {
    private Integer empno;
    private String ename;
    private String mgr;
    private String dname;
    private String loc;
}
