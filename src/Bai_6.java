import java.util.Scanner;

public class Bai_6 {
    public static Scanner s=new Scanner(System.in);
    public static int fib(int a){
        if(a==1||a==2)
        return 1;
        else {
            int trc = 1;
            int sau = 1;
            int tam = 0;
            for (int i = 2; i < a; i++) {
                tam = sau;
                sau = trc + sau;
                trc = tam;
            }
            return sau;
        }
    }
    public static void main(String args[]){
        System.out.println("Nhap so");
        int a=s.nextInt();
        System.out.println("So fib thu "+a+" la: "+fib(a));

    }
}
