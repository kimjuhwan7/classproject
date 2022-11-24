package com.app.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class DeptDTO {
/*도메인*/
    private int deptno;
    private String dname;
    private String loc;
}
