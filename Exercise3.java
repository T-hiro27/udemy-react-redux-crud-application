package jp.i2c.dev.中村貴大;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * コンソールから複数の数値（整数・実数）を受け取って、入力された数値の積を表示する プログラムを作成してください。
 *
 * @author nakamura
 *
 */
public class Exercise3 {
/**
 * 入力された値の積を求め、
 * @param args  実行時引数
 */
	public static void main(String[] args) {
		System.out.println("積を求める数値を入力してください");

		//標準入力を受け付ける箱を用意
		double product = 1.0;//初期値＝1.0
		String inputNum;//String型のinputnumという変数を宣言

		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
			while (!(inputNum = reader.readLine()).isEmpty()) { //文字列判定　空かどうか
	
				


					try {

						product *= Double.parseDouble(inputNum);//入力された値を受け取り、数値に変換して積を求める。
					} catch (NumberFormatException e) {//数値以外が出力された場合、この例外を処理して再入力を促す。
						//正規表現を使えるようになると、if文で分岐させると無駄な処理（例外処理など）をなくすことができる。tryに入ってcatchさせる前にパターンマッチ
						//を用いて数値の判定をさせる。
						System.out.println("数値を入力してください。");
					}
				}

			String formnum = String.format("%,.15g", product);//積された値に対して有効桁数を15桁と指定。
			if (formnum.indexOf('.') >= 0) {//0個以上ドットがあった場合、

				String formChangeNum = formnum.replaceAll("0*$", "").replaceAll("\\.$", "");//0とドットのすべてを空文字に変換（ダブルクォーテーション）
				System.out.println("入力された値の積 :" + formChangeNum);//結果出力
			}

		} catch (IOException e) {

			System.out.println("入出力例外が発生しました");
			System.exit(1);//異常終了
		}
	}
}
