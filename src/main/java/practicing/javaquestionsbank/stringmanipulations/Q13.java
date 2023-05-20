package practicing.javaquestionsbank.stringmanipulations;

public class Q13 {

	//Asagıdak! kosullar !ç!n b!r parolanın geçerl! olup olmadıgını kontrol etmek !ç!n kod yazınız;
	//S!fre bosluk karakter!nden farklı olacak sek!lde en az 8 karakter !çermel!d!r. S!frede en az 1
	//sembol olmalıdır.
	//Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
	//'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
	//'!1a23b4' için kodunuz konsolda false yazdırmalıdır.
	//'!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
	//'! a b 3 k' kodunuz konsolda false yazdırmalıdır.

	public static void main(String[] args) {

		String pass = "AbcdE0987?" ;

		boolean a = pass.length()>7 ;
		System.out.println("En az 8 karakter var mi : " + a);


		boolean b = pass.replaceAll("[^\\p{Punct}]", "").length()>0;
		System.out.println("En az bir sembol varmi : " + b);


		System.out.println(("Password gecerli mi : " + (a && b)));

	}
}
