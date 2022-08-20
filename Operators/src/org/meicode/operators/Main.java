package org.meicode.operators;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

//        boolean answer = a != b;
//        System.out.println(answer);

//        boolean answer = a==5 && b==2;
//        System.out.println(answer);

        boolean answer = a>3;

//        if (answer) {
//            System.out.println("A is greater than 3");
//        } else {
//            System.out.println("A is less than 3");
//        }

//        if (a>0){
//            System.out.println("A is Positive");
//        } else if (a<0) {
//            System.out.println("A is Negative");
//        } else {
//            System.out.println("A is Zero");
//        }

        switch (a){
            case 1:
                System.out.println("A is One");
                break;
            case 2:
                System.out.println("A is Two");
                break;
            case 3:
                System.out.println("A is Three");
                break;
            default:
                System.out.println(" A is not One, Two, Three");
        }

        System.out.println("Continue...");

    }
}
