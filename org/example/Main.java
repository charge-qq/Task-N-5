package org.example;
import java.util.Scanner;

public class Main {
    public static void First_And_Last_String(int w) {
        System.out.println(" " + "-".repeat(w-2) + "-");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите h");
        int h = scanner.nextInt();
        System.out.println("Введите w");
        int w = scanner.nextInt();

        First_And_Last_String(w);
        int counter_h = 1;

        while (counter_h != (h-1)) {
            counter_h++;
            if (counter_h % 2 == 0) {
                System.out.println("|*".repeat(w/2) + "|");
            } else {
                System.out.println("|" + "-+".repeat(w/2-1) + "-|");
            }
        }
        First_And_Last_String(w);
    }
}