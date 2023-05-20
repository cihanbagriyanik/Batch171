package dev04mentorteam.task01;

import java.util.Scanner;

public class Answer02 {

	/* TASK Q02 :
	 * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
	 * return eden metod yaziniz
	 *
	 * ornek:  input            output
	 *         elma  2           eaea
	 *         army  3           ayayay
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz...");
		String name = input.next();


		String first = String.valueOf(name.charAt(0));
		String last = String.valueOf(name.charAt(name.length()-1));
		System.out.println("Girilen kelimenin ilk ve son harfi : " + first + last );
		String xx = String.valueOf(first + last);


		System.out.println("Lutfen 1 ile 10 arasinda bir sayi giriniz...");
		int num = input.nextInt();
		System.out.println(xx.repeat(num));



	}

}
