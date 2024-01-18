import java.util.Scanner;

public class Bai_17 {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập vào a: ");
        int a=s.nextInt();
        System.out.println("Nhập vào b: ");
        int b=s.nextInt();
        System.out.println("Nhập vào c: ");
        int c=s.nextInt();
        double d=b*b-4*a*c;
        if(d<0){
            System.out.println("Phương trình vô nghiệm");
        }else if(d==0){
            System.out.printf("Phương trình có nghiệm kép x="+(-b/(2*a)));
        }else{
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1="+((-b+Math.sqrt(d))/(2*a)));
            System.out.println("x1="+((-b-Math.sqrt(d))/(2*a)));
        }
    }
}
