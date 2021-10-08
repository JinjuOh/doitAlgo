package chap01.practice;

public class SumForPrint {
    static int sumFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i==n)
                System.out.print(i + " = ");
            else
                System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(sum);
        return sum;
    }
    public static void main(String[] args) {
        sumFor(7);
    }
}
