package com.company;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords (){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign (){
        int a, b;
        a = 10;
        b = 30;
        System.out.println(a+b);
        if (a+b>=0){
            System.out.println("Сумма положительная");
        }
        if (a+b<0){
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(){
        int value = 1000;
        if (value<=0) {
            System.out.println("Красный");
        }
        else if (value>0 & value<=100) {
            System.out.println("Желтый");
        }
        else if (value>100) {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers() {
        int a, b;
        a = 20;
        b = 50;
        if (a>=b){
            System.out.println("a >= b");
        }
        if (a<b){
            System.out.println("a < b");
        }
    }
}

