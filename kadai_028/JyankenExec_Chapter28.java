package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		
		Jyanken_Chapter28 game = new Jyanken_Chapter28();
		
		//自分のじゃんけんの手を入力する
		String myHand = game.getMyChoice();
		
		//対戦相手のじゃんけんの手が乱数で選ばれる
		String cpuHand = game.getRandom();
		
		//じゃんけんの結果を出力する
		game.playGame(myHand, cpuHand);
		
	}

}
