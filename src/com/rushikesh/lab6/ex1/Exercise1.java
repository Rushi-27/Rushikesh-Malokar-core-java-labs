package com.rushikesh.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {

    public List<Integer> getValues(HashMap<Integer, Integer> map) {

        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 45);
        map.put(2, 12);
        map.put(3, 78);
        map.put(4, 34);

        Exercise1 obj = new Exercise1();

        List<Integer> result = obj.getValues(map);

        System.out.println("Sorted Values: " + result);
    }
}
