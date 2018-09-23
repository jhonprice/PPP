package com.rtx.gof.factory;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{
    private List<String> owners = new ArrayList<String>();
    protected void fillProduct(Product tmp) {
        owners.add(((IDCard)tmp).getOwner());
    }

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    public List<String> getOwners() {
        return owners;
    }
}
