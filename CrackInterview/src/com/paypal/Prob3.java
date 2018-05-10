package com.paypal;

import java.io.*;

class Test{
    static int count = 0;
    public Test() {
        count++;
    }
}
public class Prob3 {
    static final int x = 5;
    Integer i;
    int j;
    public int p(){
//        i = j;
//        System.out.println(i + " " + j);
        try {
            FileInputStream fis = new FileInputStream(new File("key.txt"));
            return 3;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return 2;
        } finally {
//            return 4;
        }
    }
    public static void main(String[] args){
//        Test t1 = new Test();
//        Test t2 = new Test();
        Prob3 p3 = new Prob3();
        System.out.println(p3.p());
//        System.out.println(Test.count);
//        byte [] a = {'a', 's', 'd'};
//        System.out.println(Arrays.toString(Base64.getDecoder().decode(a)));
    }
}
