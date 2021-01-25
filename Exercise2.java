package jp.i2c.dev.中村貴大;
/**
 * 九九表を表示するプログラムを作成
 * @author nakamura
 *
 */
public class Exercise2 {
private static final int MIN = 1;
private static final int MAX = 9;
	public static void main(String[] args) {

		 System.out.println("  1 2 3 4 5 6 7 8 9");
		 System.out.println(" ------------------");
		for (int i = Exercise2.MIN; i <= Exercise2.MAX; i++) {
			  System.out.print("" +i+ "|");//この位置に入る
			  for (int j = 1; j <= 9; j++) {
			    System.out.printf(i * j + " ");
			  }
			  System.out.println("");
			}
	}

}
