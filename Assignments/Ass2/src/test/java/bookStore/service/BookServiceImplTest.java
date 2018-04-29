package bookStore.service;

import bookStore.dto.BookDTO;
import bookStore.entity.Book;
import bookStore.repository.BookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class BookServiceImplTest {


    @Mock
    private BookRepository bookRepository;

    private BookServiceImpl bookService;

    Book book;

    @Before
    public void setup() {

        bookService = new BookServiceImpl(bookRepository);
        Book book1 = new Book("OCTAV", "A L O", "12345","DRAMA", 888l,88.8);

        List<Book> books = new ArrayList<>();
        books.add(book1);


        Mockito.when(bookRepository.findAll()).thenReturn(books);
      //  Mockito.when(bookRepository.findAllByTitle("A L 0")).thenReturn(books);
    }

    @Test
    public void getAll() {
        System.out.println(bookService.getAll().size());
        assertNotNull(bookService.getAll());
    }



}