import java.util.Scanner;

public class Bai_28 {
    public static int max(int[][] a) {
        int max = 0;
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static void In(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

    }public static void InSNT(int[][] A,int n,int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (SNT(A[i][j])) {
                    System.out.print(A[i][j] + " ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println("\n");
        }

    }

    public static boolean SNT(int a) {
        if(a<2){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void sapXep(int[][] A,int n,int m){
        int[][] B=new int[n][m];
        int t=max(A);
        int c=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int d = 0; d < n; d++) {
                    for (int e = 0; e < m; e++) {
                        if(A[d][e]<t&&A[d][e]>c){
                            t=A[d][e];
                        }
                    }
                }
                B[j][i]=t;
                c=t;
                t=max(A);
            }
        }
        In(B);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập vào số dòng: ");
        int n = s.nextInt();
        System.out.println("Nhập vào số cột: ");
        int m = s.nextInt();

        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                do {
                    A[i][j] = s.nextInt();
                } while (A[i][j] > 100);
            }
        }
        In(A);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max(A));
        System.out.println("Các phần tử là số nguyên tố trong mảng là: ");
        InSNT(A,n,m);
        System.out.println("Sắp xếp các phần tử trong mảng tăng dần theo cột là: ");
        sapXep(A,n,m);
    }
}
