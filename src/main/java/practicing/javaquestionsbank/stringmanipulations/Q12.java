package practicing.javaquestionsbank.stringmanipulations;

public class Q12 {

	//B!r Str!ng’ !n basında büyük harf ve sonunda nokta olup olmadıgını kontrol etmek !ç!n kod
	//yazınız.
	//Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
	//‘ali.’ için kodunuz konsolda false yazdırmalıdır
	//‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
	//‘Ali.’ için kodunuz konsolda true yazdırmalıdır
	//‘ALI.’ için kodunuz konsolda true yazdırmalıdır

	public static void main(String[] args) {

		String name = "Cihan." ;

		char ilkKrk = name.trim().charAt(0);
		char sonKrk = name.trim().charAt(name.length()-1);
		Boolean ilkKrkBuyukMu = ilkKrk >='A' && ilkKrk <='Z';
		Boolean sonKrkNoktaMi= sonKrk =='.';
		Boolean ilkKrkBuyukSonKrkNoktaMi = ilkKrkBuyukMu && sonKrkNoktaMi;
		System.out.println("Ilk karakter buyuk harf, son karakter nokta mi? "+ilkKrkBuyukSonKrkNoktaMi);




	}
}
