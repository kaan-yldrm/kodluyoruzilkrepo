import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi, i;
        double toplam=0;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nGirilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program");

        System.out.print("\nSayı Giriniz : ");
        sayi = inputScanner.nextInt();

        for (i = 0; i <= sayi; i++ ){
            toplam += Math.pow(i,4) + Math.pow(i,5);
        }

        System.out.println("toplam= "+ toplam);
    }
}
