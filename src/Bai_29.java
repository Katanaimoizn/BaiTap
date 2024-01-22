import java.sql.SQLOutput;

public class Bai_29 {
    public static boolean SNT(int a){
        if(a<2){
            return false;
        }
        for (int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean thuanNghich(int a){
        String str=Integer.toString(a);
        String[] b=str.split("");
        int h=b.length-1;
        boolean k=true;
        for (int i=0;i<b.length/2;i++){
            if(!b[i].equals(b[h])){
                k=false;
            }
            h--;
        }
        return k;
    }
    public static void InSNT(){
        for (int i=10000;i<9999999;i++){
            if(SNT(i)){
                System.out.print(i+" ");
            }

        }
    }
    public static void InThuanNghich(){
        for (int i=10000;i<9999999;i++){
            if (thuanNghich(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean allSNT(int a){
        String[] b=Integer.toString(a).split("");
        boolean k=true;
        for(String i:b){
            int c=Integer.parseInt(i);
            if(c<2){
                k= false;
            }
            for (int j=2;j<c;j++){
                if(c%j==0){
                    k= false;
                }
            }
        }
        return k;
    }
    public static void InAllSNT(){
        for (int i=10000;i<9999999;i++){
            if (allSNT(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
//        InSNT();
//        InThuanNghich();
        InAllSNT();
    }
}
