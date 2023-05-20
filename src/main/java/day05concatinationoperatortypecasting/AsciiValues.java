package day05concatinationoperatortypecasting;

public class AsciiValues {

	public static void main(String[] args) {

		/*
		Java da her karakterin sayisal bir degeri vardir.
		Bu degerler ASCII degerler olarak adlandirilir.
		Bu degerlerin tamaminin bulundugu tabloya ASCII table denir.
		 */


		// Herhangi bir charcter in ASCII degerini bulmak icin o character i "int" data type inda bir variable in icine koyunuz.
		char ch = 'A' ;
		System.out.println(ch); //A

		int k = 'A' ;
		System.out.println(k); //65

		int unlem = '!' ;
		System.out.println(unlem); //33

		int soru = '?' ;
		System.out.println(soru); //63


		char c1 = 'a' ;
		char c2 = '?' ;
		System.out.println(c1+c2);
		// Java da charlarin metamatiksel islemlerde kullanirsaniz, Java o char larin ASCII degerlerini kullanir.



	}

}
