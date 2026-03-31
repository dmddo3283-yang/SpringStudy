package com.example.springstudy.beanfind;

import com.example.springstudy.discount.DiscountPolicy;
import com.example.springstudy.discount.FixDiscountPolicy;
import com.example.springstudy.discount.RateDiscountPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Objects;

import static org.assertj.core.api.Assertions.*;

public class ApplicationContextExtendsFindTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

    @Test
    void findBeanByTypeDuplicate() {
        DiscountPolicy bean = context.getBean(DiscountPolicy.class);
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class,
                () -> context.getBean(DiscountPolicy.class));
    }

    @Test
    void findAllByParent() {
        Map<String, DiscountPolicy> beansOfType = context.getBeansOfType(DiscountPolicy.class);
        assertThat(beansOfType.size()).isEqualTo(2);
        for (String key : beansOfType.keySet()) {
            System.out.println("key = " + key + "value = " + beansOfType.get(key));
        }
    }

    @Test
    void findAllByObject() {
        Map<String, Object> beansOfType = context.getBeansOfType(Object.class);
        for (String key : beansOfType.keySet()) {
            System.out.println("key = " + key + "value = " + beansOfType.get(key));
        }
    }

    @Configuration
    static class TestConfig {
        @Bean
        public DiscountPolicy rateDiscountPolicy() {
            return new RateDiscountPolicy();
        }

        @Bean
        public DiscountPolicy fixDiscountPolicy() {
            return new FixDiscountPolicy();
        }
    }
}
