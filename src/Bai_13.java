public class Bai_13 {
    public static void main(String args[]) {
        System.out.print("Cac so thuan nghich co 6 chu so la: ");
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        for (int i = 0; i < 10; i++) {
            if (i != 0) {
                a = i;
                f = i;
                for (int j = 0; j < 10; j++) {
                    b = j;
                    e = j;
                    for (int p = 0; p < 10; p++) {
                        c = p;
                        d = p;
                        System.out.print("--"+a+""+b+""+c+""+d+""+e+""+f);
                    }
                }
            }

        }



    }
}
