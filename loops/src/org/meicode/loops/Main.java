package org.meicode.loops;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 5;
//        for (int i=0; i<a; i++) {
//            System.out.println(i);
//        }

//        while (a<5) {
//
//            a++;
//
//            if(a==8) {
//                continue;
//            }
//            System.out.println("Hello");
//
//        }

//        do {
//            System.out.println("Hello");
//        } while (a<5);

//        System.out.print("Please Enter a Number: ");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("Answer was: " + answer);
//        System.out.print("Enter your name: ");
//        String name = scanner.next();
//        System.out.println("Hello " + name);


        Random random = new Random();
        int number = random.nextInt(20) + 1;
        System.out.println("number: " + number);

    }
}
