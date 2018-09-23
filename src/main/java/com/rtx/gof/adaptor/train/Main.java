package com.rtx.gof.adaptor.train;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FilePrperties();
        try{
            f.readFromFile("");
            f.setValue("","");
            f.setValue("","");
            f.writeToFile("");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
