import java.util.Scanner;
public class BookInfo {
		public Book[] create(){
			Scanner sc=new Scanner(System.in);
			System.out.println("\n how many object do you want");
			int n=sc.nextInt();
			
			Book barr[]=new Book[n];
			for(int i=0;i<barr.length;i++) {
				System.out.println("\n enter book id,book name,book price");
				Book book1=new Book(sc.nextInt(),sc.next(),sc.nextInt());
				barr[1]=book1;
			}
			return barr;
		}
		public void display(Book book1[]){
			for(int i=0;i<book1.length;i++) {
			System.out.println("Book Id : "+book1[i].getBookId());
			System.out.println("Book Name : "+book1[i].getBookName());
			System.out.println("Book Price : "+book1[i].getBookPrice());
		}
		}
	}

