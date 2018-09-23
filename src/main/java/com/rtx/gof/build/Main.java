package com.rtx.gof.build;

public class Main {
    public static void main(String[] args) {
        Builder builder = new TextBuilder();
        Director director = new Director(builder);
        director.construct();
    }
}
