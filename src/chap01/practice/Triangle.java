package chap01.practice;

import java.util.Scanner;

public class Triangle {

    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for (int i = n; i >= 1; i--) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line += "*";
            }
            System.out.printf("%5s", line);
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line += "*";
            }
            System.out.printf("%5s", line);
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        int n;
//
//        do {
//            System.out.print("단 수 : ");
//            n = stdIn.nextInt();
//        } while (n<=0);

        int n = 5;

        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
        triangleRB(n);
    }
}
