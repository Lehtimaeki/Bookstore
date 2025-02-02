package backend.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import backend.bookstore.model.Book;
import backend.bookstore.repository.BookRepository;



@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/booklist")
    public String showBookList(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "booklist";
    }

    @GetMapping("/addbook")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "addbook";
    }

    @PostMapping("/addbook")
    public String addBook(@ModelAttribute Book book) {
        bookRepository.save(book);
        return "redirect:/booklist";
    }


    @RequestMapping("/index")
    @ResponseBody
    public String returnMessage() {
        return "This is index";
    }

}
    
