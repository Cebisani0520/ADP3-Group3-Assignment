package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.BookClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class BookFactoryTest {
    public List<BookClass> bookClassList = null;
    public Set<BookClass> bookClassSet = null;

    @Test
    public void objEqualityTest(){
        BookClass author1 = BookFactory.addAuthor("Cebisani", "Lamani", "219104409@mycput.ac.za");
        BookClass author2 = BookFactory.addAuthor("Cebisani", "Lamani", "219104409@mycput.ac.za");
        System.out.println(author1.toString() + author2.toString());
        assertEquals(author1, author2);
    }
    @Test
    public void objIdentityTest(){
        bookClassSet = new HashSet<>();
        BookClass bookClass1 = BookFactory.addBook("YOU", "Sammy", "Adam", "Thriller", 200.00);
        BookClass bookClass2 = BookFactory.addBook("YOU", "Sammy", "Adam", "Thriller", 200.00);
        bookClassSet.add(bookClass1);
        bookClassSet.add(bookClass2);
        System.out.println(bookClass1.toString() + bookClass2.toString());
        assertNotEquals(bookClass1, bookClass2);
    }

    @Test
    public void failingTest(){
        bookClassList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            BookClass bookClass = BookFactory.addBook("A Time To Kill", "John", "Grisham", "Mystery", 350.00);
            bookClassList.add(bookClass);
            System.out.println(bookClass.toString());
        }
        assertEquals(1, bookClassList.size());
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void timeoutTest() throws InterruptedException{
        for (int i = 0; i < 150; i++) {
            BookClass bookClass = BookFactory.addBook("A Time To Kill", "John", "Grisham", "Mystery", 350.00);
            System.out.println(bookClass.toString());
        }
        Thread.sleep(2000);
    }

    @Test
    @Disabled
    public void disablingTest(){
        BookClass author3 = BookFactory.addAuthor("Cebisani", "Lamani", "cebisani@gmail.com");
        System.out.println(author3.toString());

    }

}