package com.bohikor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeBook book = new GradeBook("Biology");
//        book.displaymessage();
//        book.average();

        Circle ball = new Circle(15);

        ball.calculations();

        Square_and_Cube square = new Square_and_Cube();

        square.print();

    }
}
