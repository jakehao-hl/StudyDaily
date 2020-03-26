package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
//        Map<String,String> map=new HashMap<>();
//        Object obj=map.put("1","ss");
//        map.put("2","bb");
//        map.put("3","vv");
//        System.out.println(map.toString());
//        System.out.println(obj);
//        obj=map.put("1","dd");
//        System.out.println(obj);
//        map.clear();
//        map.remove("2");
//        map.size();
        Map<String, String> map = new HashMap<>();
        map.put("1", "ss");
        map.put("2", "bb");
        map.put("3", "vv");
        //取出map里面所有键值对的方法
        Set set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }
        //取出map里面所有键值对的方法
        for (String key : map.keySet()
        ) {
            System.out.println(key + "=" + map.get(key));
        }
        //获取所有的entry对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> m = it.next();
            System.out.println(m.getKey() + "=" + m.getValue());
        }
        //获取所有的entry对象
        for (Map.Entry<String, String> entry:entrySet
             ) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
