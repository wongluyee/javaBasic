package jp.co.f1.app.baseball;

public class BaseBallS01 {

	public static void main(String[] args) {
		// 1. プログラム開始時に開始メッセージを表示します。
		System.out.println("---野球ゲームプログラム開始---");
		// 2. ランダムな3つの数字を格納する配列変数「answer」を宣言します。
		int[] answer = new int[3];
		// 3. Mathクラスのrandom()メソッドを利用して0から9までのランダムな数字を3つ生成します。
		// 4. 生成された数字は2）で作成した配列変数「answer」の各要素に代入します。
		answer[0] = (int) (Math.random() * 9) + 1;
		answer[1] = (int) (Math.random() * 9) + 1;
		answer[2] = (int) (Math.random() * 9) + 1;
		// 5. 実行結果を参考にして、配列変数「answer」の各要素に代入された数字をコンソール画面に表示します。
		System.out.println("3桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");
		// 6. ゲーム終了時に終了メッセージを表示します。
		System.out.println("---野球ゲームプログラム終了---");
	}

}
