package com.rtx.gof.factory;

public abstract class Factory {
    public final Product create(String owner){
        Product tmp  = createProduct(owner);
        fillProduct(tmp);
        return tmp;
    }

    protected abstract void fillProduct(Product tmp);

    protected abstract Product createProduct(String owner);
}
