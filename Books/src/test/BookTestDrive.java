package test;
import module.Book;

public class BookTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book [] myBooks = new Book[3];
		int x = 0;
		myBooks [0] = new Book();
		myBooks [1] = new Book();
		myBooks [2] = new Book();
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Coockbook";
		myBooks[0].author = "Bob";
		myBooks[1].author = "Zue";
		myBooks[2].author = "Ian";
		
		while (x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}
	}

}
