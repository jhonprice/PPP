package com.rtx.junit5.code.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.condition.OS.*;

public class SystemCondition {
    @Test
    @EnabledOnOs(MAC)
    void onlyOnMacOs() {
        System.out.println("MAC");
    }



    @Test
    @EnabledOnOs({ LINUX, MAC })
    void onLinuxOrMac() {
        System.out.println("MAC OR LINUX");
    }

    @Test
    @DisabledOnOs(WINDOWS)
    void notOnWindows() {
        System.out.println("WINDOWS");
    }


    @Test
    @DisabledOnOs(OTHER)
    void notOnOTHERS() {
        System.out.println("OTHERS");
    }

}
