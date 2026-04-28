//25AJ142 ñ{ìàã`òa
public class BillMain{
	public static void main(String[] agrs){
		CoinBox coinBox = new CoinBox();
		coinBox.add(new Coin100());
		coinBox.add(new Coin100());
		coinBox.add(new Coin50());
		coinBox.add(new Bill_10000());
		
		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("çáåv" + sum + "â~");
	}
}