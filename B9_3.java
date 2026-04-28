public class B9_3{
	public static void main(String[] args){
		SubEducator educator1 = new SubEducator("ID0123", "naka");
		SubEducator educator2 = new SubEducator("IE0002", "ooyama");
		educator1.setPassword("pass1");
		educator2.setPassword("pass2");
		System.out.print(educator1.getId() + " ");
		System.out.print(educator1.getName() + " ");
		System.out.println(educator1.getPassword());
		System.out.print(educator2.getId() + " ");
		System.out.print(educator2.getName() + " ");
		System.out.println(educator2.getPassword());
	}
}