package jp.co.f1.app.numberhit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberHitS07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 0~9からランダムにanswerNum変数に代入
		int answerNum = (int) (Math.random() * 10);
		System.out.println("ゲーム開始（正解数字：" + answerNum + ")");

		while (true) {
			try {
				System.out.println("0から9までの予想の数字を入力＞＞");
				int playerNum = sc.nextInt();

				// 999が入力されるとゲーム終了
				if (playerNum == 999) {
					System.out.println("→999が入力されたためゲームを終了します。");
					break;
					// 0以下や9以上の場合、エラーが出ます
				} else if (playerNum < 0 || playerNum > 9) {
					System.out.println("→エラー！！0から9の数字ではありません。");
				} else if (playerNum == answerNum) {
					System.out.println("→!!大当たり!!");
					break;
				} else if (playerNum > answerNum) {
					System.out.println("→正解数字は" + playerNum + "より小さいです。");
				} else if (playerNum < answerNum) {
					System.out.println("→正解数字は" + playerNum + "より大きいです。");
				}
			} catch (InputMismatchException e) {
				System.out.println("→エラー！！文字が入力されました。");
				sc.next();
			}
		}

		System.out.println("ゲーム終了");

	}

}
