package chap01.practice;

public class SumOf {
    static int sumOf(int a, int b) {
        int sum = 0;
        int start = 0;
        int end = 0;

        if (a <= b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sumOf(3, 5) = " + sumOf(3, 5));
        System.out.println("sumOf(6, 4) = " + sumOf(6, 4));
    }
}
