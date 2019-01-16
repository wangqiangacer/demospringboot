package com.example.demospringboot.Controller;

import java.util.Scanner;

/**
 * @Author: Administrator
 * @CreateTime: 2019-01-16 09:16
 * @Description: ${Description}
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int  b= scanner.nextInt();
        System.out.println("请输入第三个数");
        int c = scanner.nextInt();
      if(a==b||a==c||b==c){
          System.out.println("数据重复");
      }else {
          System.out.println("数据正常");
      }



    }
}
