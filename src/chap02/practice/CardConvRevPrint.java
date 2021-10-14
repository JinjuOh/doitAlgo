package chap02.practice;

import java.util.Scanner;

public class CardConvRevPrint {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf(r+"|");
        System.out.printf("%5d", x);
        System.out.println();
        System.out.print(" +----------");
        System.out.println();

        do {
            d[digits++] = dchar.charAt(x % r);    // r로 나눈 나머지를 저장
            x /= r;
            if(x!=0) {
                System.out.printf(r+"|");
            } else {
                System.out.print("  ");
            }
            System.out.printf("%5d", x);
            if(digits!=0) {
                System.out.print("     ..." + d[digits-1]);
            }
            System.out.println();
            if(x!=0) {
                System.out.print(" +----------");
                System.out.println();
            }
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno;    // 변환 후의 자릿수
        int retry;  // 다시 한 번?
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");

        no = 59;
        cd = 2;

        dno = cardConvR(no, cd, cno);

//        do {
//            do {
//                System.out.print("양의 정수를 변환 : ");
//                no = stdIn.nextInt();
//            } while (no < 0);
//
//            do {
//                System.out.print("어떤 진수로 변환할까요?(2~36) : ");
//                cd = stdIn.nextInt();
//            } while (cd < 2 || cd > 36);
//
//            dno = cardConvR(no, cd, cno);
//
//            System.out.print(cd+"진수로는 ");
//            for (int i = dno-1; i >= 0; i--) {
//                System.out.print(cno[i]);
//            }
//            System.out.print("입니다.");
//
//            System.out.print("한 번 더 할까요? (1. 예 / 2. 아니오) : ");
//            retry = stdIn.nextInt();
//        } while (retry == 1);
    }
}
