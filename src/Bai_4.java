import java.util.Scanner;

public class Bai_4 {
    public static Scanner s=new Scanner(System.in);
    public static boolean kiemtra(int a){
        for(int i=2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static int[] Mang(int a){
        int d=0;
        for(int i=2;i<a;i++){
            if(kiemtra(i)){
                d++;
            }
        }
        int[] ar=new int[d];
        d=0;
        for(int i=2;i<a;i++){
            if(kiemtra(i)){
                ar[d++]=i;
            }
        }
        return ar;
    }
    public static void main(String args[]){
        System.out.println("Nhap so");
        int a=s.nextInt();
        int[] ar=Mang(a);
        System.out.print("Cac so nguyen to nho hon "+a+" la: ");
        for (int i: ar){
            System.out.print(i+" ");
        }
    }
}
