package com.input;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2= input.nextInt();

        int sum = num + num2;

        System.out.println(sum);

    }
}
