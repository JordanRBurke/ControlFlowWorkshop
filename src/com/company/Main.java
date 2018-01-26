package com.company;

public class Main {

    public static void main(String[] args) {

        //While Loops

        boolean whileCondition = true;
        int count = 0;


        while (whileCondition) {
            System.out.println("Our while condition is true. Adding 1 to our count");
            count = count + 1;
            if (count == 3) {
                System.out.println("Our count is at 3");
                whileCondition = false;
            }


        }


        //For Loops

//        for(int i = 0; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        //Foreach
//        for(String food : fruit) {
//            if (food.contains("b") || food.contains("B"));
//        }










    }


}