package com.mainserver.project.fromBook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
//        Performer performer = (Performer) ctx.getBean("poeticDuke");
//        Performer performer1 = (Performer) ctx.getBean("duke");
//        performer1.perform();
//        System.out.println("Now when Duke recite during juggling");
//        performer.perform();
//        Stage stage = (Stage)ctx.getBean("theStage");
       Performer performer = (Performer) ctx.getBean("gago");
       performer.perform();

    }
}
