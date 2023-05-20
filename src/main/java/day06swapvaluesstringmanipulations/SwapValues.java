package day06swapvaluesstringmanipulations;

public class SwapValues {

	public static void main(String[] args) {

		// Swap : Yer degistirmek

		// 1. Yol

		// 1 Kap : Patates - 2. kap Domates ==> swap => 1.Kap : Domates 2.Kap : Patates
		int a = 12 ;
		int b = 5 ;

		//Swaptan sonra a=5 , b=12
		int temp = 0; //3.Kap su an bos sonra aticaz.

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		//1.Adim
		temp = a;

		//2.Adim
		a = b ;

		//3.Adim
		b = temp ;

		System.out.println("a = " + a);
		System.out.println("b = " + b);



		// 2. Yol
		int elma = 12 ;
		int armut = 5 ;

		System.out.println("elma = " + elma);
		System.out.println("armut = " + armut);

		elma = elma + armut ;
		armut = elma - armut ;
		elma = elma - armut ;

		System.out.println("elma = " + elma);
		System.out.println("armut = " + armut);



	}
}
