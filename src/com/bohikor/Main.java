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

         int [][] array = {{3,4,2,5},{2,5,7,6}};

         for(int i=0; i<array.length; i++){
             for (int j=0; j<array[i].length; j++){
                 System.out.print(array[i][j]);
             }
             System.out.println();
         }
    }
}
