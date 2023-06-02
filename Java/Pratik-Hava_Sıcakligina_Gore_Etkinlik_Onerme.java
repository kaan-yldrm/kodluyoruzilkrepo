import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = inputScanner.nextInt();

        if (heat < 5)                       { System.out.println("Kayak yap");
        }else if (heat >= 5 && heat < 15)   { System.out.println("Sinemaya git");
        }else if (heat >= 15 && heat < 25)  { System.out.println("Piknik yap");
        }else if (heat >= 25)               { System.out.println("Yüzmeye git");
        }
    }
}
