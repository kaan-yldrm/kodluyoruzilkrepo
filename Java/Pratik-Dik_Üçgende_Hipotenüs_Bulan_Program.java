import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c;
        double u, A, C;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("1. kenar uzunluğu: ");
        a = inputScanner.nextInt();
        System.out.println("2. kenar uzunluğu: ");
        b = inputScanner.nextInt();
        System.out.println("3. kenar uzunluğu: ");
        c = inputScanner.nextInt();


        
        u = (a + b + c)/2;
        C = 2 * u;
        A = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        
        System.out.println("\nÜçgenin Çevresi: " + C);
        System.out.println("\nÜçgenin Alanı: " + A );
        
        
    }
}
  
