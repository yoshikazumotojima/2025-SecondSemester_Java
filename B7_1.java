public class B7_1{//クラスの宣言
	public static void main(String[] args){//メインメソッド
		//新しいオブジェクトの宣言
		//コンストラクタを呼び出してインスタンスのフィールドに情報を与えてオブジェクトを生成している
		Educatee educatee = new Educatee("25AJ142", "Yoshikazum Motojima");
		//"25AJ142"、"Yoshikazu Motojima"という生徒情報を持ったオブジェクトが生成された
		System.out.println(educatee.getId() + " " + educatee.getName());
		//発覚スペースを挟んでゲッターで名前とIDの情報をインスタンスから呼び出している
	}
}