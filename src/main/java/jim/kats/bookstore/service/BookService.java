package jim.kats.bookstore.service;

import jim.kats.bookstore.domain.Book;
import jim.kats.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    @Override
    public void updateBook(int id, Book book) {
        bookRepository.updateBook(id, book);
    }

    @Override
    public Book getBook(int id) {
        return bookRepository.getBook(id);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteBook(id);
    }
}
