package org.example;

public class ExampleClass {

    public ExampleClass(){
       myVariableOnfirstScope = "Constructor Elledi.";
       MyVariableStatic = "Constructor is changed";
    }

    public ExampleClass(int Number){
        myVariableOnfirstScope = "Number Elledi.";
        MyVariableStatic = "Number is changed";
    }
    public String myVariableOnfirstScope = "public";
    static String MyVariableStatic = "Static";
    static void MyStaticFunc(){
        String MyStaticFuncStringVar = "MyStaticFuncVariableString";
        System.out.println("[STATIC]I am a Static Func -> /'MyStaticFunc/' from ExampleClass[STATIC]");
    }

    public void MyPublicFunc(){
        System.out.println("[PUBLIC]I am a Public Func -> /'MyPublicFunc/' from ExampleClass[PUBLIC]");
    }
}
