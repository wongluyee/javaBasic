
package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS05 {

	public static void main(String[] args) {
		System.out.println("---点数評価プログラム開始---");

		Scanner sc = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		int maxScore = -1;
		int minScore = 101;

		while (true) {
			System.out.print(">");
			String strScore = sc.nextLine();
			// qが入力された場合、プログラム終了
			if (strScore.equals("q")) {
				// countが0の場合サマリーなし
				if (count == 0) {
					System.out.println("-----サマリー-----");
					System.out.println("評価された人数が0名のためサマリーは表示しません。");
					System.out.println("------------------");
				// countが0ではない場合、最高点、最低点、合計、平均を表示する
				} else {
					double average = (double) sum / count;
					System.out.println("-----サマリー-----");
					System.out.println(count + "名の成績を評価しました。");
					System.out.println("最高点は" + maxScore + "点です。");
					System.out.println("最低点は" + minScore + "点です。");
					System.out.println("合計点は" + sum + "点です。");
					System.out.println("平均点は" + average + "点です。");
					System.out.println("------------------");
				}
				System.out.println("qが入力されたため、終了します。");
				break;
			}

			// String --> int 変換
			int score = Integer.parseInt(strScore);

			if (score >= 0 && score <= 100) {
				// 入力されたscoreがmaxScoreより大きい場合、maxScoreにscore代入する
				if (score > maxScore) {
					maxScore = score;
				}
				// 入力されたscoreがminScoreより小さい場合、minScoreにscore代入する
				if (score < minScore) {
					minScore = score;
				}

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
