package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS01 {

	public static void main(String[] args) {
		System.out.println("---点数評価プログラム開始---");
		System.out.print(">");

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score < 59 && score >= 0) {
			System.out.println("→評価Fです。");
		} else if (score < 69) {
			System.out.println("→評価Dです。");
		} else if (score < 79) {
			System.out.println("→評価Cです。");
		} else if (score < 89) {
			System.out.println("→評価Bです。");
		} else if (score <= 100) {
			System.out.println("→評価Aです。");
		}

		System.out.println("---点数評価プログラム終了---");
	}

}
