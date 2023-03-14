import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        double kilo, boy, vkEndeksi;
      
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inputScanner.nextDouble();

        System.out.print("\nLütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inputScanner.nextDouble();
      
        vkEndeksi = kilo / (boy * boy);   
       
        
        System.out.printf("\nVücut Kitle Endeksiniz: " + "%3.2f" ,vkEndeksi);

        System.out.printf("\nVücut Kitle Endeksiniz: " + vkEndeksi);
        
    }
}
  
