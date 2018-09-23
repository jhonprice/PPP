package com.rtx.junit5.code.tag;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

public class StandardTests {
    @BeforeAll
    static void initAll(){
        System.out.println("We init!");
    }

    @BeforeEach
    void init(){
        System.out.println("I init!");
    }
    @Test
    void succeedingTest(){
        System.out.print("Pass!");
    }
    @Test
    void faillingTest(){
        fail("a failing test");
    }
    @AfterEach
    void tearDown(){
        System.out.println("I dead!");
    }
    @AfterAll
    static void tearDownAll(){
        System.out.println("We dead!");
    }

}
