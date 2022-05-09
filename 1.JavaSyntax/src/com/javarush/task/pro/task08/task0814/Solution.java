package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        return number | 1 << flagPos;
    }

    public static int resetFlag(int number, int flagPos) {
        //number = 0_1100_1110
        //         1_1011_1111 ~&
        //         0_1000_1110
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //number = 0_1000_1110
        //         0_0100_0000 & правая часть
        //         0_0000_0000 левая часть
        return  (number & (1 << flagPos)) == (1 << flagPos);
    }
}
