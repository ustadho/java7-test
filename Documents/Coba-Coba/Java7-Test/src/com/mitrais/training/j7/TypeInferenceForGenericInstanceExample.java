package com.mitrais.training.j7;

import java.util.ArrayList;

public class TypeInferenceForGenericInstanceExample {
    public static void main(String[] args) {
        ArrayList<String> course = new ArrayList<>();
        course.add("English");
        course.add("Java");
        course.add("VB.Net");
        System.out.println("**************");
        for (String s: course){
            System.out.println(s);
        }
    }
}
