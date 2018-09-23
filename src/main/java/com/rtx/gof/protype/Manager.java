package com.rtx.gof.protype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String,Product> map = new HashMap<String, Product>();
    public void reg(String key,Product product){
        map.put(key,product);
    }
    public Product create(String key){
        return  map.get(key).createClone();
    }

}
