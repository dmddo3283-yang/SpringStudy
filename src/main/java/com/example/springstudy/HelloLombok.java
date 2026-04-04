package com.example.springstudy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok lombok = new HelloLombok();
        lombok.setName("asdf");

        String name = lombok.getName();
        System.out.println("name = " + name);
    }
}
