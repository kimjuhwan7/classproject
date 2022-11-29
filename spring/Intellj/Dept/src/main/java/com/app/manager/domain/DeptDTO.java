package com.app.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class DeptDTO {
    /*도메인*/
    @Min(value = 1)
    @Max(value = 99)
    @Positive//양수값만 받음
    private int deptno;

    @NotEmpty /*문자열은 비어있지 않은 상태, List-> 요소의 개수가 비어있는지*/
    private String dname;

    @NotEmpty //""fall" " pass
    private String loc;
}

/* @Future : 현재 시간보다 미래이어야 한다! */
/*@Email : 이메일 체크(골뱅이만 체크함)*/
// @NotBlank : 공백 문자열도 체크 " "
// @NotNull :null 갑이 아니다.
