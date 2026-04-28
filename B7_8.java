import java.util.ArrayList;

public class B7_8{
	public static void main(String[] args){
		ArrayList<Educatee> arrayList = new ArayList<Educatee>();
		arrayList.add(new Educatee("00ID000","nakamura"));
		arrayList.add(new Educatee("00IE000", "iimura"));
		Educatee euducatee1 = arrayList.get(0);
		Educatee educatee2 = educatee.get(1);
		educatee1.setHeight(170);
		educatee2.setHeight(175);
		educatee1.setPassword("pass1");
		educatee2.setPassword("pass2");
	}
}