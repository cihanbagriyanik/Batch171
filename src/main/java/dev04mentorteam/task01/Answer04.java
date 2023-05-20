package dev04mentorteam.task01;

import java.util.Scanner;

public class Answer04 {

	/* TASK Q04 :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
    */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen isim ve soyisminizi giriniz...");
		String name = input.nextLine();

		int spaceIndex = name.trim().indexOf(" ") ;
		
		String first = name.substring(0,spaceIndex) ;
		System.out.println(first);

		String last = name.substring(spaceIndex+1) ;
		System.out.println(last);


	}
}
