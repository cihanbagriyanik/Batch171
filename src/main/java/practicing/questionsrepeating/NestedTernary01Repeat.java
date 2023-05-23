package practicing.questionsrepeating;

import java.util.Scanner;

public class NestedTernary01Repeat {

	public static void main(String[] args) {
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */

		Scanner input = new Scanner(System.in) ;
		System.out.println("Lutfen bir yil giriniz...");
		int yil = input.nextInt();
		//int yil = 1800 ;
		System.out.println(yil%100 ==0 && yil%400 ==0 || yil%100 != 0 && yil%4==0 ? "Artik yil" : "Artik yil degil");

	}
}
