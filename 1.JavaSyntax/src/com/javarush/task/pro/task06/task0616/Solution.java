package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    private String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public String getName() {      // получить(прочитать) значения
        return name;
    }

    public void setName(String name) {  // задать(изменить, записать) значения
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
