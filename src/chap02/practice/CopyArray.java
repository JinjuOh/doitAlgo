package chap02.practice;

import java.util.Arrays;

public class CopyArray {
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[a.length - i - 1] = a[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        System.out.println("a="+ Arrays.toString(a));
        System.out.println("b="+ Arrays.toString(b));
        System.out.println("copy 실행");
        copy(a, b);
        System.out.println("a="+ Arrays.toString(a));
        System.out.println("b="+ Arrays.toString(b));
        System.out.println("rcopy 실행");
        rcopy(a, b);
        System.out.println("a="+ Arrays.toString(a));
        System.out.println("b="+ Arrays.toString(b));
    }
}
