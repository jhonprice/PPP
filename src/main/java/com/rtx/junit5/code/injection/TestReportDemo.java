package com.rtx.junit5.code.injection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;

public class TestReportDemo {
    @Test
    void reportSingleValue(TestReporter testReporter){
        testReporter.publishEntry("key","value");
    }

    @Test
    void reportSeveralValues(TestReporter testReporter) {
        HashMap<String, String> values = new HashMap<>();
        values.put("user name", "dk38");


        testReporter.publishEntry(values);

        values.put("award year", "1974");


        testReporter.publishEntry(values);
    }


}
