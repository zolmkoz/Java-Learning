package org.meicode.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       String[] students = new String[5];
//       students[1] = "Nguyen";
//       students[0] = "Trung";
//       students[2] = "Hao";
//       students[3] = "Nhan";
//       students[4] = "Kien";
//       students[5] = "Tara";
//
////        System.out.println(students[2]);
//
//        System.out.println(students[5]);
//
//        String[] emloyees = {"Nguyen", "Trung", "Hao"};
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i=0; i<numbers.length; i++){
////            System.out.println(numbers[i]);
//        }

        String[] names = {"Nguyen", "Hao", "Nghia", "Kien", "Tara"};
        int[] numbers =  {12345, 123124, 71348, 86723, 901273};
        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=0; i<names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(numbers[i]);
            }
        }
    }
}
