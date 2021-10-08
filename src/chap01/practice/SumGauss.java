package chap01.practice;

public class SumGauss {
    static int sumGauss(int n) {
        int sum = 0;
        if(n%2==1)
            sum += (n/2)+1;
        for (int i = 1; i <= n/2; i++) {
            System.out.println(i + " + " + ((n-i)+1));
            sum += (i + (n-i)+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sumGauss(10) = " + sumGauss(10));
        System.out.println("sumGauss(9) = " + sumGauss(9));
    }
}
