package day14loops;

public class Loops02 {

	public static void main(String[] args) {

		// Ornek 1 : 5 den 8 e kadar tam sayilarin toplamini veren kodu yaziniz...
		// 5+6+7+8 ==> 26

		int sum1 = 0 ;

		for (int i = 5 ; i<9 ; i++){
			sum1 = sum1+i ;
		}
		System.out.println(sum1);


		// Ornek 2 : 7 den 9 a kadar tam sayilarin carpimini veren kodu yazizniz.
		// 7*8*9 = 504

		int sum2 = 1 ;

		for (int i = 7 ; i<10 ; i++){
			sum2 = sum2*i ;
		}
		System.out.println(sum2);


		// Ornek 3 : Verilen  bir tamsayinin rakamlarini toplamini bulan kodu yaziniz
		// 578 ==> 5+7+8 = 20

		int  toplam = 0 ;
		int n = -578 ;
		n = Math.abs(n) ;

		for(int i = n ; i > 0 ; i = i /10){
			toplam = toplam + i%10;
		}
		System.out.println(toplam);


	}
}
