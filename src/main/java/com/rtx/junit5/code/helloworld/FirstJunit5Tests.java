package com.rtx.junit5.code.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJunit5Tests {
    @Test
    void helloWorld(){
        assertEquals(2, 1 + 1);
    }
}
