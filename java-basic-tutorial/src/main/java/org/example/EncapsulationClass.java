package org.example;

public class EncapsulationClass {
    private String MyName = "null";

    public String Get(){
        return MyName;
    }

    public void Set(String val){
        MyName = val;
    }
}
