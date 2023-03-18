import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi=0, toplam=0;
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nGirilen Sayıya Kadar Olan Çift Sayıları Bulan Program");

        while ( sayi %2 == 0){
            System.out.print("\nSayı Giriniz : ");
            sayi = inputScanner.nextInt();

            if (sayi %2 == 1) break;
            if (sayi %4 == 0) toplam += sayi;

        }
        System.out.println("toplam= "+toplam);
    }
}
