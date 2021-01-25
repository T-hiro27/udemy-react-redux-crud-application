package jp.i2c.dev.中村貴大;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 「names.txt」ファイルを読み込んで、名前が記載されている行数を表示する プログラムを作成してください。 ＜仕様＞
 * ・読み込みファイルが見つからないときは「ファイルが見つかりません」を表示して、処理を終了する
 * ・入出力例外が発生した場合は、「入出力例外が発生しました」を表示して、処理を終了する ・結果として、「＜出現回数＞」のタイトルと「氏名」「回数」を表示する
 *
 * @author 中村貴大
 *
 */
public class Exercise5 {

	/**
	 * エントリーセットを活用しマップの中を回して出力する。
	 *
	 * @param userMap
	 *            <名前,出現回数>
	 */

	public static void loopMap(Map<String, Integer> userMap)// userMapを受け取る（名前と出現回数）
	{
		for (Map.Entry<String, Integer> entry : userMap.entrySet()) {// ループ
			System.out.println(entry.getKey() + entry.getValue() + "回");// 名前と出現回数を出力

		}
	}

	/**
	 * キーとバリュー」の組み合わせ（Map）で扱うべき処理を学ぶ。 ⇒ 複数の値をまとめて扱う手法を検討して、適切な実装をすると良いと思います。
	 * ・入力ストリーム（バイトストリーム・キャラクターストリーム）の基礎を復習して、 ファイルから文字列を取得する手法を学ぶ。
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("../names.txt"));) {// テキストファイルの中身を読むためのもの
			Map<String, Integer> userMap = new HashMap<>();// マップの宣言、userMapに、key（名前）とvalue(何回出現したか)という情報が入っている。

			String name;// string型のnameという変数を宣言
			while ((name = reader.readLine()) != null) { // readlineで受け取った変数がnullじゃなかったらnameという変数に入れる。
				if (userMap.containsKey(name)) {// 指定したキー（name）が存在するか確認する
					userMap.put(name, userMap.get(name) + 1);//
				} else {
					userMap.put(name, 1);

				}

			}
			loopMap(userMap);
		} catch (Exception e) {

			System.out.println("ファイルが存在しませんでした。");
			System.exit(1);//ファイルがなかった場合、異常終了。

		}
	}

}
