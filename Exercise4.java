package jp.i2c.dev.中村貴大;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * クラスの説明
 * コンソールから文字列リスト（1行に1個ずつ）を入力の終わり（EOF）まで読み込んで、
そのリストを逆順に表示するプログラムを作成してください。
※入力の終わりを示すために、Unixでは「Ctrl+D」、Windowsでは「Ctrl+Z」を入力します
＜仕様＞
・入出力例外が発生した場合は、「入出力例外が発生しました」を表示して、処理を終了する
・結果として、「＜逆順リスト＞」のタイトルを表示する
 * @author 中村貴大
 *
 */
public class Exercise4 {
/**
 * 入力された値をリストに格納してソートして出力
 * @param args実行引数
 */
	public static void main(String[] args) {
      System.out.println("文字列リストを入力してください。");
    try(
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){

    	List<String> list = new ArrayList<>();//ここにすべての入力された値が入っている。
    	String inputStr;
    	//入力を受け付けてListに格納する。

			while ((inputStr = reader.readLine())!=null){


			list.add(inputStr);//入力値をListに追加する
			}//ループの範囲をしっかり決めることを忘れない。

			System.out.println("＜逆順リスト＞");
			Collections.reverse(list);//リストの中身を逆順にする
			list.forEach(s -> System.out.println(s));



		} catch (IOException e) {
		System.out.println("入出力例外が発生しました。");
		}
	}
}


