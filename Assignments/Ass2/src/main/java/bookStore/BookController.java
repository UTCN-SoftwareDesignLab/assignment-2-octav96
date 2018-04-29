package bookStore;

import bookStore.dto.BookDTO;
import bookStore.entity.Book;
import bookStore.report.ReportCSV;
import bookStore.report.ReportPDF;
import bookStore.repository.BookRepository;
import bookStore.service.BookService;
import bookStore.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller    // This means that this class is a Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReportService reportService;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Book> getAllBooks(){
        return bookService.findAll();
    }

    @GetMapping("/todos")
    public String findAll(Model model){

        final List<Book> items = bookService.findAll();
        model.addAttribute("itemCount",items.size());
        return "todos";
    }



  /*  @GetMapping("/book1")
  //  @RequestMapping(value = "/book1", method = RequestMethod.GET)
    public String greetingForm1(Model model) {
        model.addAttribute("book1", new BookDTO());

        return "/book1";
}
  */

/*
    @RequestMapping(value = "/book1", method = RequestMethod.POST)
    public String greetingSubmit1(@ModelAttribute BookDTO bookDTO) {

        model.addAttribute("book", new BookDTO());

        return "/book1";
    }
*/

    @PostMapping("/book1")
    public ModelAndView createBook(@ModelAttribute BookDTO bookDto) {
        bookService.create(bookDto);
        List<Book> bookDtoList = bookService.getAll();

        ModelAndView mav = new ModelAndView("books_list");

        mav.addObject("bookDtoList", bookDtoList);

        return mav;
    }









}
