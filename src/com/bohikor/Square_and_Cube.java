package com.bohikor;

public class Square_and_Cube {
    private int loop = 0;
    public void print(){
        System.out.println("number    square    cube");
        while(loop<=10){
            System.out.println(loop +"   "+ loop*loop +"   " + loop*loop*loop );
            loop++;
        }
    }
}
