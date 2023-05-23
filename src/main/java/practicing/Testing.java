package practicing;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {

		/* task 2
		 * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
		 * return eden metod yaziniz
		 *
		 * ornek:  input            output
		 *         elma  2           eaea
		 *         army  3           ayayay
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz...");
		String name = input.next();
		System.out.println("Lutfen 1 ile 10 arasinda bir sayi giriniz...");
		int num = input.nextInt();
		System.out.println(birlestir(name, num));
	}
	public static String birlestir(String a, int b){
		String firstAndLast = String.valueOf(a.charAt(0)) + String.valueOf(a.charAt(a.length()-1));
		System.out.println("Girilen kelimenin ilk ve son harfi : " + firstAndLast);
		return firstAndLast.repeat(b);
	}

}
