package dev04mentorteam.task01;

import java.util.Scanner;

public class Answer03 {

	// TASK Q03 :
	// TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
	// TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz...");
		String data = input.nextLine();

		boolean result = data.contains(" ") ;
		System.out.println("Bosluk olma durumu = " + result);



	}


}
