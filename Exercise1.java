package jp.i2c.dev.中村貴大;


/**
 *1から100までの数をコンソールに出力するプログラムを書け。
ただし3の倍数のときは｢Fizz｣と、5の倍数のときは｢Buzz｣と出力し、
3と5両方の倍数の場合には｢FizzBuzz｣と出力すること。

 *
 * @author Nakamura
 *
 */


public class Exercise1 {
	private static final int MIN = 1;
	private static final int MAX = 100;


	/**
	 *
	 * @param args 実行引数
	 */
	public static void main( String[] args) {

		for (int i = Exercise1.MIN; i <= Exercise1.MAX; i++) {

			  // 数字の出力
            System.out.print(i + " ");

            // 3の倍数の場合出力
            if (i%3 == 0) {
                System.out.print("Fizz");
            }
            // ５の倍数の場合出力
            if (i%5 == 0) {
                System.out.print("Buzz");
            }
            // 改行
            System.out.println();
       }
   }
}
