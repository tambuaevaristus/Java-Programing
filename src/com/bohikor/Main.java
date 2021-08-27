package com.bohikor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        GradeBook book = new GradeBook("Biology");
//        book.displaymessage();
//        book.average();
//
//        Circle ball = new Circle(15);
//
//        ball.calculations();
//
//        Square_and_Cube square = new Square_and_Cube();
//
//        square.print();

//        Sum numbers = new Sum();
//        numbers.sum();
//
//        Chrismas day =new Chrismas(5);
//        day.printSong();

        int[] age;
        age = new int[5];
        age[0] = 3;
        age[1] = 4;
        age[2] = 5;
        age[3] = 6;
        age[4] = 7;

        System.out.println("The lenght of the array is"+ age.length);

        try {

            for (int i =0; i<age.length; i++){
                for (int j=0; j<=age[i]; j++){
                    System.out.print('*');

                }
                System.out.println("");
                age[15] = 5;
                System.out.println("still in the try method");
            }

        }
        catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("An Error occured");
        }

    }
}
