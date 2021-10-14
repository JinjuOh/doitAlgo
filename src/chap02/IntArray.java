package chap02;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5];   // 배열의 선언
        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        System.out.println(Arrays.toString(a));
    }
}
