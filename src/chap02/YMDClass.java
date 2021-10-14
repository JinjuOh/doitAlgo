package chap02;

public class YMDClass {

    // 각 달의 일수
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},  // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},  // 윤년
    };

    // 서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static class YMD {
        int y;  // 년
        int m;  // 월
        int d;  // 일

        public YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD after(int n) {
            d = d+n;
            while (d>mdays[isLeap(y)][m-1]) {
                d = d - mdays[isLeap(y)][m-1];
                m++;
                if(m==12) {
                    m = 1;
                    y++;
                }
            }
            return this;
        }

        YMD before(int n) {
            n = n - d;
            while (n > mdays[isLeap(y)][m-2]) {
                n = n - mdays[isLeap(y)][m-2];
                m--;
                if(m==1) {
                    m = 12;
                    y--;
                }
            }
            return this;
        }

        @Override
        public String toString() {
            return "YMD{" +
                    "y=" + y +
                    ", m=" + m +
                    ", d=" + d +
                    '}';
        }
    }
    public static void main(String[] args) {
        YMD test = new YMD(2021, 10, 15);
        YMD after = test.before(365);
        System.out.println(after.toString());
    }
}
