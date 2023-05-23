package practicing.questionsrepeating;

public class Ternary02Repeat {

	public static void main(String[] args) {

		//Ornek 2 : verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
		//          -4 ==> -1 *-4  4 ==> 4       0 ==> 0

		int sayi1 = -4 ;
		System.out.println(sayi1<0 ? sayi1*-1 : sayi1);

		System.out.println("************************");

		//Ornek 3 : iki sayinin isarerti ayni ise bu sayilari carpan, isaretleri farkli ise
		//   farkli isaretli sayilari carpamiyorum mesaji veren kodu yaziniz

		int a = -3 ;
		int b = -3 ;

		System.out.println(a<0 && b<0 || a>0 && b>0 ? a*b : "farkli isaretli sayilari carpamiyorum");

		System.out.println("************************");

		// Ornek 4 : Size verilen sayinin 3 basamakali  olup olmadigini kontrol eden kodu yaziniz.

		int x = -333 ;

		x = Math.abs(x) ;

		System.out.println(x > 99 && x < 1000 ? "Sayi 3 basamaklidir..." : "Sayi 3 basamakli degildir...");
		//System.out.println(x < -99 && x > -1000 || x > 99 && x < 1000 ? "Sayi 3 basamaklidir..." : "Sayi 3 basamakli degildir...");

	}
}
