package com.rtx.junit5.code.disablePack;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTestsDemo {

    @Disabled
    @Test
    void testWillBeSkipped(){

    }

    @Test
    void testWillBeExecuted() {
    }
}
