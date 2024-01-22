import java.util.Scanner;

public class Bai_36 {
    public static Scanner s=new Scanner(System.in);
    public static String chuanhoa(String txt){
        txt=txt.trim();
        txt=txt.replaceAll("\\s+"," ");
        txt=txt.toLowerCase();
        StringBuilder kq=new StringBuilder();
        boolean kt=true;
        for(char c:txt.toCharArray()){
            if(kt&&Character.isLetter(c)){
                kq.append(Character.toUpperCase(c));
                kt=false;
            }else {
                kq.append(c);
            }
            if(c=='.'){
                kt=true;
            }
        }
        return kq.toString();
    }
    public static void timTuDaiNhat(String txt){
        String[] a=txt.split(" ");
        int max=0;
        String t="";
        int d=0;
        for(String s: a){
            if(s.length()>max){
                max=s.length();
                t=s;
            }
        }
        System.out.print("Tu co do dai lon nhat la: "+t);
        System.out.print("\nVi tri: "+txt.indexOf(t));
    }

    public static void main(String[] args) {
        System.out.println(" nhap xau ky tu: ");
        String txt=s.nextLine();
        timTuDaiNhat(txt);

    }
}
