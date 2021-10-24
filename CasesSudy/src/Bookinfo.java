import java.util.Scanner;
public class Bookinfo 
{
		public Book[] create()
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n enter how many element");
			int n=sc.nextInt();
			Book barr[] = new Book[n];
				for (int i = 0; i < n; i++) 
					{
						System.out.println("\n Book Titel :"
								         + "\n Book Price :");	
						Book book1=new Book(sc.next(), sc.nextInt());
						barr[i]=book1;
					}
				return null;
			}
		public Book[] Display(Book book1[])
			{
			for (int i = 0; i < book1.length; i++)
				{
				System.out.println("------------------------------------------------------------");
				System.out.println("book id      :"+book1[i].getBook_Titel());
				System.out.println("Book Price   :"+book1[i].getBook_price());
				}
			return null;
			}
	
		
}
