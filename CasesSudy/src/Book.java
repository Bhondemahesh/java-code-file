import java.util.Scanner;
public class Book {
	private String Book_Titel;
	private float Book_price;
	private Book[] book2;

	public Book(String book_Titel, float book_price) {
		super();
		Book_Titel = book_Titel;
		Book_price = book_price;
	}

	public String getBook_Titel() {
		return Book_Titel;
	}

	public void setBook_Titel(String book_Titel) {
		Book_Titel = book_Titel;
	}

	public float getBook_price() {
		return Book_price;
	}

	public void setBook_price(float book_price) {
		Book_price = book_price;
	}
	}