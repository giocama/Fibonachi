package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* int num1 = 0, num2 = 1, num3, i, contador = 10;
        System.out.print(num1 + " " + num2);

        for(i = 2; i < contador; ++i) {
            num3 = num1 + num2;

            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3; */
///////////////////////////////////////////////////////////////////////////////////////
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();
        sc.close();
        int fibonacciA = 0;
        int fibonacciB = 1;
        int suma = 1;
        System.out.println(fibonacciA);
        for(int i = 0; i < numero; i++) {
            System.out.println(suma);
            suma = fibonacciA + fibonacciB;
            fibonacciA = fibonacciB;
            fibonacciB = suma;

        }
    }
}
