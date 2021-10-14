package chap01.practice;

public class Multi99TableWithLine {
    public static void main(String[] args) {

        for (int i = -1; i <= 9; i++) {
            if (i == -1) {
                System.out.printf("%3s", "|");
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%3d", j);
                }
            } else if (i == 0) {
                System.out.printf("%3s", "--+");
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%3s", "---");
                }
            } else {
                for (int j = -1; j <= 9; j++) {
                    if ( j == -1) {
                        System.out.printf("%2d", i);
                    } else if(j==0) {
                        System.out.printf("%s", "|");
                    } else {
                        System.out.printf("%3d", i * j);
                    }
                }
            }
            System.out.println();
        }
    }
}
