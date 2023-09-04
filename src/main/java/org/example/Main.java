package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int b = input.nextInt();
        System.out.print("Üçüncü sayıyı gitiniz :");
        int c = input.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.print(a + "<" + b + "<" + c);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.print(b + "<" + a + "<" + c);
            } else {
                System.out.println(b + "<" + c + "<" + a);
            }
        } else {
            if (a < b) {
                System.out.println(c + "<" + a + "<" + b);
            } else {
                System.out.println(c + "<" + b + "<" + a);
            }
        }
    }
}