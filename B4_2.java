public class B4_2{
	public static void main(String[] agrs){
		Teacher teacher = new Teacher("SIE01", "nakamura");
		teacher.setSalary(200000);
		int salary = teacher.getSalary();
		System.out.println(salary);
	}
}