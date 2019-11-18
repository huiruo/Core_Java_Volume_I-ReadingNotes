package com.practise;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;

/*
*判断101-200之间有多少个素数，并输出所有素数。
* */
public class practise2 {
    public static void main(String[] args) {
        int arrIndex = 0;
//        int[] a = new int[];
        // 使用 ArrayList 代替数组
        ArrayList<Integer> a=new ArrayList();
        for (int i =101;i<=200;i++){
            if(isPrime(i)){
//                a[arrIndex] = i;
                a.add(i);
                arrIndex++;
            }
        }
        System.out.println(a);
    }
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        int len = num/2;
        for(int i=2;i<len;i++) {
            if(num%i==0) {
                isPrime=false;
                break;
            }
        }
        if(num==2) {
            return true;
        }
        return isPrime;
    }
}
