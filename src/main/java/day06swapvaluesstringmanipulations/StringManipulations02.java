package day06swapvaluesstringmanipulations;

public class StringManipulations02 {

	public static void main(String[] args) {

		String s = "Learn Java earn money" ;

		//Ornek 1 : "s" String inin "money" ile bitip bitmedigini kontrol ediniz.
		boolean isEnd = s.endsWith("money") ;
		System.out.println(isEnd);//true


		// Ornek 2 : "s" String indeki "money" kelimesini "dollar" kelimesine ceviriniz.
		String replace = s.replace("money" , "dollar") ;
		System.out.println(replace);//Learn Java earn dollar


		// Ornek 3 : "s" String indeki "earn" kelimesini "win" kelimesine ceviriniz.
		String replace1 = s.replace(" earn" , " win") ;
		System.out.println(replace1);//Learn Java win money


		// Ornek 4 : "s" String indeki "a" harflerini "*" icon una ceviriniz.
		String replace2 = s.replace("a" , "*") ;
		System.out.println(replace2);//Le*rn J*v* e*rn money
		// Note : replace () methodunda coklu character ler icin calisirsaniz  mecbur cift tirnak kullanmaliyiz.
		//Ama tek character ile calisirsak ister cift tirnak veya tek tirnak kullanabiliriz.
		//Ya ikisi de cift tirnak yada ikiside tek tirnak olmalidir.


		// Ornek 5 : "s" String indeki "n" harflerini "XXX" harfine ceviriniz.
		String replace3 = s.replace("n" , "XXX") ;
		System.out.println(replace3);//LearXXX Java earXXX moXXXey


		// Ornek 6 : "s" String indeki tum "e" harflerini siliniz.
		String replace4 = s.replace("e","");
		System.out.println(replace4);//Larn Java arn mony



		String t = "Ali 13 yasindadir!..." ;

		// Ornek 7 :  String indeki tum rakamlari(0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz.

		//Note : Bir grup datayi ifade etmek icin "Regular Expressions (Regex) kullanilir.
		//Note : Bir grup datayi degistirmek icin replaceAll() kullanilir.
		//Note : Regex ifadesinde "^" isareti haric anlamina gelir.

		/*
		Meshur Regex ler
		1) Tum rakamlar ==> [0-9]
		2) Tum kucuk harfler ==> [a-z]
		3) Tum buyuk harfler ==> [A-Z]
		4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri   ==> \\p{Punct}
        7) Tum sesli Harfler          ==> [aeiouAEIOU]
        8) Tum x,q,w harfleri         ==> [xqw]
        9) Kucuk harflerden farkli tum characterler => [^a-z]
        10) Tum harflerden farkli tum characterler   =>[^a-zA-Z]
         */

		String t1=t.replaceAll("[0-9]","*");
		System.out.println(t1);//Ali ** yasindadir!...








	}
}


























