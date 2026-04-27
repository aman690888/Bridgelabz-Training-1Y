package com.gla.collection_assignment.list.q1;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < list.size()/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }

        System.out.println(list);
    }
}