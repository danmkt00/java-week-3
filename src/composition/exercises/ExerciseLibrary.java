package composition.exercises;

import java.util.*;

/**
 TODO:
 1. Create class Book with title and author.
 2. Create class Library that HAS-A List<Book>.
 3. Add methods addBook(), listBooks().
 4. In main(), add multiple books and print them.
*/

class Book
{
    private String title;
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Title: " + title + "\nAuthor: " + author;
    }
}

class Library
{
    List<Book> books;
    public Library()
    {
        books = new ArrayList<>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void listBooks()
    {
        for(Book b : books)
        {
            System.out.println(b);
            System.out.println();
        }
    }
}
public class ExerciseLibrary
{
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Some title", "Some author"));
        library.addBook(new Book("Second title", "Second author"));
        library.addBook(new Book("Third final title", "Third final author"));

        library.listBooks();

    }
}
