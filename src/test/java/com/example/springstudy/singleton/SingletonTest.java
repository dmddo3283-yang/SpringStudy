package com.example.springstudy.singleton;

import com.example.springstudy.AppConfig;
import com.example.springstudy.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

    @Test
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        MemberService memberService2 = appConfig.memberService();

        System.out.println(memberService);
        System.out.println(memberService2);

        Assertions.assertThat(memberService).isNotSameAs(memberService2);
    }

    @Test
    void singletonTest() {
        SingleTonService instance1 = SingleTonService.getInstance();
        SingleTonService instance2 = SingleTonService.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        Assertions.assertThat(instance1).isSameAs(instance2);
    }

    @Test
    void springContainer() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService appConfig = ac.getBean("memberService", MemberService.class);
        MemberService appConfig2 = ac.getBean("memberService", MemberService.class);


        Assertions.assertThat(appConfig).isSameAs(appConfig2);
    }
}
