package com.first.app.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "emp")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer empno;

    @Column
    private String ename;

    @Column
    private String job;

    @Column
    private String mgr;

    @Column
    private LocalDate hiredate;

    @Column
    private Double sal;

    @Column
    private Double comm;

    /*@Column
 private Integer deptno;*/

    @JoinColumn(name = "deptno")
    @ManyToOne
    private Dept dept;

}
