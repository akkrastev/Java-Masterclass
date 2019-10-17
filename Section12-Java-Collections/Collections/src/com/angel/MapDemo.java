package com.angel;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", " a compiled high level, object-orientated, platform independent language");
        languages.put("Python", "an interpreted , high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes language");
        languages.put("Lisp", "Therein lies madness");

        languages.get("Java");

        System.out.println("===================================================================");

        //languages.remove("Lisp");

        if (languages.replace("Lisp", "Therein lies madness","a functional programming language")){
            System.out.println("Lisp replaced");
        }
        else {
            System.out.println("Lisp was not replaced");
        }

        for (String key : languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
