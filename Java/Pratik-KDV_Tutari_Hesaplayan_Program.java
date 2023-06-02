import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdvTutar, toplamTutar;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz");
        tutar = inputScanner.nextDouble();

        double kdvOrani = 1000.0 < tutar  ? 0.08 : 0.18 ;
      
        kdvTutar = tutar * kdvOrani;
        toplamTutar = tutar + kdvTutar;
        
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOrani);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + toplamTutar);
    }
}
  
