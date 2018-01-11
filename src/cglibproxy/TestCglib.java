package cglibproxy;

import org.junit.Test;

public class TestCglib {
	
	
	public static void main(String[] args) {
		BookImpl book = new BookImpl();
		BookCglib  cglib = new BookCglib();  
		BookImpl bookCglib = (BookImpl)cglib.getInstance(book);  
        bookCglib.addBook(); 
	}
	
	/*@Test  
    public void testProxy() throws Throwable{  
		BookImpl book = new BookImpl();
		BookCglib  cglib = new BookCglib();  
		BookImpl bookCglib = (BookImpl)cglib.getInstance(book);  
        bookCglib.addBook(); 
    } */
}
