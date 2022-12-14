package com.first.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "dept")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//mysql mariaDB auto Incement
    @Column
    private Integer deptno;


    @Column(length = 20, nullable = false)
    private String dname;


    @Column(length = 20, nullable = false)
    private String loc;

}
