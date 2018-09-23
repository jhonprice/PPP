package com.rtx.gof.build;

public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("=================\n");
        buffer.append("title:::").append(title).append("\n");
        buffer.append("\n");
    }

    public void makeString(String str) {
        buffer.append("- ").append(str);
        buffer.append("\n");
    }

    public void makeItems(String[] items) {
        for(int i=0;i<items.length;i++){
            buffer.append(i).append(" ").append(items[i]).append("\n");
        }
    }

    public void close() {
        buffer.append("=================\n");
    }

    public String getBuffer() {
        return buffer.toString();
    }
}
