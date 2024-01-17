import java.util.Scanner;

public class Bai_11 {
    public static double TinhPI(double a) {
        double piXapXi = 0;
        double term = 1;
        int i = 0;

        while (Math.abs(term) > a) {
            piXapXi += term;
            i++;
            term = (i % 2 == 1) ? -1.0 / (2 * i + 1) : 1.0 / (2 * i + 1);
        }

        return 4 * piXapXi;
    }

    public static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println(" nhap vao sai so: ");
        double n = s.nextDouble();
        double kq=TinhPI(n);
        System.out.println("So pi dua vao sai so "+n+" la :"+kq);

    }
}
