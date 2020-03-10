package jim.kats.bookstore.repository;

import jim.kats.bookstore.NoSuchResourceException;
import jim.kats.bookstore.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepository implements IBookRepository{
    private static int idCount = 1;
    private Map<Integer, Book> books = new HashMap<>();

    public BookRepository(){
        addBook(new Book("12345", "The Sun Rise", "Jim Katunguka", 300.00));
        addBook(new Book("12346", "The Moon Rise", "Alex Katabaax", 500.00));
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<Book>(books.values());
    }

    @Override
    public Book addBook(Book book) {
        book.setId(idCount);
        books.put(book.getId(), book);
        int temp = idCount;
        idCount++;
        return books.get(temp);
    }

    @Override
    public void updateBook(int id, Book book) {
        books.put(id, book);
    }

    @Override
    public Book getBook(int id) {
        Book returned = books.get(id);

        //throw exception if book doesnt exist
        if(returned == null) throw new NoSuchResourceException("Book", id);
        return returned;
    }

    @Override
    public void deleteBook(int id) {
        Book removed = books.get(id);

        if(removed == null) throw new NoSuchResourceException("Book", id);

    }
}
