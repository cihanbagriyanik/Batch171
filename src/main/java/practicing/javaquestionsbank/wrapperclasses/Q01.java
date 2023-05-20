package practicing.javaquestionsbank.wrapperclasses;

public class Q01 {

	// Soru 1) Byte data t!p!n!n m!n!mum deger! !le short data t!p!n!n maks!mum deger!n!n toplamını
	//         bulmak !ç!n b!r kod yazınız.

	public static void main(String[] args) {

		byte minByte = Byte.MIN_VALUE ;
		System.out.println("minByte = " + minByte);

		short maxShort = Short.MAX_VALUE ;
		System.out.println("maxShort = " + maxShort);

		System.out.println("Toplam = " + ( minByte + maxShort ));

	}


}
