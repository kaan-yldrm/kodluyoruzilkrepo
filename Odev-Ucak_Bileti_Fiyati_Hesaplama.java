import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int yas, yolculukTipi, mesafe, i=0;
        double normalTutar, yasIndirimi, indirimliTutar, toplamTutar = 0;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nUçak bileti tutarı hesaplayıcı");

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inputScanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inputScanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = inputScanner.nextInt();

        boolean travelCondition = (yas > 0)
                && (mesafe > 0)
                && ( (yolculukTipi == 1) || (yolculukTipi == 2) );



        if (travelCondition && yolculukTipi == 1){

            if (yas < 12) i = 1;                //12-, 50
            if (12 <= yas && yas <= 24) i = 2;  //12-24, 10
            if (yas > 65) i = 3;                // 65+, 30

            normalTutar = 0.1 * mesafe;

            yasIndirimi = switch (i) {
                case 1 -> normalTutar * 0.5;
                case 2 -> normalTutar * 0.1;
                case 3 -> normalTutar * 0.3;
                default -> 0.0;
            };

            indirimliTutar = normalTutar - yasIndirimi;
            toplamTutar = indirimliTutar;

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        } else if (travelCondition) {
            if (yas < 12) i = 1;                //12-, 50
            if (12 <= yas && yas <= 24) i = 2;  //12-24, 10
            if (yas > 65) i = 3;                // 65+, 30

            normalTutar = 0.1 * mesafe;

            yasIndirimi = switch (i) {
                case 1 -> normalTutar * 0.5;
                case 2 -> normalTutar * 0.1;
                case 3 -> normalTutar * 0.3;
                default -> 0.0;
            };

            indirimliTutar = normalTutar - yasIndirimi;
            toplamTutar = 2 * indirimliTutar * 0.8 ;

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        } else {
            System.out.println("Hatalı veri girdiniz!");
        }

    }
}
