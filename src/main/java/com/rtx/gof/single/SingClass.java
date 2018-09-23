package com.rtx.gof.single;

public class SingClass {
    private static SingClass singClass = new SingClass();
    private SingClass(){
        System.out.println("make");
    }
    public static synchronized SingClass getInstance(){
        return  singClass;
    }
}
