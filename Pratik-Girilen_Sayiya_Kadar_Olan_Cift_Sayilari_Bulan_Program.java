import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi, i;
        double A,a=0,s=0;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nGirilen Sayıya Kadar Olan Çift Sayıları Bulan Program");

        System.out.print("\nSayı Giriniz : ");
        sayi = inputScanner.nextInt();

        for (i = 0; i <= sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0){

                a++;
                s = s+i;
                System.out.println("s="+s);
                System.out.println("a="+a);
            }
        }
        A= s / a;
        System.out.print("\nOrtalama : " + A);
    }
}
