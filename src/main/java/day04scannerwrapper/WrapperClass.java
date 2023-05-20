package day04scannerwrapper;

public class WrapperClass {

	public static void main(String[] args) {

		// Primitive     : char      - boolean - byte - short - int     - long - float - double
		// Wrapper Class : Character - Boolean - Byte - Short - Integer - Long - Float - Double


		// Wrapper Class lar non-primitive dir. O yuzden memory decok yer kaplarlar.
		// O yuzden sart degilse Wrapper Class kullanmayi tercih etmeyiz.

		// n yazip nokta koyarsak eger hic method goremezsiniz, cunku primitiveler method icermez.
		int n = 12 ;


		// m yazip nokta koyarsak eger bir cok method gorursunuz, cunku wrapper classlar method icerir.
		Integer m = 12 ;

		byte p = 13;

		Byte r = 13;


		// Ornek 1 : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz.
		short maxShort = Short.MAX_VALUE;
		System.out.println("maxShort = " + maxShort);//maxShort = 32767

		short minShort = Short.MIN_VALUE;
		System.out.println("minShort = " + minShort);//minShort = -32768


		// Ornek 2 : int data type inin min degeri ile byte data type nin max degerleri toplamini bulunuz.
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("maxByte = " + maxByte );

		int minInt = Integer.MIN_VALUE;
		System.out.println("minInt = " + minInt);

		System.out.println("Toplami = " + (maxByte+minInt));


		// Ornek 3 : Primitive int i Wrapper Integer a ceviriniz. (AutoBoxing)
		int num = 3 ;
		Integer WraperNum = num ;
		// WraperNum.   ....


		// Ornek 4 : Wrapper Byte i Primitive byte a ceviriniz (Unboxing)
		Byte k = 19 ;
		byte primitiveK = k ;
		// primitiveK.   ....


		// Ornek 5 : Primitive char i Wrapper Chractere ceviriniz. (AutoBoxing)
		char x = '5' ;
		Character wrapperX = x ;


		// Ornek 6 : Wrapper boolean i primitive booleana ceviriniz. (Unboxing)
		Boolean a = true ;
		boolean primitiveBoolean = a ;

	}
}
