import java.util.List;
import java.util.Random;
import java.util.Scanner;
//can lay thong tim xem có bao nhieu phan tu trong con (k);
//can xem c bao nhieu phan tu n
//
public class Bai_19 {
    public static Scanner s = new Scanner(System.in);

    public static void tapCon(String kq, int n, int k) {

        if (k == 0) {
            System.out.print("  "+kq);
        } else
        {
            for (int i=0;i<=n;i++){
                tapCon(kq+""+i,n,k-1);
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Nhập n:");
        int n = s.nextInt();
        for(int k=1;k<n;k++){
            System.out.print("\nCac tap con cua "+n+" co "+k+" phan tu la:");
            tapCon("", n,k);
        }
    }
}
