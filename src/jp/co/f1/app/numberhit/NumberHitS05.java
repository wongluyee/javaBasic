package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS05 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("ゲーム開始");
//		int answerNum = (int) (Math.random() * 9);
//
//		while (true) {
//			System.out.println("0から9までの予想の数字を入力＞＞");
//			int playerNum = sc.nextInt();
//
//			// 999が入力されるとゲーム終了
//			if (playerNum == 999) {
//				System.out.println("→999が入力されたためゲームを終了します。");
//				break;
//			// 0以下や9以上の場合、エラーが出ます
//			} else if (playerNum < 0 || playerNum > 9) {
//				System.out.println("→エラー！！0から9の数字ではありません。");
//			} else if (playerNum == answerNum) {
//				System.out.println("→!!大当たり!!");
//				break;
//			} else if (playerNum > answerNum) {
//				System.out.println("→正解数字は" + playerNum + "より小さいです。");
//			} else if (playerNum < answerNum) {
//				System.out.println("→正解数字は" + playerNum + "より大きいです。");
//			}
//		}
//
//		System.out.println("ゲーム終了");
		int[][] num = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		int i = 0;
		label: while (true) {
			int j = 0;
			while (j < 3) {
				System.out.print(num[i][j]);
				j++;
				if (i == 1)
					break label;
			}
			i++;
		}
	}

}
