package com.rtx.gof.factory;

public class Main {
    public static void main(String[] args) {
        Factory f = new IDCardFactory();

        f.create("A").use();
        f.create("B").use();
        f.create("C").use();
    }
}
