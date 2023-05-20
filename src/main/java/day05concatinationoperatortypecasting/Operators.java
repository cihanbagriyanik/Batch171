package day05concatinationoperatortypecasting;

public class Operators {
	/*
	1- +, -, * , / islemleri javada metametik te kullanildigi gibi kullanilir.
		Note 1 - int / int ==> int olur.
		Note 2 - double + int ==> double olur.
		Cunku Javada matematiksel islemlerde farkli data type lari kullanilirsa sonuc her zaman buyuk data type inda olur.

	2- Java da "Logical Operator" lar vardir. AND ve OR islemleri "Logical Operator" lardir.
		i)   AND (&&) isleminden true alabilmek icin her sey true olmalidir.
		     AND islemi "perfectionist" tir.
		     AND islmeinde bir tane bile false sonucu false yapar.

		ii)  OR (||) isleminden true alabilmek icin birinin true olmasi yeterlidir.
			 OR isleminde sonucun false olamsi icin hersey false olmalidir.
			 OR islemi "polyana" gibidir.

		iii) NOT operator (!) true olani false, false olanide true yapar.
			 !true => false
			 !false => true
			 !!true => true

	3- Comparison (Karsilastirma) Operators
			<, >, <=(<+=), >=(>+=), ==(=+=), !=(!+=)
			Note: Karsilastirma operatorlerini kullanirsanizda kesinlikle boolean (true veya false) alirsiniz.
			NOte: Biz AND islemi icin && kullaniriz & kullanimda gecerlidir.
				  Farklari nedir ?
				  "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez, dolayisiyle hiyli calisir.
				  cunku and isleminde ilk ifade f ise degierlerinin ne oldugunun bir onemi yoktur sonuc false olur.
				  "&" kullanimi ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
				  Biz bu yuzden hep "&&" kullaniriz.
	 */


	public static void main(String[] args) {

		boolean first = 3<5 ;
		boolean second = 2+3!=5 ;
		boolean third = 2+3*5 >= 19 ;
		System.out.println(first + "-" + second + "-" + third); //true-false-false

		System.out.println(first&&second); //false
		System.out.println(first || second || third); //true



	}


}
