public class Book 
{
	private int BookId;
	private String BookName;
	private int BookPrice;
	private String  BookAuther;
	private String BookOther;
	public Book(int bookId, String bookName, int bookPrice, String bookAuther, String bookOther) {
		super();
		BookId = bookId;
		BookName = bookName;
		BookPrice = bookPrice;
		BookAuther = bookAuther;
		BookOther = bookOther;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	public String getBookAuther() {
		return BookAuther;
	}
	public void setBookAuther(String bookAuther) {
		BookAuther = bookAuther;
	}
	public String getBookOther() {
		return BookOther;
	}
	public void setBookOther(String bookOther) {
		BookOther = bookOther;
	}
	public String getBookName1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
