package chap01.practice;

import java.util.Scanner;

public class DiffForPos {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a;
        int b;

        do {
            System.out.print("a의 값 : ");
            a = stdIn.nextInt();
            do {
                System.out.print("b의 값 : ");
                b = stdIn.nextInt();
                if (b <= a) {
                    System.out.println("a보다 큰 값을 입력하세요!");
                }
            } while (b <= 0 || b <= a);
        } while (a <= 0);

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}
