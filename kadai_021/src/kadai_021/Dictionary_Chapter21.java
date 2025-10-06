package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String , String> fluitMap = new HashMap<String , String>();
	String[] fluitAllay;
	
    public Dictionary_Chapter21(String[] Allay) {
        fluitMap.put("apple", "りんご");
        fluitMap.put("peach", "桃");
        fluitMap.put("banana", "バナナ");
        fluitMap.put("lemon", "レモン");
        fluitMap.put("pear", "梨");
        fluitMap.put("kiwi", "キウィ");
        fluitMap.put("strawberry", "いちご");
        fluitMap.put("grape", "ぶどう");
        fluitMap.put("muscat", "マスカット");
        fluitMap.put("cherry", "さくらんぼ");
        fluitAllay = Allay;
    }
    
    public void searchFluit()
    {
    	for(int i = 0 ; i < this.fluitAllay.length ; i++)
    	{
    		if(fluitMap.get(this.fluitAllay[i]) != null)
    		{
    			System.out.println(this.fluitAllay[i] + "の意味は" + fluitMap.get(this.fluitAllay[i]));
    		}
    		else
    		{
    			System.out.println(this.fluitAllay[i] + "は辞書に存在しません");
    		}
    	}
    }
}
