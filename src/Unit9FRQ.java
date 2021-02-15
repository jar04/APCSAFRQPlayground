/*
These are my answers to the Unit 9 FRQ.

------------Question 1------------

a.) The PictureBook class is a subcass of the Book class that has the additional attribute: a String variable named
illustrator that is used to represent the name of the illustrator of a picture book. The PictureBook class also
contains a printBookInfo method to print the title, writer, and illustrator of a picture book. Complete PictureBook
class below.
--
public class PictureBook extends Book
{
    private String illustrator;

    public PictureBook(String t, String a, String i)
    {
        super(t, a);
        illustrator = i;
    }

    public void printBookInfo()
    {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}
--

b.) Write a code segment that can be used to replace "missing code" so that book1 and book2 will be correctly
created and added to myLibrary. Assume that class PictureBook works as intended, regardless of what you
wrote in part (a).
--
Book Book1 = new Book("Frankenstein", "Mary Shelley");
PictureBook Book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
--

c.) Complete the BookListing class below. Your implementation should conform to the examples. Assume that class
PictureBook worksas intended, regardless of what you wrote in part (a).
--
public class BookListing
{
    private Book bookInListing;
    private double price;

    public BookListing(Book b, double p)
    {
        bookInListing = b;
        price = p;
    }

    public void printDescription()
    {
        bookInListing.printBookInfo();
        System.out.printf(", $" + price);
    }
}
--

The implementation is below.
--
import java.util.ArrayList;

class Book
{
    private String title, author;

    public Book(String t, String a)
    {
        title = t;
        author = a;
    }

    public void printBookInfo()
    {
        System.out.println(title + ", written by " + author);
    }
}

class PictureBook extends Book
{
    private String illustrator;

    public PictureBook(String t, String a, String i)
    {
        super(t, a);
        illustrator = i;
    }

    public void printBookInfo()
    {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}

class BookListing
{
    private Book bookInListing;

    private double price;

    public BookListing(Book b, double p)
    {
        bookInListing = b;
        price = p;
    }

    public void printDescription()
    {
        bookInListing.printBookInfo();
        System.out.printf(", $" + price);
    }
}

public class test
{
    public static void main(String [] args)
    {
        PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
        myBook.printBookInfo();

        System.out.println();

        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Book Book1 = new Book("Frankenstein", "Mary Shelley");
        PictureBook Book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");

        myLibrary.add(Book1);
        myLibrary.add(Book2);

        BookListing Listing1 = new BookListing(Book 1, 10.99);
        Listing1.printDescription();
        System.out.println();

        BookListing Listing2 = new BookListing(Book2, 12.99);
        Listing2.printDescription();
        System.out.println();
    }
}
--
*/