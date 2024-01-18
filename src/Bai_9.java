import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai_9 {
    public static Scanner s = new Scanner(System.in);
    public static boolean kiemtra(int a){
        for(int i=2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }

    public static void main(String arg[]) {
        System.out.println("Nhap so: ");
        int n = s.nextInt();
        int d=0;
        System.out.print("Tat ca cac uoc cua " + n + " la: ");
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                d++;
            }
        }
        System.out.print("\nco tat ca "+d+" uoc so cua "+n);
        System.out.print("\nTat ca cac uoc cua " + n + " la so nguyen to la: ");
        for (int i = 2; i < n; i++) {
            if (n % i == 0&&kiemtra(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
