package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scanner.nextLine();

			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				return input;

			} else {
				System.out.println("入力が正しくありません");
			}
		}
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {

		String[] cpu = { "r", "s", "p" };
		int random = (int) Math.floor(Math.random() * 3);
		return cpu[random];

	}

	//じゃんけんを行う
	public void playGame(String myHand, String cpuHand) {

		HashMap<String, String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");

		System.out.println("自分の手は" + hand.get(myHand) + ", 対戦相手の手は" + hand.get(cpuHand));

		if (myHand.equals(cpuHand)) {
			System.out.println("あいこです");

		} else if ((myHand.equals("r") && cpuHand.equals("s")) ||
				(myHand.equals("s") && cpuHand.equals("p")) ||
				(myHand.equals("p") && cpuHand.equals("r"))) {
			System.out.println("自分の勝ちです");

		} else {
			System.out.println("自分の負けです");
		}
	}

}
