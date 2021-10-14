package chap01.practice;

import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        String n = stdIn.nextLine();
        System.out.println("그 수는 " + n.chars().count() + "자리입니다.");
    }
}
