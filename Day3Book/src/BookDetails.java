import java.util.Scanner;
public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Book No");
		book.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Title");
		book.setTitle(sc.nextLine());
		System.out.println("Enter Author Name");
		book.setAuthor(sc.nextLine());
		System.out.println("Enter Book Price");
		book.setPrice(sc.nextFloat());
		System.out.println(book.getBookNo());
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		System.out.println("-------------------------------");
		
		EnginneringBook ebook=new EnginneringBook();
		System.out.println("Enter Book No");
		ebook.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Title");
		ebook.setTitle(sc.nextLine());
		System.out.println("Enter Author Name");
		ebook.setAuthor(sc.nextLine());
		System.out.println("Enter Book Price");
		ebook.setPrice(sc.nextFloat());
		System.out.println("Enter Book category");
		ebook.setCategory(sc.next());
		
		System.out.println("-------------------------------------");
		System.out.println(ebook.getBookNo());
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		
		System.out.println(ebook.getPrice());
		System.out.println(ebook.getCategory());
		System.out.println("-----------------------------------------");
		
	
			
		

	}

}
