package day14loops;

public class Loops01 {

	public static void main(String[] args) {

		// Ornek 1 : Verilen bir sitringi ters ceviren kodu yazini.
		// "java" ==> "avaJ"
		// 1.Yol
		String str1 = "Java" ;
		String ters1 = "" ;

		for (int i = str1.length()-1 ; i >=0 ; i-- ){
			ters1 = ters1 + str1.substring(i,i+1) ;
		}
		System.out.println(ters1);

		//2.Yol
		String str2 = "Java" ;
		String ters2 = "" ;

		for (int i = str2.length()-1 ; i >=0 ; i--){
			ters2 = ters2 + str2.charAt(i);
		}
		System.out.println(ters2);



		// Ornek 2 : Verilen bir sitringin  polindrome olup olmadigini kontrol eden kodu yazini.
		// nalan, ey edip adanada pide ye, 404

		String str3 = "Nalan" ;
		String ters3 = "";

		for (int i = str3.length()-1 ; i>=0 ; i--){
			ters3 = ters3 + str3.charAt(i);
		}

		if (str3.equalsIgnoreCase(ters3)){
			System.out.println(str3 + " : Polidrome dur...");
		} else {
			System.out.println(str3 + " : Polidrome degildir...");
		}




	}
}
