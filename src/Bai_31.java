import java.util.Scanner;

public class Bai_31 {
    public static void In(int[] a){
        String str="";
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void cauA(int[] a){
        int m=0;
        int vt1=0;
        int vt2=0;
        int n=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]>m){
                m=a[i];
                vt1=i;
            }
        }for (int i=0;i<a.length-1;i++){
            if(a[i]>n&&a[i]<m){
                n=a[i];
                vt2=i;
            }
        }
        System.out.println("\nPhần tử lớn nhất trong mảng là: "+m+" ở vị trí: "+(vt1+1));
        System.out.println("Phần tử gần lớn nhất trong mảng là: "+n+" ở vị trí: "+(vt2+1));

    }
    public static void cauB(int[] a){
        int max=0;
        for
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        do {
            System.out.println("Nhâp số phần tử có trong mảng(0-100): ");
             a=s.nextInt();
        }while (a>100);
        int[] mang=new int[a];
        System.out.println("Nhập vào giá trị cho từng phần tử:");
        int d=0;
        for (int i=0;i<mang.length-1;i++){
            System.out.print("A["+i+"]=");
            mang[i]=s.nextInt();
        }
        In(mang);
        cauA(mang);
    }
}
