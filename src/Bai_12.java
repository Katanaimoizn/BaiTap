import java.util.Scanner;

public class Bai_12 {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap x");
        double x = s.nextDouble();
        double saiSo = 0.001;
        double kq = 1;
        int n = 0;

        while (true) {
            double t = Math.pow(-1, n) * Math.pow(x, 2 * n ) / giaithua(2 * n );
            kq += t;

            if (Math.abs(t) < saiSo) {
                break;
            }

            n++;
        }

        System.out.println("Giá trị của chuỗi với độ chính xác epsilon = " + saiSo + " là: " + kq);
    }
    private static double giaithua(int n) {
        double kq = 1.0;
        for (int i = 1; i <= n; i++) {
            kq *= i;
        }
        return kq;
    }
}
