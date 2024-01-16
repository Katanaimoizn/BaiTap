import java.util.Scanner;

public class Bai_3 {
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
            if(kiemtra(i)&&a%i==0){
                d++;
            }
        }
        int[] ar=new int[d];
        d=0;
        for(int i=2;i<a;i++){
            if(kiemtra(i)&&a%i==0){
                    ar[d++]=i;
            }
        }
        return ar;
    }
    public static void taphop(int n,int[] a){
        for(int i: a){
            while(n%i==0){
                System.out.print(i);
                n/=i;
                if(n>1){
                    System.out.print("x");
                }
            }

        }
    }

    public static void main(String[] args){
        System.out.println("Nhap so");
        int a=s.nextInt();
        if(kiemtra(a)){
            System.out.println("Ket qua: "+a);
        }
        int[] ar=Mang(a);
        taphop(a,ar);

    }
}
