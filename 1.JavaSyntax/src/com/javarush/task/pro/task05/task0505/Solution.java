package com.javarush.task.pro.task05.task0505;

import java.util.Random;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner quantity = new Scanner(System.in);
        int N = quantity.nextInt();
        if(N > 0) {
            int[] Array = new int[N];
            for (int i = 0; i < Array.length; i++) {
                Array[i] = quantity.nextInt();
            }
            if (N % 2 == 1) {
                for(int i = 0; i < Array.length; i++) {
                    System.out.println(Array[i]);
                }
            }
            if (N % 2 == 0) {
                for (int i = Array.length; i >= 0; i--) {
                    System.out.println(Array[i-1]);
                }
            }
        }
    }
}