package com.javarush.task.pro.task09.task0908;

import java.util.HashMap;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber
                + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber
                + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.length() == 0) {
            return "";
        }
        if (!binaryNumber.matches("[0-1]+")) {
            return "";
        }

        StringBuilder binaryNumberBuilder = new StringBuilder(binaryNumber);
            if (binaryNumberBuilder.length() % 4 != 0) {
                while (binaryNumberBuilder.length() % 4 != 0) {
                    binaryNumberBuilder.insert(0, "0");
                }
            }

        StringBuilder result = new StringBuilder();
            bH binary = new bH();
        for (int i = 0; i < binaryNumberBuilder.length(); i = i + 4) {
            String str = binaryNumber.substring(i, i + 4);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {

        return null;
    }

    public static class bH {
        HashMap<String, String> bH = new HashMap<>();

        public bH() {
            bH.put("0000", "0");
            bH.put("0001", "1");
            bH.put("0010", "2");
            bH.put("0011", "3");
            bH.put("0100", "4");
            bH.put("0101", "5");
            bH.put("0110", "6");
            bH.put("0111", "7");
            bH.put("1000", "8");
            bH.put("1001", "9");
            bH.put("1010", "a");
            bH.put("1011", "b");
            bH.put("1100", "c");
            bH.put("1101", "d");
            bH.put("1110", "e");
            bH.put("1111", "f");
            bH.put("0", "0000");
            bH.put("1", "0001");
            bH.put("2", "0010");
            bH.put("3", "0011");
            bH.put("4", "0100");
            bH.put("5", "0101");
            bH.put("6", "0110");
            bH.put("7", "0111");
            bH.put("8", "1000");
            bH.put("9", "1001");
            bH.put("a", "1010");
            bH.put("b", "1011");
            bH.put("c", "1100");
            bH.put("d", "1101");
            bH.put("e", "1110");
            bH.put("f", "1111");
        }
    }
}
