package ru.mirea.practice.work9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во игроков: ");
        int n = in.nextInt();
        if (n < 2 | n > 10) {
            System.out.print("Неверное кол-во игроков");
        } else {
            String[] cards = new String[]{"Т", "К", "Д", "В", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
            String[][] players = new String[n][5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    int a = ThreadLocalRandom.current().nextInt(0, 12 + 1);
                    players[i][j] = cards[a];
                    System.out.println(players[i][j]);
                }
                System.out.println("\n");
            }
        }
    }
}
