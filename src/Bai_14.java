import java.util.Scanner;
 class PhanSo{
     int tu;
     int mau;

     public PhanSo(){

     }
     public PhanSo(int tu, int mau) {
         this.tu = tu;
         this.mau = mau;
     }

     public int getTu() {
         return tu;
     }

     public void setTu(int tu) {
         this.tu = tu;
     }

     public int getMau() {
         return mau;
     }

     public void setMau(int mau) {
         this.mau = mau;
     }
     public int UCLN(PhanSo a){
         int x=a.getTu();
         int y=a.getMau();
         while(x!=y){
             if(x>y){
                 x-=y;
             }else {
                 y-=y-x;
             }
         }
         return x;
     }
     public PhanSo rutGon(PhanSo a){
         int x=a.getTu();
         int y=a.getMau();
         x/=UCLN(a);
         y/=UCLN(a);
         a.setTu(x);
         a.setMau(y);
         return a;
     }

     public PhanSo Tong(PhanSo a,PhanSo b){
         PhanSo kq=new PhanSo();
         kq.tu=(a.getTu()* b.getMau())+(b.getTu()*a.getMau());
         kq.mau=(a.getMau()*b.getMau());
         rutGon(kq);
         return kq;
     }
     public PhanSo hieu(PhanSo a,PhanSo b){
         PhanSo kq=new PhanSo();
         kq.tu=(a.getTu()* b.getMau())-(b.getTu()*a.getMau());
         kq.mau=(a.getMau()*b.getMau());
         rutGon(kq);
         return kq;
     }
     public PhanSo Tich(PhanSo a,PhanSo b){
         PhanSo kq=new PhanSo();
         kq.tu=a.getTu()* b.getTu();
         kq.mau=a.getMau()*b.getMau();
         rutGon(kq);
         return kq;
     }
     public PhanSo Thuong(PhanSo a,PhanSo b){
         PhanSo kq=new PhanSo();
         kq.tu=a.getTu()*b.getMau();
         kq.mau=a.getMau()*b.getTu();
         rutGon(kq);
         return kq;
     }
     public PhanSo Tong(PhanSo a,PhanSo b,PhanSo c){
         PhanSo kq=new PhanSo();
         kq.tu=(a.getTu()* b.getMau()*c.getMau())+(b.getTu()*a.getMau()*c.getMau())+(c.getTu()*b.getMau()*a.getMau());
         kq.mau=(a.getMau()*b.getMau()*c.getMau());
         rutGon(kq);
         return kq;
     }
     public PhanSo hieu(PhanSo a,PhanSo b,PhanSo c){
         PhanSo kq=new PhanSo();
         kq.tu=(a.getTu()* b.getMau()*c.getMau())-(b.getTu()*a.getMau()*c.getMau())-(c.getTu()*b.getMau()*a.getMau());
         kq.mau=(a.getMau()*b.getMau()*c.getMau());
         rutGon(kq);
         return kq;
     }
     public PhanSo Tich(PhanSo a,PhanSo b,PhanSo c){
         PhanSo kq=new PhanSo();
         kq.tu=a.getTu()* b.getTu()* c.getTu();
         kq.mau=a.getMau()*b.getMau()*c.getMau();
         rutGon(kq);
         return kq;
     }
     public PhanSo Thuong(PhanSo a,PhanSo b,PhanSo c){
         PhanSo kq=new PhanSo();
         kq.tu=a.getTu()*b.getMau()*c.getMau();
         kq.mau=a.getMau()*b.getTu()*c.getTu();
         rutGon(kq);
         return kq;
     }
 }
public class Bai_14 {
    public static Scanner s = new Scanner(System.in);

    public static void menu(PhanSo p1,PhanSo p2){
        System.out.println("Nhap tuy chon");
        System.out.println("1.Cong");
        System.out.println("2.Tru");
        System.out.println("3.Nhan");
        System.out.println("4.Chia");
        System.out.println("0.thoat");
        int a=s.nextInt();
        switch (a){
            case 1:{
                PhanSo tong=new PhanSo();
                PhanSo kq=tong.Tong(p1,p2);
                System.out.println("Tong cua hai phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 2:{
                PhanSo hieu=new PhanSo();
                PhanSo kq=hieu.hieu(p1,p2);
                System.out.println("Tong cua hai phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 3:{
                PhanSo tich=new PhanSo();
                PhanSo kq=tich.Tich(p1,p2);
                System.out.println("Tong cua hai phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 4:{
                PhanSo Thuong=new PhanSo();
                PhanSo kq=Thuong.Thuong(p1,p2);
                System.out.println("Tong cua hai phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 0:{
                break;
            }
        }
    }
    public static void menu(PhanSo p1,PhanSo p2,PhanSo p3){
        System.out.println("Nhap tuy chon");
        System.out.println("1.Cong");
        System.out.println("2.Tru");
        System.out.println("3.Nhan");
        System.out.println("4.Chia");
        System.out.println("0.thoat");
        int a=s.nextInt();
        switch (a){
            case 1:{
                PhanSo tong=new PhanSo();
                PhanSo kq=tong.Tong(p1,p2,p3);
                System.out.println("Tong cua ba phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 2:{
                PhanSo hieu=new PhanSo();
                PhanSo kq=hieu.hieu(p1,p2,p3);
                System.out.println("Hieu cua ba phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 3:{
                PhanSo tich=new PhanSo();
                PhanSo kq=tich.Tich(p1,p2,p3);
                System.out.println("Tich cua ba phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 4:{
                PhanSo Thuong=new PhanSo();
                PhanSo kq=Thuong.Thuong(p1,p2,p3);
                System.out.println("Thương cua ba phan so la: "+kq.getTu()+"/"+kq.getMau());
                break;
            }
            case 0:{
                break;
            }
        }
    }

    public static void main(String args[]){
        System.out.println("Nhap tuy chon");
        System.out.println("1.tinh 2 phan so");
        System.out.println("2.tinh 3 phan so");
        System.out.println("0.thoat");
        int a=s.nextInt();
        switch (a){
            case 1:{
                System.out.println("Nhap phan so thu nhat");
                System.out.print("Nhap tu");
                int a1=s.nextInt();
                System.out.print("Nhap mau");
                int b1=s.nextInt();
                PhanSo p1=new PhanSo(a1,b1);
                System.out.println("Nhap phan so thu hai");
                System.out.print("Nhap tu");
                int a2=s.nextInt();
                System.out.print("Nhap mau");
                int b2=s.nextInt();
                PhanSo p2=new PhanSo(a2,b2);
                menu(p1,p2);

            }
            case 2:{
                System.out.println("Nhap phan so thu nhat");
                System.out.print("Nhap tu");
                int a1=s.nextInt();
                System.out.print("Nhap mau");
                int b1=s.nextInt();
                PhanSo p1=new PhanSo(a1,b1);
                System.out.println("Nhap phan so thu hai");
                System.out.print("Nhap tu");
                int a2=s.nextInt();
                System.out.print("Nhap mau");
                int b2=s.nextInt();
                PhanSo p2=new PhanSo(a2,b2);
                System.out.println("Nhap phan so thu ba");
                System.out.print("Nhap tu");
                int a3=s.nextInt();
                System.out.print("Nhap mau");
                int b3=s.nextInt();
                PhanSo p3=new PhanSo(a3,b3);
                menu(p1,p2,p3);
            }
            case 0:{
                break;
            }
        }

        String n= s.nextLine();


    }

}
