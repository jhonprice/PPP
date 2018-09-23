package com.rtx.gof.template;

public class StringDisplay extends AbstractDisplay{
    protected void open() {
        System.out.println("----------");
    }

    protected void end() {
        System.out.println("----------");
    }

    protected void print() {
        System.out.println("|---ok---|");
    }
}
