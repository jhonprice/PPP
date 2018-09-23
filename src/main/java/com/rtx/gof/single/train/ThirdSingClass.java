package com.rtx.gof.single.train;

public class ThirdSingClass {
    private static ThirdSingClass[] thirdSingClasses= {new ThirdSingClass(0),
            new ThirdSingClass(1),
            new ThirdSingClass(2)};

    private int id;

    private ThirdSingClass(int id) {
        this.id = id;
    }
    public static ThirdSingClass getInstance(int id){
        return thirdSingClasses[id];
    }

}
