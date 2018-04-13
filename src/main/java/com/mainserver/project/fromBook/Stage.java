package com.mainserver.project.fromBook;

public class Stage {
    private Stage(){

    }

    private static class StageSingltonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingltonHolder.instance;
    }

    public void turnOn(){
        System.out.println("lights is turned on");
    }

    public  void  turnOff(){
        System.out.println("lights are turned off");
    }
}
