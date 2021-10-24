import java.util.Scanner;

	public class BookInfo
		{
			public Book[] create()
				{
				Scanner sc = new Scanner(System.in);
				System.out.println("\n enter how many element");
				int n=sc.nextInt();
				Book barr[] = new Book[n];
					for (int i = 0; i < barr.length; i++) 
						{
							System.out.println("\n enter int bookId, String bookName, int bookPrice, String bookAuther, String bookOther");	
							Book book1=new Book(sc.nextInt(),sc.next(), sc.nextInt(),sc.next(),sc.next());
							barr[i]=book1;
						}
					return null;
				}
			public void display(Book book1[])
				{
				for (int i = 0; i < book1.length; i++)
					{
					System.out.println("------------------------------------------------------------");
					System.out.println("book id      :"+book1[i].getBookId());
					System.out.println("book name    :"+book1[i].getBookName());
					System.out.println("book price   :"+book1[i].getBookPrice());
					System.out.println("book auther  :"+book1[i].getBookAuther());
					System.out.println("book address :"+book1[i].getBookOther());
					}
				}
}
