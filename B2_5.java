public class B2_5{
	public static void main(String[] args){
		Student student1 = new Student("00id00" ,"‚‹´");
		String id1 = student1.getId();
		String name1 = student1.getName();
		System.out.println(id1);
		System.out.println(name1);
		Student student2 = new Student("00ie00", "—é–Ø");
		System.out.println(student2.getId());
		System.out.println(student2.getName());
	}
}