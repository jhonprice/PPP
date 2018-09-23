package com.rtx.gof.protype;

public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createClone(){
        try {
            return (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
