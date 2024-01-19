import java.util.List;
import java.util.Scanner;

public class Bai_18 {
    public static Scanner s=new Scanner(System.in);
    public static void taoXau(String xau,int n){
        if(n==0){
            System.out.println(xau);
        }else{
            taoXau(xau+"0",n-1);
            taoXau(xau+"1",n-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập vào độ dài xâu nhị phân: ");
        int n=s.nextInt();
        System.out.println("Các xau nhị phân có độ dai "+n+" là: ");
        taoXau("",n);


    }
}
