import java.util.Scanner;

public class Bai_16 {
    public static Scanner s = new Scanner(System.in);

    public static double chuViHinhTron(int r) {
        double kq = r * 2 * Math.PI;
        return kq;
    }

    public static double dienTichMatCau(int r) {
        double kq = 4 * r * r * Math.PI;
        return kq;
    }
    public static double theTichMatCau(int r) {
        double kq = (4  *Math.PI*(r * r * r ))/3;
        return kq;
    }

    public static double dienTichHinhTron(int r) {
        double kq = r * r * Math.PI;
        return kq;
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào bán kính");
        int r = s.nextInt();
        System.out.println("Diện tich đường tròn là: " + String.format("%.2f",dienTichHinhTron(r)));
        System.out.println("Chu vi đường tròn là: " + String.format("%.2f",chuViHinhTron(r)));
        System.out.println("Diện tích mặt cầu là: " + String.format("%.2f",dienTichMatCau(r)));
        System.out.println("Thể tích mặt cầu là: " + String.format("%.2f",theTichMatCau(r)));
    }
}
