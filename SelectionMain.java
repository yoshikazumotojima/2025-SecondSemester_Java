public class SelectionMain{
	public static void main(String[] args){
		Selection selection1 = new Drink("Shortサイズ", 380);
		Selection selection2 = new Potato("Lサイズ", 400);
		System.out.println(selection1.getSize());
		System.out.println(selection1.getPrice());
		System.out.println(selection1.getName());
		selection1.print();
		selection2.print();
	}
}