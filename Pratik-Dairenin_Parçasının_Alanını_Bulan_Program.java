import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        
        int r;
        double pi=3.14, a, A;
      
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Yarıçap giriniz: ");
        r = inputScanner.nextInt();

        System.out.println("Daire açısı giriniz: ");
        a = inputScanner.nextDouble();
      
        A = (pi * (r*r) * a) / 360;        
       
        
        System.out.println("\nDaire dilimi alanı: " + A);
        
    }
}
  
