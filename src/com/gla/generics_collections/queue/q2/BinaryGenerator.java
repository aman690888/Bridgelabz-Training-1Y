package com.gla.collection_assignment.queue.q2;

import java.util.*;

public class BinaryGenerator {
    public static void main(String[] args) {

        int n = 5;

        Queue<String> q = new LinkedList<>();
        q.add("1");

        for(int i=0;i<n;i++){
            String s = q.poll();
            System.out.println(s);

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}