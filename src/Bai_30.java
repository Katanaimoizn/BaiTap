public class Bai_30 {
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
        for (int i=1000000;i<9999999;i++){
            if(SNT(i)){
                System.out.print(i+" ");
            }

        }
    }
    public static void InThuanNghich(){
        for (int i=1000000;i<9999999;i++){
            if (thuanNghich(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean allThuanNghich(int a){
        String str=Integer.toString(a);
        String[] b=str.split("");
        int tong=0;
        for (String i:b){
            int c=Integer.parseInt(i);
            tong+=c;
        }
        if(thuanNghich(tong)){
            return true;
        }
        return false;
    }
    public static void InAllThuanNghich(){
        for (int i=1000000;i<9999999;i++){
            if (allThuanNghich(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
//        InSNT();
//        InThuanNghich();
        InAllThuanNghich();
    }
}
