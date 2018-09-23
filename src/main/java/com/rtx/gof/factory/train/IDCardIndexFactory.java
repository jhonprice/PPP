package com.rtx.gof.factory.train;

import com.rtx.gof.factory.IDCardFactory;
import com.rtx.gof.factory.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardIndexFactory extends IDCardFactory{
    Map<Integer,Product> table = new HashMap<Integer, Product>();
    int index=100;
    @Override
    protected synchronized void fillProduct(Product tmp) {
        super.fillProduct(tmp);
        table.put(index,tmp);
        index++;
    }

    @Override
    protected Product createProduct(String owner) {
        return super.createProduct(owner);
    }

    public Map<Integer, Product> getTable() {
        return table;
    }
}
