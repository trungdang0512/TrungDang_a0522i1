package com.example.bt_dictionary.repo;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class dictionaryRepo {
    static Map<String, String> dictionary = new HashMap<String, String>();
    static {
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
    }

    public String find(String input){

        String result = dictionary.get(input);
        if (result != null){
            return result;
        }else {
            return result = "Not Found!!";
        }
    }
}
