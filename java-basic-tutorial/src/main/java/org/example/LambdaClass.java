package org.example;

import java.util.ArrayList;

public class LambdaClass {

    public LambdaClass(){
    ArrayList<Integer> Numbers = new ArrayList<Integer>();

    for (int i =0;i<10;i++){
        Numbers.add(i);
    }

    Numbers.forEach((n) -> {System.out.println(n);});

    }

}
