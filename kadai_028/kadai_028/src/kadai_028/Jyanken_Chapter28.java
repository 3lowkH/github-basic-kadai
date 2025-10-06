package kadai_028;

import java.util.HashMap;

public class Jyanken_Chapter28 {
	HashMap<String, String> hand = new HashMap<String, String>();
	
	Jyanken_Chapter28()
	{
		hand.put("r","グー");
		hand.put("s","チョキ");
		hand.put("p","パー");
	}
	public String getMyChoice()
	{
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String hand = scanner.next();
		scanner.close();
		return hand;
	}
	
	public String getRandom()
	{
		int rnd = (int)Math.floor(Math.random()*3);
		return switch(rnd)
				{
				case 0 -> "r";
				case 1 -> "s";
				case 2 -> "p";
				default ->	"";
				};
	}
	
	public void playGame(String myHand , String enemyHand)
	{
		System.out.println("自分の手は" + hand.get(myHand) + ",対戦相手の手は" + hand.get(enemyHand));
		
		if(myHand.equals(enemyHand))
		{
			System.out.println("あいこです");
		}
		else
		{
			switch (myHand) {
			case "r": 
				if(enemyHand.equals("s"))
				{
					System.out.println("自分の勝ちです");
				}
				else if(enemyHand.equals("p"))
				{
					System.out.println("自分の負けです");
				}
				else {}
				break;
			case "s": 
				if(enemyHand.equals("p"))
				{
					System.out.println("自分の勝ちです");
				}
				else if(enemyHand.equals("r"))
				{
					System.out.println("自分の負けです");					
				} 
				else {}
				break;
			case "p": 
				 
				if(enemyHand.equals("r"))
				{
					System.out.println("自分の勝ちです");	
				}
				else if(enemyHand.equals("s"))
				{
					System.out.println("自分の負けです");
				}
				else {}
				break;
			default:
				break;
			}
		}
	}
}
