import jp.tdu.util.KeyboardReader;
//DiceGameクラスがサイコロの管理という具体的な仕事を、別のクラスである**Cupクラスに任せていることを「委譲」
public class DiceGame{
	private Cup cup = new Cup();
	private int playerHand;
	//privateでインスタンスを代入したCup型変数cupをこのクラス内でしかアクセス(変更など)できないようにしている
	//ここで新しいインスタンスのサイコロを入れるためのcupが生成されている
	
	public DiceGame(Dice dice0, Dice dice1){
		//コンストラクタの設定、半丁ゲームの作成
		//サイコロ二つを
		this.cup.add(dice0);
		this.cup.add(dice1);
	}
	public void play(){
		this.cup.cast();
	}
	public void bet(){
		System.out.print("丁(偶数)は0、半(奇数)は1を入力してください：");
		int playerHand = KeyboardReader.readInt();
		//ここでキーボードからの出力をユーザーにさせるコード
		
	}
	public void judge(){
		Dice dice0 = cup.get(0);
		Dice dice1 = cup.get(1);
		//dice0,1にcupのインスタンスの0番目と1番目のすでに振る処理を行っているサイコロを代入している
		
		int value0 = dice0.getValue();
		int value1 = dice1.getValue();
		//サイコロを
		int sum = value0 + value1;
		System.out.println(value0 + " " + value1 + "で合計が" + sum + "です");
		int result = sum % 2;
		if(this.playerHand == result){
			System.out.println("プレーヤーの勝ち");
		}else{
			System.out.println("コンピュータの勝ち");
		}
	}
}