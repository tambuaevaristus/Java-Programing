package com.bohikor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         Scanner text = new Scanner(System.in);
         System.out.println("Enter String one");
         String text1 = text.nextLine();
         System.out.println("Enter String two");
         String text2 = text.nextLine();

         int dif = text1.compareTo(text2);

         System.out.println(dif);

         if(dif>0){
             System.out.println("String One is greater that String Two");
         }
         else if (dif<0){
             System.out.println("String two is greater than string one");
         }
         else {
             System.out.println("The two strings are equal");
         }
    }
}
