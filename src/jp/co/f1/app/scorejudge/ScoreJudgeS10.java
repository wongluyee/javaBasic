package jp.co.f1.app.scorejudge;

import java.util.Scanner;

// クラス定義する
class EvaluateS10 {
	public char evaluateScore(int score) {
		// grade 初期化する
		char grade;
		if (score < 0 || score > 100) {
			grade = 'Z';
		} else if (score < 60) {
			grade = 'F';
		} else if (score < 70) {
			grade = 'D';
		} else if (score < 80) {
			grade = 'C';
		} else if (score < 90) {
			grade = 'B';
		} else {
			grade = 'A';
		}

		return grade;
	}
}

public class ScoreJudgeS10 {
	public static void main(String[] args) {
		System.out.println("---点数評価プログラム開始---");

		Scanner sc = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		int maxScore = -1;
		int minScore = 101;

		while (true) {
			try {
				System.out.print(">");
				String strScore = sc.nextLine();

				// 空文字の場合、以下の処理が行う
				if (strScore.equals("")) {
					System.out.println("何も入力されていません。再度、0から100までの数字を入力してください。");
					continue;
				}

				// q が入力された場合、プログラム終了
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

				// String --> integer 変換
				int score = Integer.parseInt(strScore);

				// オブジェクト作成
				EvaluateS10 evaluate = new EvaluateS10();
				// インスタンスメソッドを呼び出す
				char grade = evaluate.evaluateScore(score);

				if (grade == 'Z') {
					System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
					continue;
				}

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
				// 終了キーと空文字と数字以外の文字が入力された場合、以下の処理を行う
			} catch (NumberFormatException e) {
				System.out.println("文字列が入力されました。再度、0から100までの数字を入力してください。");
				continue;
				// それ以外のエラーは下記の処理を行う
			} catch (Exception e) {
				System.out.println(e + "という例外が発生しました。");
			}
		}
		System.out.println("---点数評価プログラム終了---");
	}
}
