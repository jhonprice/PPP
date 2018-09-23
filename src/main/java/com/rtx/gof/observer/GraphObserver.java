package com.rtx.gof.observer;

public class GraphObserver implements Observer{
    public void update(NumberGenerator numberGenerator) {
        System.out.println("GraphObserver::::");
        int count = numberGenerator.getNumber();
        for(int i=0;i<count;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
