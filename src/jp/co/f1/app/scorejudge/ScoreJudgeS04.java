
package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS04 {

	public static void main(String[] args) {
		System.out.println("---点数評価プログラム開始---");

		Scanner sc = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		while (true) {
			System.out.print(">");
			String strScore = sc.nextLine();
			if (strScore.equals("q")) {
				if (count == 0) {
					System.out.println("-----サマリー-----");
					System.out.println("評価された人数が0名のためサマリーは表示しません。");
					System.out.println("------------------");
				} else {
					double average = (double) sum / count;
					System.out.println("-----サマリー-----");
					System.out.println(count + "名の成績を評価しました。");
					System.out.println("合計点は" + sum + "点です。");
					System.out.println("平均点は" + average + "点です。");
					System.out.println("------------------");
				}
				System.out.println("qが入力されたため、終了します。");
				break;
			}

			int score = Integer.parseInt(strScore);

			if (score >= 0 && score <= 100) {
				sum += score;
				count++;

				if (score < 60) {
					System.out.println("→評価Fです。");
				} else if (score < 70) {
					System.out.println("→評価Dです。");
				} else if (score < 80) {
					System.out.println("→評価Cです。");
				} else if (score < 90) {
					System.out.println("→評価Bです。");
				} else {
					System.out.println("→評価Aです。");
				}
			} else {
				System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
			}

		}

		System.out.println("---点数評価プログラム終了---");
	}

}
