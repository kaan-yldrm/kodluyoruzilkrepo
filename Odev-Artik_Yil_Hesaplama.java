import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int yil, i =0;
        String artikCondition = "";

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nArtık Yıl hesaplayan program");

        System.out.print("\nYıl Giriniz : ");
        yil = inputScanner.nextInt();

        if (yil % 400 == 0) i = 1;
        else if ((yil % 400 != 0) && (yil % 4 == 0)) i = 1;
        else if ((yil % 400 != 0) || (yil % 4 != 0)) i = 2;

        switch (i) {
            case 1 -> artikCondition = " bir artık yıldır !";
            case 2 -> artikCondition = " bir artık yıl değildir !";
        }
        System.out.println( yil + artikCondition);
    }
}
