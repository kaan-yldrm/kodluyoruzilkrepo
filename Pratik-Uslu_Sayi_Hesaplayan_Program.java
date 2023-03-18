import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi1, sayi2, i, toplam=0;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nPratik - Üslü Sayı Hesaplayan Program");

        System.out.print("\nTaban Sayısı Giriniz : ");
        sayi1 = inputScanner.nextInt();

        System.out.print("\nKuvvet Sayısı Giriniz : ");
        sayi2 = inputScanner.nextInt();

        for ( i=0; i <= sayi2; i++){
            toplam += sayi1 * sayi1;
        }

        System.out.println("Sonuç = "+ toplam );
    }
}
