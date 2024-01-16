import java.util.Scanner;

public class Bai_5 {
    public static Scanner s=new Scanner(System.in);
    public static boolean kiemtra(int a){
        for(int i=2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("Nhap so");
        int a=s.nextInt();
        int i=0;
        int b=2;
        System.out.print(a+" so nguyen to dau tien la: ");
        do{
            if(kiemtra(b)) {
                System.out.print(b+" ");
                b++;
                i++;
            }
            else
                b++;
        }while (i<a);

    }
}
