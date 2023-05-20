package practicing.javaquestionsbank.wrapperclasses;

public class Q02 {

	//2) Data t!p! Str!ng olan “103” deger!n! byte data t!p!ne dönüstürmek !ç!n b!r kod yazınız ve
	//   y!ne data t!p! Str!ng olan “2351” deger!n! short data t!p!ne dönüstürüp konsolda !k!
	//   deg!sken arasındak! farkı yazdırınız.

	public static void main(String[] args) {

		byte num1 = Byte.valueOf("103") ;
		short num2 = Short.valueOf("2351") ;

		System.out.println("Iki degisken arasindaki fark = " + (num1 - num2));

	}

}
