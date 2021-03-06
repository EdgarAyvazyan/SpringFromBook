package com.mainserver.project.fromBook;

public class Sonnet29 implements Poem {
    private static String [] LINES = {"Когда, в раздоре с миром и судьбой,\n" +
            "Припомнив годы, полные невзгод,\n" +
            "Тревожу я бесплодною мольбой \n" +
            "Глухой и равнодушный небосвод\n" +
            "И, жалуясь на горестный удел,\n" +
            "Готов меняться жребием своим \n" +
            "С тем, кто в искусстве больше преуспел,\n" +
            "Богат надеждой и людьми любим, —\n" +
            "Тогда, внезапно вспомнив о тебе,\n" +
            "Я малодушье жалкое кляну,\n" +
            "И жаворонком, вопреки судьбе,\n" +
            "Моя душа несется в вышину.\n" +
            "С твоей любовью, с памятью о ней \n" +
            "Всех королей на свете я сильней.\n"};

    public Sonnet29(){

    }

    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
