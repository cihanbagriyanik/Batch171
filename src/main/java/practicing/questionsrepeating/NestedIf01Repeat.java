package practicing.questionsrepeating;

import java.util.Scanner;

public class NestedIf01Repeat {

	/*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
    */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;

		System.out.println("Lutfen cinsiyetinizi giriniz..." +
				"\nLutfen kadin icin 'k', erkek 'e' giriniz... " );
		String cinsiyet = input.next() ;

		System.out.println("Lutfen yasinizi giriniz...");
		int yas = input.nextInt();

		if (yas < 0 || yas > 120){
			System.out.println("Lutfen 0 ile 120 arasinda bir deger giriniz...");
		} else if (cinsiyet.equalsIgnoreCase("k")) {
			if (yas>60){
				System.out.println("Emekle olabilirsiniz...");
			} else if (yas<=60) {
				System.out.println("Emekli olamazsiniz... Daha calismaniz gerekiyor...");
			}
		} else if (cinsiyet.equalsIgnoreCase("e")) {
			if (yas>65){
				System.out.println("Emekle olabilirsiniz...");
			} else if (yas<=65) {
				System.out.println("Emekli olamazsiniz... Daha calismaniz gerekiyor...");
			}
		}else {
			System.out.println("Gecersiz bir veri girdiniz...");
		}


	}
}
