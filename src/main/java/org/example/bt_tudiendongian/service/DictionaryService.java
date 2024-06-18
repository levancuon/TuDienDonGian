package org.example.bt_tudiendongian.service;

import org.example.bt_tudiendongian.model.Dictionary;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class DictionaryService implements IDIctionaryService {
    private static final Map<String, String> dictionaryList = new HashMap<>();
    static {
        dictionaryList.put("hello", "xin chào");
        dictionaryList.put("hi", "xin chào");
        dictionaryList.put("good", "Tốt");
    }
    public String search(String word){
        if (dictionaryList.get(word)==null){
            return "Từ điển ko có từ này";
        }
       return dictionaryList.get(word);
    }
}
