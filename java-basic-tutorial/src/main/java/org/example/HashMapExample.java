package org.example;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
public class HashMapExample {
    private HashMap<String,String> MyFirstHashMapOnJava = new HashMap<String,String>();

    public HashMapExample(){
        MyFirstHashMapOnJava.put("1","10");
        MyFirstHashMapOnJava.put("2","20");

        System.out.println(MyFirstHashMapOnJava.get("1"));

        Iterator<String> it = MyFirstHashMapOnJava.keySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }



    }
}
