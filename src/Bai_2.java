import java.util.Scanner;

public class Bai_2 {
    public static Scanner s=new Scanner(System.in);
    public static int Sum(String[] a){
        int[] ar=new int[a.length];
        int kq=0;
        for(int i=0;i<a.length;i++) {
            ar[i] = Integer.parseInt(a[i]) ;
        }
        for(int i: ar){
            kq=kq+i;
        }
        return kq;
    }

    public static void main(String args[]){
        System.out.println("Nhap vao day so");
        String a=s.nextLine();
        String[] ar=a.split("");
        System.out.println(Sum(ar));
    }
}
