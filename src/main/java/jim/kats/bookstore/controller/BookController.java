package jim.kats.bookstore.controller;

import jim.kats.bookstore.domain.Book;
import jim.kats.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    //test


    @RequestMapping("/books")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/getBook/{id}")
    public Book getBook(@PathVariable int id){
        return bookService.getBook(id);
    }

    @PostMapping("/addBook")
    public Book addBook(Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public Book delete(@PathVariable int id){
        bookService.deleteBook(id);
        return null;
    }


}
