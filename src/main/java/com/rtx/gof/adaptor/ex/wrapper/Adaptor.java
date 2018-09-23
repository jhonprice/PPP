package com.rtx.gof.adaptor.ex.wrapper;

import com.rtx.gof.adaptor.ex.Banner;

public class Adaptor extends Target{

    public Banner banner;

    public Adaptor(Banner banner) {
        this.banner = banner;
    }

    public void printUpperButLower() {
        banner.showWithLowwer();
    }

    public void printLowwerButUpper() {
        banner.showWithUpper();
    }
}
