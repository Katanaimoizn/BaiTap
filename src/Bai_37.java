import java.util.Scanner;

public class Bai_37 {
    public static  String suLyTen(String t){
        String[] txt=t.split( " ");
        String ten=txt[txt.length-1];
        String ho=txt[0];
        String dem="";
        for (String s:txt){
            if(s!=ho&&s!=ten){
                dem+=s+" ";
            }
        }
        return ten+" "+ho+" "+dem.trim();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String ht=s.nextLine();
        System.out.println("Tên hển thị: "+suLyTen(ht));

    }
}
