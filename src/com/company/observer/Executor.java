package com.company.observer;

public class Executor {
    public static void main(String[] args) {
        Course java = new Course("Java Course");

        Student malik = new Student("Malik");
        Student mohammed = new Student("Mohammed");
        Student sami = new Student("Sami");
        Student rami = new Student("Rami");

        java.subscribe(malik);
        java.subscribe(mohammed);
        java.subscribe(sami);
        java.subscribe(rami);

        java.setAvailability(true);
    }
}
