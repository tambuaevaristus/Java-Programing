package com.bohikor;
import java.util.Scanner;
public class Chrismas {
    int day;

    public Chrismas(int x){
        day = x;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printSong(){
//        System.out.println("Pls enter The Day");
//        Scanner input = new Scanner(System.in);
//        day = input.nextInt();



            switch (day){
                case 1:
                    System.out.println("Day one");
                    break;
                case 2:
                    System.out.println("Day two");
                    break;
                case 3:
                    System.out.println("Day three");
                    break;
                case 4:
                    System.out.println("Day four");
                    break;
                case 5:
                    System.out.println("Day five");
                    break;
                case 6:
                    System.out.println("Day six");
                    break;
                case 7:
                    System.out.println("Day seven");
                    break;
                case 8:
                    System.out.println("Day eight");
                    break;
                case 9:
                    System.out.println("Day nine");
                    break;
                case 10:
                    System.out.println("Day ten");
                    break;
                case 11:
                    System.out.println("Day eleven");
                    break;
                case 12:
                    System.out.println("Day thieve");
                    break;
                default:
                    System.out.println("Enter a valid Day number");

            }

    }
}
