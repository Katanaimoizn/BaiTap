import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai_1 {
    public static Scanner s=new Scanner(System.in);
    public static int UCLN(int a, int b){
        int u=Math.max(a,b);
        while(a!=b){
            if(u==a){
                a=u-b;
                u=b;
            }else{
                b=u-a;
                u=a;
            }
        }
        return u;
    }
    public static int BCNN(int a,int b){
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        int kq;
        int i=1;
        do{
           kq=min*i;
           i++;
        }while(kq%max!=0);
        return kq;
    }
    public static void main(String args[]){
        System.out.print("nhap vao so a:");
        int a=s.nextInt();
        System.out.print("Nhap vao so b:");
        int b=s.nextInt();
        System.out.println("uoc chung lon nhat la:"+UCLN(a,b));
        System.out.println("boi chung nho nhat la:"+BCNN(a,b));
    }
}
