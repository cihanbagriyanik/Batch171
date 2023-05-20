package day10ifstatements;

import java.util.Scanner;

public class HomeWork01 {

	/*
	    HomeWork
		1- Kullanicidan alinan passwordun "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
			uygun mesaj gonderen kodu giriniz.
	*/

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen passwordunuzu giriniz...");
		String pwd = input.nextLine();

		boolean x = pwd.length()>6 ;
		System.out.println("En az 7 karakter var mi : " + x);

		boolean y = pwd.replaceAll("[^0-9]" , "").length()>0;
		System.out.println("En az bir rakam var mi : " + y);

		boolean z = pwd.replaceAll("[\\p{Punct}]" , "").length()>0;
		System.out.println("En az bir rakam var mi : " + z);



		System.out.println(("Password gecerli mi : " + (x && y && z)));



		}


	}




