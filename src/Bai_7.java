import java.util.Scanner;

public class Bai_7 {
    public static Scanner s=new Scanner(System.in);
    public static boolean kiemtra(int a){
        for(int i=2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static int Sum(int a){
        String str=""+a;
        String[] ar=str.split("");
        int kq=0;
        for(int i=0;i<ar.length;i++){
            kq+=Integer.parseInt(ar[i]);
        }
        return kq;

    }

    public static void main(String args[]){
        System.out.println("Nhap tong ");
        int a=s.nextInt();
        int j=0;
        for(int i=10000;i<100000;i++){
            if(kiemtra(i)&&Sum(i)==a){
                j++;
            }
        }
        if(j==0){
            System.out.println("không có số nào thoa mãn điều kiện");
        }else{
            System.out.println("Tất cả các số nguyên tố có 5 chữ số có tông các phần tử có tổng bằng "+a+" là: ");
            for(int i=10000;i<100000;i++){
                if(kiemtra(i)&&Sum(i)==a){
                    System.out.print(" "+i+" -");
                    j++;
                }
            }
        }
    }
}
