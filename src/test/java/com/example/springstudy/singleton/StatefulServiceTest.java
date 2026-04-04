package com.example.springstudy.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService stateful1 = ac.getBean(StatefulService.class);
        StatefulService stateful2 = ac.getBean(StatefulService.class);

        int user1 = stateful1.order("user1", 10000);
        int user2 = stateful1.order("user2", 20000);

        System.out.println("price = " + user1);

        Assertions.assertThat(user1).isEqualTo(10000);
    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}
