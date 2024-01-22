import java.util.Scanner;

public class Bai_27 {
    public static void dem(String str){
        String[] s=str.split(" ");
        System.out.println(s.length);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Nhập vào xâu ký tự: ");
        String str=s.nextLine();
        dem(str);
    }
}
