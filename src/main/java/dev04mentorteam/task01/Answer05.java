package dev04mentorteam.task01;

import java.util.Scanner;

public class Answer05 {

	/* TASK Q05 :
       Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
       Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
    */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen ikinci isminizle beraber tam isminizi giriniz...");
		String fullName = input.nextLine();

		char first = fullName.trim().toUpperCase().charAt(0) ;

		char middle = fullName.trim().toUpperCase().split(" ")[1].charAt(0) ;

		char last = fullName.trim().toUpperCase().split(" ")[2].charAt(0) ;


		System.out.println(first + "." + middle + "." + last);


	}


}
