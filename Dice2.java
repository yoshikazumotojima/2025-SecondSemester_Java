public class Dice2{
	//privateはクラスの中にRandomが入ってるけど外部からのアクセスができないになっている
	private Random random;
	private int value;
	public Dice2(){
		//thisは自分自身(=今動いているオブジェクト)を指す特別な変数
		//自分自身のrandomに新しいRandomを入れてねという命令
		//なくても実行は可能だが、同じ変数名が存在した場合にJavaがどちらかのオブジェクトを見つけてしまう。
		//そのため、thisとしておくことでこのオブジェクトのrandomですよと明確にできる
		this.random = new Random();
		//右
	}
	public void cast(){
		this.value = this.random.nextInt(6) + 1;
	}
	public int getValue(){
		return this.value;
	}
}