package com.example.oopsection1;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 12", 5, 8, 8);

        System.out.println(iPhone.getName());

        iPhone.playMusic("Hello Vietnam!!!!");
        iPhone.playMusic("Say you again");

        Phone pixel = new Phone("Pixel 3", 16);
    }
}
