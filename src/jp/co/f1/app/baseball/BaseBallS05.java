package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS05 {

	static boolean checkDuplicate(int[] numberArray) {
		if (numberArray[0] != numberArray[1] && numberArray[0] != numberArray[2] && numberArray[1] != numberArray[2]) {
			System.out.println("⇒ユニークです。");
			return true;
		} else {
			System.out.println("⇒重複しています。");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("---野球ゲームプログラム開始---");
		int[] answer = new int[3];
		Scanner sc = new Scanner(System.in);

		while (true) {
			answer[0] = (int) (Math.random() * 9) + 1;
			answer[1] = (int) (Math.random() * 9) + 1;
			answer[2] = (int) (Math.random() * 9) + 1;

			System.out.println("3桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");

			if (checkDuplicate(answer)) {
				while (true) {
					System.out.println("3桁の数字を入力してください＞＞");
					String num = sc.nextLine();

					int[] playerNum = new int[3];
					playerNum[0] = Integer.parseInt(num.substring(0, 1));
					playerNum[1] = Integer.parseInt(num.substring(1, 2));
					playerNum[2] = Integer.parseInt(num.substring(2));

					if (checkDuplicate(playerNum)) {
						// 正解数字の配列と予想数字の配列を比較して、桁と数字が同じ（ストライク）場合にカウントを行う
						int strike = 0;
						for (int i = 0; i < 3; i++) {
							if (playerNum[i] == answer[i]) {
								strike++;
							}
						}
						System.out.println("判定：" + strike + "ストライクです。");
						break;
					}
				}
				break;
			}
		}

		System.out.println("---野球ゲームプログラム終了---");
	}

}
