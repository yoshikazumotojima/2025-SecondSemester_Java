public class GumMain{
	public static void main(String[] args){
		Gum gum1 = new Gum(100);
		Gum gum2 = new Gum(150);
		//初期化とは？
		//作ったばかりのものに最初の設定をしてあげること
		//上記のプログラムでいうところの
		//Gumという設計図を基に「ガムのオブジェクト(実物)」を作る
		//「ガム1号の完成!!」ここではまだインスタンス化のみ完了
		//そのガムに「100円」という値段をセットする
		//gum1
		//├─ item: "ガム"
		//└─ price: ？？（まだ決まってない）
		//gum1
		//├─ item: "ガム"
		//└─ price: 100
		//(gu1,gum2)Gum型の新しいインスタンスの宣言また、初期値100,150を入れて初期化をしている
		//そうすることで、100円と150円のGum型のインスタンスの作成ができる
		//Gumクラスから新しいオブジェクト(インスタンス)を生成
		//コンストラクタ内で100を渡して初期化
		//this.price = priceにより、フィールドpriceが100に設定される
		String item1 = gum1.getItem();
		String item2 = gum2.getItem();
		//item1,item2にゲッターで呼び出したitemを代入
		//Gumクラスで初期値として設定したString item = "ガム"がgetItemで呼び出されそれがitem1,item2に代入される
		//itemフィールドは"ガム"で初期化されているので、すべてのガムオブジェクトで同じ値"ガム"が返る
		int price1 = gum1.getPrice();
		int price2 = gum2.getPrice();
		//getPrice()でpriceを返す。
		//振る舞いにてGumでは受け取ったint型をthis.priceに代入
		//それをprice1.price2に代入している。
		int sum = price1 + price2;
		//金額の合計
		System.out.println(item1 + " " + price1 + "円");
		System.out.println(item2 + " " + price2 + "円");
		System.out.println("合計 " + sum + "円");
	}
}

//初期化と代入の違い
//初期化は「生まれた瞬間の設定」
//初期化の意義：
//オブジェクト生成時に動く状態にするため
//ただ作っただけでは値が空っぽであるためプログラムでは使えない
//また、値が未設定(0,null)であると、あとでエラーの原因になりかねない
//オブジェクトごとに個性を持たせるため。
//同じクラスでも、100円や150円の様に違う状態を保てる
//Gum(100)と書けばそのクラスが持つ値が何か一目でわかる
//代入は後からの設定
