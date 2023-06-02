import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armutFiyat=2.14
              ,elmaFiyat=3.67
              ,domatesFiyat=1.11
              ,muzFiyat=0.95
              ,patlicanFiyat=5.0
              ,armutKilo
              ,elmaKilo
              ,domatesKilo
              ,muzKilo
              ,patlicanKilo
              ,toplamTutar;
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("\nKaç kilo Armut? : ");
        armutKilo = inputScanner.nextDouble();
        System.out.print("\nKaç kilo Elma? : ");
        elmaKilo = inputScanner.nextDouble();
        System.out.print("\nKaç kilo Domates? : ");
        domatesKilo = inputScanner.nextDouble();
        System.out.print("\nKaç kilo Muz? : ");
        muzKilo = inputScanner.nextDouble();
        System.out.print("\nKaç kilo Patlıcan? : ");
        patlicanKilo = inputScanner.nextDouble();

        toplamTutar = 
        (
          (armutKilo*armutFiyat) +
          (elmaKilo*elmaFiyat) +
          (domatesKilo*domatesFiyat) +
          (muzKilo*muzFiyat) +
          (patlicanKilo*patlicanFiyat)
        );
      
        System.out.printf("\nToplam Tutar : " + toplamTutar + " TL");
        
    }
}
  
