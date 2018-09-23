package com.rtx.gof.iterator.ex;

public class Book {
    String name;
    String location;

    public Book(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("name", name)
                .append("location", location)
                .toString();
    }
}
