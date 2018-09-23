package com.rtx.gof.build;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("ABC TBS");
        builder.makeItems(new String[]{
                "A","C","B"
        });
        builder.makeString("bye");
        builder.close();
    }
}
