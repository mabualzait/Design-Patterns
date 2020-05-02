package com.company;

import com.company.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.printData();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.printData();
    }
}
