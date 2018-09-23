package com.rtx.junit5.code.tag;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayNameDemo {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces(){
    }

    @Test
    @DisplayName("(╯°□°）╯)")
    void testWithDisplayNameContainingSpecialCharcters(){

    }
    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji(){

    }
}
