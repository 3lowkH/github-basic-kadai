package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName;
	public String address;
	
	public void commonIntroduce()
	{
		System.out.println("住所は東京都中野区〇×です");
	}
	
	abstract public void eachIntroduce(); 
	
	public void execIntroduce()
	{
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println();
	}
}
