import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai_39 {
    public static Scanner s=new Scanner(System.in);
    public static void a(int[][] c,int n){
        int[] tong=new int[n*2+2];
        int d=0;
        tong[n*2+1]=0;
        tong[n*2]=0;
        tong[d]=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tong[d]+=c[i][j];
                if(i==j){
                    tong[n*2+1]+=c[i][j];
                }
                if(i+j==n-1){
                    tong[n*2]+=c[i][j];
                }
            }
            d++;
        }
        int s=n;
        tong[s] =0;
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if (s<n*2){
                    tong[s]+=c[i][j];
                }
            }
            s++;
        }
        int max=0;
        for (int i:tong){
            if(i>max)
                max=i;
        }
        System.out.print(max);
    }
    public  static void In(int[][] a){
        for(int[] i:a){
            for(int j:i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
    public  static void b(int[][] a,int n){
        int[][] b=new int[n][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++) {
                b[j][i]=a[i][j];
            }
        }
        In(b);
    }
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("Nhập cấp sủa ma trận:");
        int n=s.nextInt();
        int [][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=random.nextInt(99)+10;
            }
        }
        In(a);
        System.out.print("Hàng, cột hoặc đường chéo có tổng các phần tử lớn nhất:");
        a(a,n);
        System.out.println("\n Chuyển vị của ma trận:");
        b(a,n);

    }
}
