package com.rtx.gof.adaptor.ex.extend;

import com.rtx.gof.adaptor.ex.Banner;

public class Adaptor extends Banner implements Target{

    public void printUpperButLower() {
        showWithLowwer();
    }

    public void printLowwerButUpper() {
        showWithUpper();
    }
}
