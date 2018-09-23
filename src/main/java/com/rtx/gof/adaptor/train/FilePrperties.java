package com.rtx.gof.adaptor.train;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePrperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename),"asd");
    }

    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    public String getValue(String key) {
        return getProperty(key,"");
    }
}
