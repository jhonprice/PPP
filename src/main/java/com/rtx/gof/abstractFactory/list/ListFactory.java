package com.rtx.gof.abstractFactory.list;

import com.rtx.gof.abstractFactory.fatory.Factory;
import com.rtx.gof.abstractFactory.fatory.Link;

public class ListFactory extends Factory{

    public Link createLink(String cap, String url) {
        return new ListLink(cap,url);
    }
}
