package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS02 {

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
		} else {
			System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
		}

		System.out.println("---点数評価プログラム終了---");
	}

}
