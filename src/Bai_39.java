import java.util.Random;
import java.util.Scanner;

public class Bai_39 {
    public static Scanner s=new Scanner(System.in);
    public static void a(int[][] c,int n){
        int[] tong=new int[n*2+2];
        int d=0;
        tong[n*2+1]=0;
        tong[n*2]=0;
        for(int i=0;i<n;i++){
            tong[d]=0;
            for(int j=0;j<n;j++){
                tong[d]+=c[i][j];
                if(i==j){
                    tong[n*2+1]+=c[i][j];
                }
                if(i+j==n){
                    tong[n*2]+=c[i][j];
                }
            }
            d++;
        }
        for (int i:tong){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("Nhập cấp sủa ma trận:");
        int n=s.nextInt();
        int [][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Nhập a["+i+"]["+j+"]");
                a[i][j]=random.nextInt(99)+10;
            }
        }
        for(int[] i:a){
            for(int j:i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println("Hàng, cột hoặc đường chéo có tổng các phần tử lớn nhất:");
        a(a,n);
    }
}
