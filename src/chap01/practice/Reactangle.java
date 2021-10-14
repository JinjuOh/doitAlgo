package chap01.practice;

import java.util.Scanner;

public class Reactangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("단 수 : ");
            n = stdIn.nextInt();
        } while (n<=0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
