package com.main;

public class App {
    public String getGreeting() {
        return "Welcome to PakMilk Enterprise Build System via Gradle!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}