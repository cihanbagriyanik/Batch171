package day13loops;

public class Loops02 {

	public static void main(String[] args) {

		//Ornek 1 : 21 den 180 a kdr hem 2 hemde 3 ile bolunebilen tam sayilari ekrana yazdriniz.

		for (int i = 21 ; i<181 ; i++ ){
			if (i%2==0 && i%3 ==0){
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + "**************");

		//Ornek 2 : Size verilen kucuk harfle yazilmis Stringin  index i cift sayi olan karakterlerini buyuk harfe donusturen kodu yaziniz.
		// ankara ==> ANK

		String s = "ankara" ;

		//            i <= s.lenght()-1
		for (int i = 0; i<s.length() ; i++){

			String ch = s.substring(i,i+1);

			if (i %2 == 0){
				System.out.print(ch.toUpperCase() + " ");
			}
		}

		System.out.println("\n" + "**************");

		// Ornek 3 : Vefrilen bir strgin ile ilk a harfinden onceki tum karakterleri konsola yazdiriniz
		// "I love Java" ==> "I love J"

		String s1 = "Tramway" ;

		for (int i  = 0 ; i<s1.length() ; i++){
			if (s1.charAt(i) == 'a'){
				break;
			}
			System.out.print(s1.charAt(i));
		}

		System.out.println("\n" + "**************");

		// Ornek 4 : Verilen bir stringde  son 'a' dan sonraki tum karakterileri ters sirada yazdirin..
		// "Germany" ==> yn

		String t = "Germany" ;

		for (int i = t.length() - 1; i >= 0 ; i--) {
			if (t.charAt(i) == 'a'){
				break;
			}
			System.out.print(t.charAt(i));
		}

	}
}
