import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int dogumYili, zodyakYili;
        String hayvan = "";

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nÇin Zodyağı değerini hesaplayan program");

        System.out.print("\nDoğum Yılınızı Giriniz : ");
        dogumYili = inputScanner.nextInt();

        zodyakYili = dogumYili % 12;

        switch (zodyakYili) {
            case 0 -> hayvan = "Maymun";
            case 1 -> hayvan = "Horoz";
            case 2 -> hayvan = "Köpek";
            case 3 -> hayvan = "Domuz";
            case 4 -> hayvan = "Fare";
            case 5 -> hayvan = "Öküz";
            case 6 -> hayvan = "Kaplan";
            case 7 -> hayvan = "Tavşan";
            case 8 -> hayvan = "Ejderha";
            case 9 -> hayvan = "Yılan";
            case 10 -> hayvan = "At";
            case 11 -> hayvan = "Koyun";
                    }
        System.out.println("\nÇin Zodyağı Burcunuz : " + hayvan);
    }
}
