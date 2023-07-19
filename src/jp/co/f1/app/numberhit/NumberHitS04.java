package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ゲーム開始");
		int answerNum = (int) (Math.random() * 9);

		while (true) {
			System.out.println("0から9までの予想の数字を入力＞＞");
			int playerNum = sc.nextInt();

			if (playerNum == 999) {
				System.out.println("→999が入力されたためゲームを終了します。");
				break;
			} else if (playerNum == answerNum) {
				System.out.println("→!!大当たり!!");
				break;
			} else if (playerNum > answerNum) {
				System.out.println("→正解数字は" + playerNum + "より小さいです。");
			} else if (playerNum < answerNum) {
				System.out.println("→正解数字は" + playerNum + "より大きいです。");
			}
		}

		System.out.println("ゲーム終了");
	}

}
