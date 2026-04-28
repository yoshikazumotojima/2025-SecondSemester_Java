import java.util.Random;

public class B3_1{
	public static void main(String[] args){
		Random random = new Random();//newキーワードでランダムクラスを呼び出す
		int value = random.nextInt(6);
		System.out.println(value);
	}
}