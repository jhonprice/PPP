package com.rtx.gof.factory;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class IDCard extends Product{
    String owner;

    public IDCard(String owner) {
        this.owner = owner;
        System.out.println("make "+owner+" card");
    }

    public void use(){
        System.out.println("use "+toString());
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("owner", owner)
                .toString();
    }
}
