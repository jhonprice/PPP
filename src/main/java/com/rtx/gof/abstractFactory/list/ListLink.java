package com.rtx.gof.abstractFactory.list;

import com.rtx.gof.abstractFactory.fatory.Link;

public class ListLink extends Link{

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHTML() {
        return "this is link";
    }
}
