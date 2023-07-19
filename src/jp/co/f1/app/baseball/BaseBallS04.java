package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS04 {

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
					// Stringクラスのsubstring()メソッドを利用して入力した数字を各桁ごとに分解し、配列変数「playerNum」の各要素に格納します。
					int[] playerNum = new int[3];
					playerNum[0] = Integer.parseInt(num.substring(0, 1));
					playerNum[1] = Integer.parseInt(num.substring(1, 2));
					playerNum[2] = Integer.parseInt(num.substring(2));

					// 配列内の各要素の値を比較して、ユニークか重複かのチェックを行います。
					if (checkDuplicate(playerNum)) {
						break;
					}
				}
				break;
			}
		}

		System.out.println("---野球ゲームプログラム終了---");
	}

}
