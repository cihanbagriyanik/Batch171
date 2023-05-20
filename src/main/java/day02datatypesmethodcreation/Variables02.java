package day02datatypesmethodcreation;

public class Variables02 {

		/*
		Java da temelde 2 tip data vardir.
			1- primitive data type:
				char, boolean, byte, short, int, long, float, double
			2- non-primitive data type:
				String
		 */

		/*PRIMITIVE DATA TYPES
		Note 1 : primitive data typelerini java olusturmustur, biz olusturamayiz.
		Note 2 : primitive data typlerinin isimlerinde sadece kucuk harf kullanilir.
		Note 3 : primitive datalar data typelarine gore memoryde farkli farkli yer kaplarlar.
		Note 4 : primiteve datalar iclerinde SADECE sizin atadiginiz degeri barindirirlar.
		 */

			/*NON - PRIMITIVE DATA TYPES
		 Ornek => String ...
		   * Uretilen her bir Class ayni zamanda bir non-primitive data typedir.
		     Bu yuzden non-primitive data type lar sinirsiz sayida denilebilir.
		   * Non-primitive data typlerin isimleri buyuk harf ile baslar.
		   * Non-primitive ler icin java memoryde buyuklugune gore degisen boyutlarda yer ayirir.
		 */



	public static void main(String[] args) {

		// Ornek : Ulke ismi icin bir variable olusturun ve ekrana yazdirin.
		String ulkeIsmi = "Turkiye" ;
		System.out.println(ulkeIsmi);

		/*
		Interview Sorusu : "Privitive" ve "Non-primitive" data typleri arasindaki fark nedir?
	    1)  "primitive" ler sadece bizim atadigimiz degeri icerir
            "non-primitive" ler bizim atadigimiz degeri ve method lari icerir.
        2)  "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
        3)  "primitive" leri java uretmistir ve 8 tanedir,
            "non-primitive" leri java ve developerlar uretebilir, sinirsiz sayidadir
        4)  "primitive" ler memory de data typle larina gore sabit boyutta bellek kullanir
            "non-primitive"ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler
		 */

	}


}
