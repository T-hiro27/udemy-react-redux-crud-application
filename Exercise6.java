package jp.i2c.dev.中村貴大;

import java.util.ArrayList;
import java.util.List;

/**
 * 数値のリスト（java.util.List）を受け取って、その合計を返すメソッド「sum」を作成してください。
 * sumメソッドを使用して、以下の問題を解いてください。 ・以下の値を要素とするリストの合計を求める 25 9 11 74 36 52 7 19
 * ・1から1000までの合計を求める ＜クラス・メソッド作成＞ ・リストの合計を求める「sum」メソッドを作成してください。
 * ・sumメソッドはメインメソッドから呼び出してください。 ＜仕様＞ ・結果として、「■ 出力例」に記載の内容を表示する 数値リスト[25 9 11 74
 * 36 52 7 19]の合計 : 233 1から1000の合計 : 500500
 * 
 * @author nakamura
 *
 */
public class Exercise6 {
	private static final int MIN = 1;
	private static final int MAX = 1000;

	/**
	 * 数値のリストを受け取って、合計値を求める。
	 * 
	 * @param listNum
	 *            数値リスト
	 * @return sum 合計値
	 */
	public static int Sum(List<Integer> listNum) {
		return listNum.stream().mapToInt(sum -> sum).sum();

	}

	/**
	 * ・処理を分割して、アプリケーションロジックを組み立てる手法を学ぶ。 ・数値リストの生成方法を検討して、Javaでどのような実装が可能かを検討する。
	 * ・発展課題として、Java SE8から実装されたjava.util.List#forEachやラムダ式を 学習できると良いと思います。
	 * ・課題1同様、条件(課題6ではリストの個数など)が追加された場合などの 拡張しやすさを検討できると良いと思います。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		// 以下のリストをlist１という変数に格納する。
		list1.add(25);
		list1.add(9);
		list1.add(11);
		list1.add(74);
		list1.add(36);
		list1.add(52);
		list1.add(7);
		list1.add(19);
		// 1~1000までの値までループ
		for (int i = Exercise6.MIN; i <= Exercise6.MAX; i++) {
			list2.add(i);// リスト2に1000までの値を追加

		}
		// 出力
		System.out.println("数値リスト" + list1 + "の合計:" + " " + Sum(list1));
		System.out.println("1~1000の合計:" + " " + Sum(list2));

	}

}
