package com.rtx.gof.template;

public abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void end();
    protected abstract void print();
    public final void display(){
        open();
        for(int i=0;i<=5;i++){
            print();
        }
        end();
    }
}
