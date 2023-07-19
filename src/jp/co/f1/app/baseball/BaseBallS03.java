package jp.co.f1.app.baseball;

public class BaseBallS03 {

	public static void main(String[] args) {
		System.out.println("---野球ゲームプログラム開始---");
		int[] answer = new int[3];
		// ループ処理を追加し、正解数字がユニークになるまで、正解数字の生成と重複チェックを繰り返し行う
		while (true) {
			answer[0] = (int) (Math.random() * 9) + 1;
			answer[1] = (int) (Math.random() * 9) + 1;
			answer[2] = (int) (Math.random() * 9) + 1;

			System.out.println("3桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");

			if (answer[0] != answer[1] && answer[0] != answer[2] && answer[1] != answer[2]) {
				System.out.println("⇒ユニークです。");
				break;
			} else {
				System.out.println("重複しています。");
			}
		}

		System.out.println("---野球ゲームプログラム終了---");
	}

}
