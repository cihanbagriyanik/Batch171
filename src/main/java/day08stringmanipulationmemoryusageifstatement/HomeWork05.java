package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class HomeWork05 {

	//5- Asagidaki kurallara gore kullacinin girdigi passwordu kontrol ediniz.
	//		a) En az 6 karakter olsun.
	//		b) En az bir tane buyuk harf olsun
	//		c) En az bir tane kucuk harf olsun
	//		d) En az bir tane rakam olsun

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Lutfen passwordunuzu giriniz...") ;
		String pass = input.nextLine() ;

		boolean a = pass.length()>5 ;
		System.out.println("En az 6 karakter var mi : " + a);


		boolean b = pass.replaceAll("[^A-Z]" , "").length()>0;
		System.out.println("En az bir buyuk harf var mi : " + b);


		boolean c = pass.replaceAll("[^a-z]" , "").length()>0;
		System.out.println("En az bir kucuk harf var mi : " + c);


		boolean d = pass.replaceAll("[^0-9]" , "").length()>0;
		System.out.println("En az bir rakam var mi : " + d);

		System.out.println(("Password gecerli mi : " + (a && b && c && d)));


	}

}
