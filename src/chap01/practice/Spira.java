package chap01.practice;

public class Spira {

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            int count = (i-1)*2+1;
            if(i!=n) {
                System.out.printf("%"+(n-i)+"s", " ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            int count = (i-1)*2+1;
            if(i!=n) {
                System.out.printf("%"+(n-i)+"s", " ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        spira(n);
        System.out.println();
        npira(n);
    }
}
