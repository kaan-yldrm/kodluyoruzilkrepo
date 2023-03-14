import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n1, n2, select;
		
		Scanner inputScanner = new Scanner(System.in);

        System.out.print("\nİlk Sayıyı giriniz : ");
        n1 = inputScanner.nextInt();
		
		System.out.print("\nİkinci Sayıyı giriniz : ");
        n2 = inputScanner.nextInt();
		
		
		System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
		System.out.print("\nSeçiminiz : ");
		
		select = inputScanner.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("Toplam : " + (n1 + n2));
				break;
			case 2:
				System.out.println("Çıkarma : " + (n1 - n2));
				break;
			case 3:
				System.out.println("Çarpma : " + (n1 * n2));
				break;
			case 4:
				System.out.println("Bölme : " + (n1 / n2));
				break;
			default:
				System.out.println("Lütfen 1, 2, 3 veya 4 sayılarından birini seçiniz.");
				break;
			
		}
	}
	
}
