package com.rtx.junit5.code.asserts;

import lombok.Data;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;


@Data
class Person {
    String firstName;
    String lastName;
}

class AssertionDemo {
    static Person person;

    @BeforeAll
    static void initAll(){
        person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
    }
    @Test
    void standardAssertions(){
        assertEquals(2,2);
        assertEquals(4,4,"Message");
        assertTrue(2==2,()->"True Message");
    }


    @Test
    void groupedAssertions() {
        // In a grouped assertion all assertions are executed, and any
        // failures will be reported together.
        assertAll("person",
                () -> assertEquals("John", person.getFirstName()),
                () -> assertEquals("Doe", person.getLastName())
        );
    }
    @Test
    void dependentAssertions(){
        assertAll("properties", ()->{
            String firstName =person.getFirstName();
            assertNotNull(firstName);

            assertAll("first Name",
                    ()-> assertTrue(firstName.startsWith("J")),
                    ()->assertTrue(firstName.endsWith("n")));
        },()->{
            String lastName =person.getLastName();
            assertNotNull(lastName);

            assertAll("LAST Name",
                    ()-> assertTrue(lastName.startsWith("D")),
                    ()->assertTrue(lastName.endsWith("e")));
        });
    }
    @Test
    void exceptionTesting(){
        Throwable exception = assertThrows(IllegalArgumentException.class,()->{
           throw new IllegalArgumentException("a message");
        }, "IllegalArgumentException");

        assertEquals("a message",exception.getMessage());
    }

    @Test
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofSeconds(2),()->{
            Thread.sleep(1000);
        });
    }

    @Test
    void timeoutNotExceededWithResult(){
        String actualResult = assertTimeout(Duration.ofMinutes(2),()-> "result");
        assertEquals("result",actualResult);
    }

    @Test
    void timeoutNotExceededWithMethod(){
        String str = assertTimeout(Duration.ofMinutes(2),AssertionDemo::greeting);

        assertEquals("hello world!",str);
    }
    private static String greeting() {
        return "hello world!";
    }
    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofSeconds(1), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(10000);
        });
    }
    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // The following assertion fails with an error message similar to:
        // execution timed out after 10 ms
        assertTimeoutPreemptively(ofSeconds(1), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(10000);
        });
    }
}
