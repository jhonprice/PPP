package com.rtx.gof.abstractFactory.fatory;

public abstract class Item implements HtmlTrait{
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }
}
