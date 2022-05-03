package com.javarush.task.pro.task07.task0715;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.eat();
        entity.move();
        Human human = new Human();
        human.eat();
        human.move();
        human.speak();
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.eat();
        javaDeveloper.move();
        javaDeveloper.speak();
        javaDeveloper.code();
    }
}
