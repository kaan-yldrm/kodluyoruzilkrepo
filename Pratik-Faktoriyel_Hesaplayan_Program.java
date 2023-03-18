import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayiN,sayiR,sayiNr, i, faktorN=1, faktorR=1, faktorNr=1;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nGirilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program");

        System.out.print("\nN Giriniz : ");
        sayiN = inputScanner.nextInt();

        System.out.print("\nR Giriniz : ");
        sayiR = inputScanner.nextInt();

        sayiNr = sayiN - sayiR;

        for (i = 1; i <= sayiN; i++ ){
            faktorN = faktorN * i;
             }
        for (i = 1; i <= sayiR; i++ ){
            faktorR = faktorR * i;
        }
        for (i = 1; i <= sayiNr; i++ ){
            faktorNr = faktorNr * i;
        }

        int faktor = faktorN / (faktorR * faktorNr);

        System.out.println("toplam= "+ faktor);
    }
}
