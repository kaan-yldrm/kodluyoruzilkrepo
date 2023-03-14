import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String userName, userPassword, passwordReset, newUserPassword;    
		
		Scanner inputScanner = new Scanner(System.in);

        System.out.print("\nKullanıcı Adınız : ");
        userName = inputScanner.nextLine();
		
		    System.out.print("\nŞifreniz : ");
        userPassword = inputScanner.nextLine();
		
		if( userName.equals( "patika" ) && userPassword.equals( "java123" ) ) {
			System.out.println("Giriş yaptınız!");
      
		}else {
			System.out.println("Bilgileriniz yanlış!");
			System.out.print("Şifrenizi sıfırlamak ister misiniz? ");
			passwordReset = inputScanner.nextLine();
    
			switch(passwordReset){
				case "Evet":
					System.out.print("Yeni bir şifre giriniz: ");
					newUserPassword = inputScanner.nextLine();
          
          
          if(newUserPassword.equals("java123")){
            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz");
          }else {
            System.out.print("Şifre oluşturuldu");
          }
         
					break;
				default :
					System.out.println("Lütfen tekrar deneyin");
					break;
			}		
	}
	}
}
