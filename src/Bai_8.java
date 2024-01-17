import java.util.Scanner;

public class Bai_8 {
    public static Scanner s=new Scanner(System.in);
    public static boolean kiemtra(int a){
        for(int i=2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static int Fib(int n){
        if(n==1||n==2)
           return 1;

        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String args[]){
        System.out.println("Nhap mot so tu nhien :");
        int n=s.nextInt();
        System.out.print("Cac so fibonacci nho hon "+n+" la so nguyen to la: ");

        for(int i=3;Fib(i)<n;i++){
            if(kiemtra(Fib(i))){
                System.out.print(Fib(i)+" ");
            }
        }

    }

}
