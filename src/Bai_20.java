import java.util.Scanner;

public class Bai_20 {
    public static Scanner s=new Scanner(System.in);
    public static int[] taoMang(int n) {
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=i+1;
        }
        return a;
    }
    public static void sapXep(int[] a,int n) {
        int t=0;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n;j++){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
                for (int z:a){
                    System.out.print(z);
                }
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong tap hop: ");
        int n=s.nextInt();
        int[] a=taoMang(n);
        System.out.print("Ta co tap hop: ");
        for (int i:a){
            System.out.print(i);
        }
        System.out.print("\nCac hoan vi cua tao hop");
        sapXep(a,n);

    }
}
