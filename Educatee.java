public class Educatee{//クラスの宣言
	//インスタンス変数の設定
	//生徒情報の管理データのイメージ
	private String id;
	private String name;
	private String password = "";
	private int height = 0;
	
	public Educatee(String id, String name){
		//コンストラクタの設定
		//newでインスタンス化の時に必ずidとnameをセットすることを強制する
		this.id = id;
		this.name = name;
	}
	//操作するためのメソッド
	//get...(情報を取るメソッド
	//set...(情報を書き換えるメソッド)
	//name,idが変更できないのはその誰かを特定する重要な情報の変更を防ぐため
	//イミュータブル(不変)：一度設定した後から変更できないように設計すること
	//フィールドによって書き換え可能かどうかを使い分けるのも、カプセル化の大きなメリット
	
	//このメソッドが呼び出されたときにコンストラクタに代入された値をそのまま返す
	public String getId(){
		return this.id;
	}
	//呼び出されたときに引数に代入されたものをフィールドに再代入して元々代入されていたものを置き換える
	public void setPassword(String password){
		this.password = password;
	}
	//呼び出されたときにフィールドに入っている文字列を返す
	public String getPassword(){
		return this.password;
		return this.password;
	}
	//フィールドに代入された名前を返す
	public String getName(){
		return this.name;
	}
	//フィールドに代入された値にメソッドを呼びだしたときに引数に代入されたものを再代入して返す
	public void setHeight(int height){
		this.height = height;
	}
	//フィールドに代入されたいる値を返す
	public int getHeight(){
		return this.height;
	}
}