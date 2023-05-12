package ru.tsutmb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println("Input a number: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        in.close();

        double y = calculate.Work(x);
        System.out.println(y);
    }
}