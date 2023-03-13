import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Mat, Fiz, Kim, TUr, Tar, Muz;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz");
        Mat = inputScanner.nextInt();

        System.out.println("Fizik notunuzu giriniz");
        Fiz = inputScanner.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        Kim = inputScanner.nextInt();

        System.out.println("Türkçe notunuzu giriniz");
        TUr = inputScanner.nextInt();

        System.out.println("Tarih notunuzu giriniz");
        Tar = inputScanner.nextInt();

        System.out.println("Müzik notunuzu giriniz");
        Muz = inputScanner.nextInt();

        int toplamPuan = (Mat + Fiz + Kim + TUr + Tar + Muz);

        int ortPuan = toplamPuan / 6;
        System.out.println("Ortalam Puan " + ortPuan);

        String basariDurumu = ortPuan > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(basariDurumu);
    }
}
