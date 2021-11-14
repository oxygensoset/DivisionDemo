package com.company;

public class Main {

    public static void main(String[] args) {
	int iresult, iremain; // для деление целых чисел
        double dresult, dremain;
                            // для деление вещественных  чисел
        // деление целых чисел
        iresult = 10 / 3;
        iremain = 10 % 3;

        System.out.println("частное деление от 10 / 3 равно ");
        System.out.println(iresult + ", остаток равен" + iremain);

        // деление вещественных чисел
        dresult = 10.0 / 3.0;
        dremain = 10.0 % 3.0;

        System.out.println("чатное от деление 10.0 / 3.0 равно");
        System.out.println(dresult + ",остаток равен" + dremain);

    }// main(String[] ) method

}// DivisionDemo
