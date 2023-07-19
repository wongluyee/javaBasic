package jp.co.f1.app.baseball;

public class BaseBallS02 {

	public static void main(String[] args) {
		System.out.println("---野球ゲームプログラム開始---");
		int[] answer = new int[3];
		answer[0] = (int) (Math.random() * 9) + 1;
		answer[1] = (int) (Math.random() * 9) + 1;
		answer[2] = (int) (Math.random() * 9) + 1;

		System.out.println("3桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");

		// 配列内の各要素の値を比較して、ユニークか重複かのチェックを行います。
		if (answer[0] != answer[1] && answer[0] != answer[2] && answer[1] != answer[2]) {
			System.out.println("⇒ユニークです。");
		} else {
			System.out.println("重複しています。");
		}

		System.out.println("---野球ゲームプログラム終了---");
	}

}
