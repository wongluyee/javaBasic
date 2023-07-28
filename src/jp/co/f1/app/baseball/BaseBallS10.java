package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS10 {

	private int randomArray[] = new int[3]; // 正解数字用のinteger型配列
	private int playerArray[] = new int[3]; // 予想数字用のinteger型配列

	/**
	 * 正解数字と予想数字の配列の各要素を0で初期化するコンストラクタ。
	 *
	 * @param なし
	 * @return なし
	 */
	public BaseBallS10() {
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = 0;
		}

		for (int i = 0; i < playerArray.length; i++) {
			playerArray[i] = 0;
		}
	}

	/**
	 * 0から9までのランダム値を3つ生成し正解数字用の配列の各要素に格納するメソッド。
	 *
	 * @param なし
	 * @return なし
	 */
	private void createRandomNumber() {
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 10);
		}
		System.out.println("3桁のランダム数字（正解数字）は" + randomArray[0] + randomArray[1] + randomArray[2] + "です。");
	}

	/**
	 * 引数で受け取ったinteger型配列の各要素に格納された値がユニークか重複しているかをチェックするメソッド。
	 *
	 * @param int型の配列
	 * @return boolean true(配列がunique) false(配列が重複)
	 */
	private boolean isUniqueArray(int[] tmpArray) {
		if (tmpArray[0] != tmpArray[1] && tmpArray[0] != tmpArray[2] && tmpArray[1] != tmpArray[2]) {
			System.out.println("⇒ユニークです。");
			return true;
		} else {
			System.out.println("⇒重複しています。");
			return false;
		}
	}

	/**
	 * 正解数字がユニークになるまでの繰り返す処理を行うメソッド。
	 *
	 * @param なし
	 * @return なし
	 */
	private void createUniqueRandomNumber() {
		while (true) {
			createRandomNumber();
			if (isUniqueArray(randomArray)) {
				break;
			}
		}
	}

	/**
	 * 正解数字の入力から入力やユニークのチェックまでの処理を行うメソッド。 1.キーボードを利用して予想数字を入力するします。
	 * 2.空文字、文字列、桁数などの入力チェックを行います。 3.予想数字を格納する配列に予想数字を1桁ずつ分解して格納します。
	 * 4.配列に格納された値の重複チェックを行います。 5.ユニークな3桁の数字が入力されるまで1から4の処理を繰り返します。
	 *
	 * @param なし
	 * @return なし
	 */
	private void createUniquePlayerNumber() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("3桁の数字を入力してください＞＞");
				String num = sc.nextLine();

				// 空文字の場合、以下のエラーメッセージを表示します
				if (num.equals("")) {
					System.out.println("何も入力されていません。ユニークな3桁の数字を入力してください。");
					continue;
				}

				// 3桁以外の桁数の数字が入力された場合、以下のエラーメッセージを表示します
				if (num.length() != 3) {
					System.out.println("3桁の数字ではありません。ユニークな3桁の数字を入力してください。");
					continue;
				}

				// 数字を各桁ごとに分解し、配列変数「playerNum」の各要素に格納します
				playerArray[0] = Integer.parseInt(num.substring(0, 1));
				playerArray[1] = Integer.parseInt(num.substring(1, 2));
				playerArray[2] = Integer.parseInt(num.substring(2));

				if (isUniqueArray(playerArray)) {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("文字が入力されました。ユニークな3桁の数字を入力してください。");
				continue;
			}
		}
	}

	/**
	 * 正解数字と予想数字の配列を比較し、ストライクの数をカウントするメソッド。
	 *
	 * @param なし
	 * @return ストライクの数
	 */
	private int countNumberOfStrikes() {
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			// 同じ桁の数字が同じの場合、strike++
			if (playerArray[i] == randomArray[i]) {
				strike++;
			}
		}
		return strike;
	}

	/**
	 * 正解数字と予想数字の配列を比較し、ボールの数をカウントするメソッド。
	 *
	 * @param なし
	 * @return ボールの数
	 */
	private int countNumberOfBalls() {
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			// 正解数字の配列と予想数字の配列を比較して、桁は異なるが数字が同じ場合にballカウントする
			for (int j = 0; j < 3; j++) {
				if (playerArray[i] != randomArray[i] && playerArray[i] == randomArray[j]) {
					ball++;
				}
			}
		}
		return ball;
	}

	/**
	 * 野球ゲーム全体の動作を管理するメソッド。
	 *
	 * @param なし
	 * @return なし
	 */
	public void playBaseballGame() {

		System.out.println("---野球ゲームプログラム開始---");

		// ユニークな正解数字の生成
		createUniqueRandomNumber();

		// トライ回数を格納する変数
		int numberOfTry = 0;

		while (true) {

			// ユニークな予想数字の生成
			createUniquePlayerNumber();

			// ストライク数のカウント
			int numberOfStrikes = countNumberOfStrikes();

			// ボール数のカウント
			int numberOfBalls = countNumberOfBalls();

			// ストライク・ボール数の表示
			System.out.println("判定：" + numberOfStrikes + "ストライク、" + numberOfBalls + "ボールです。");

			// トライ回数のカウント
			numberOfTry++;

			// ゲームの終了判定
			if (numberOfStrikes == 3) {
				break;
			}
		}

		// 終了メッセージの表示
		System.out.println("\n" + numberOfTry + "回トライし、3桁数字を当てました。You Win!!");

		System.out.println("\n---野球ゲームプログラム終了---");
	}

}