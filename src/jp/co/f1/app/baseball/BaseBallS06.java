package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS06 {

	static boolean checkDuplicate(int[] numberArray) {
		if (numberArray[0] != numberArray[1] && numberArray[0] != numberArray[2] && numberArray[1] != numberArray[2]) {
			System.out.println("⇒ユニークです。");
			;
			return true;
		} else {
			System.out.println("⇒重複しています。");
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("---野球ゲームプログラム開始---");
		System.out.println("");
		int[] answer = new int[3];
		Scanner sc = new Scanner(System.in);

		while (true) {
			answer[0] = (int) (Math.random() * 9) + 1;
			answer[1] = (int) (Math.random() * 9) + 1;
			answer[2] = (int) (Math.random() * 9) + 1;

			System.out.println("3桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");

			if (checkDuplicate(answer)) {
				// ストライク数を37行目で条件式に使用できるため、ここで初期化する
				int strike = 0;
				int count = 0;
				int[] playerNum = new int[3];
				// ストライク数が3になるまで、ゲームを繰り返すように
				while (strike != 3) {
					System.out.println("");
					System.out.print("3桁の数字を入力してください＞＞");
					String num = sc.nextLine();

					playerNum[0] = Integer.parseInt(num.substring(0, 1));
					playerNum[1] = Integer.parseInt(num.substring(1, 2));
					playerNum[2] = Integer.parseInt(num.substring(2));

					if (checkDuplicate(playerNum)) {
						// 挑戦回数をカウントする
						count++;
						// 毎回新しいストライク数をカウントするため、０を代入
						strike = 0;
						for (int i = 0; i < 3; i++) {
							if (playerNum[i] == answer[i]) {
								strike++;
							}
						}
						System.out.println("判定：" + strike + "ストライクです。");
					}
				}
				System.out.println(count + "回トライし、３桁数字を当てました。You Win!!");
				break;
			}
		}
		System.out.println("");
		System.out.println("---野球ゲームプログラム終了---");
	}

}
