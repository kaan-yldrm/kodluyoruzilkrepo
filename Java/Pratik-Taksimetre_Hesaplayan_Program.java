import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        
        double gidilenMesafe, taksiMetre, tutar, minTutar=20, acilisTutar=10 ;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Gidilen Mesafe: ");
        gidilenMesafe = inputScanner.nextDouble();

        taksiMetre = (gidilenMesafe * 2.20);
        tutar = (minTutar < taksiMetre) ? (acilisTutar + taksiMetre) : minTutar ;

        
       
        
        System.out.println("Taksimetre: " + taksiMetre + " TL");
        System.out.println("Gidilen Mesafe: " + gidilenMesafe + " km");
        System.out.println("Tutar: " + tutar + " TL");
    }
}
  
