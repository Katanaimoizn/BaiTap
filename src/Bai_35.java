import java.util.Scanner;

public class Bai_35 {
    public static Scanner s=new Scanner(System.in);
    public static StringBuilder chuanhoa(String txt){
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
            if(c==' '){
               kt=true;
            }
        }
        return kq;
    }
    public static void main(String[] args) {
        System.out.println(" nhap xau ky tu: ");
        String txt=s.nextLine();
        System.out.println("Doan van ban da duoc chuan hoa: "+chuanhoa(txt));
    }
}
