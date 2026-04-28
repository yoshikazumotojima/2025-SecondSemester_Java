import java.util.ArrayList;
public class Bookshelf{
	private ArrayList<Book> arrayList = new ArrayList<Book>();
	public Bookshelf(){
	}
	public void add(Book book){
		this.arrayList.add(book);
	}
	public Book get(String isbn){
		for(int i = 0; i < this.arrayList.size(); i++){
			Book book = this.arrayList.get(i);
			String isbn2 = book.getIsbn();
			if(){
				return this.arrayList.remove(i);
			}
		}
		return null;
	}
	public int size(){
		return this.arrayList.size();
	}
}