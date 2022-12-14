package org.example.di.main;

import org.example.di.service.ChangePasswordService;
import org.example.di.service.MemberRegisterService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

public class MainForSpring2 {

    //    private static Assembler assembler = new Assembler();
    private static GenericXmlApplicationContext ctx = null;


    public static void main(String[] args) throws IOException {

        //ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
        ctx = new GenericXmlApplicationContext("classpath:appCtx3.xml");

        MemberRegisterService mrs1 = ctx.getBean("memberregSvc", MemberRegisterService.class);
        MemberRegisterService mrs2 = ctx.getBean("memberregSvc", MemberRegisterService.class);

        System.out.println("두 값에 참조값이 같은지 비교 mrs1 == mrs2 ==>" + (mrs1 == mrs2));

        ChangePasswordService cps1 = ctx.getBean("memberPwSvc",ChangePasswordService.class);
        ChangePasswordService cps2 = ctx.getBean("memberPwSvc",ChangePasswordService.class);

        System.out.println("cps1== cps2 => "+ (cps1 == cps2));



    }

}
