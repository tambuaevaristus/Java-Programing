package com.bohikor;
import java.util.Scanner;
public class GradeBook {
    private String courseName;

//    constructor
    public GradeBook(String tname){
        courseName = tname;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displaymessage(){
         System.out.println("Welcome to Grade book " + courseName);
     }

     public void average(){

        Scanner input = new Scanner(System.in);
        int mark;
        int sum;
        int average;
        int counter;

        counter = 0;
        sum = 0;

        while (counter!=5){
            System.out.println("Enter Mark: ");
            mark = input.nextInt();
            sum = sum + mark;
            counter++;
        }

        average = sum/counter;

        System.out.printf("the Average is %d ", average);

     }
}
