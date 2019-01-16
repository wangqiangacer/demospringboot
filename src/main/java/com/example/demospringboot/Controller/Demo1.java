package com.example.demospringboot.Controller;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Administrator
 * @CreateTime: 2019-01-16 09:26
 * @Description: ${Description}
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Integer[] score = {85, 76, 89, 92, 54, 87, 35};
        MyCompator compator = new MyCompator();
        Arrays.sort(score,compator);
       String filePath="d:\\list.txt";
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),"GB2312")));
        for (Integer integer : score) {
            out.write(integer);
        }
        out.close();
    }


   public static class MyCompator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
}



