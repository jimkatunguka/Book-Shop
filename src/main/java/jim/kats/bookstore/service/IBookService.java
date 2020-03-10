package jim.kats.bookstore.service;

import jim.kats.bookstore.domain.Book;

import java.util.List;

public interface IBookService {
    public abstract List<Book> getAll();
    public abstract Book addBook(Book book);
    public abstract  void updateBook(int id, Book book);
    public Book getBook(int id);
    public void deleteBook(int id);
}
