package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length - 1; i++) { // "null" "null" "F"
            String tmp = strings[i]; // "F"
            for (int j = i + 1; j < strings.length; j++) { // "A" "A" "F"
                if (tmp == null) {
                    break;
                }
                if (tmp.equals(strings[j])) { // "null" "null" "F"
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        }
    }

