package seminar4.book;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookService bookService;
    @Before
    public void setUp() {
        // Define the behavior of the mock BookRepository
        when(bookRepository.findById("1")).thenReturn(new Book("1", "Sample Book", "Sample Author"));
        when(bookRepository.findAll()).thenReturn(Arrays.asList(new Book("1", "Sample Book 1", "Sample Author 1"), new Book("2", "Sample Book 2", "Sample Author 2")));
    }
    @Test
    public void testFindBookById() {
        // Verify the behavior of findBookById method
        Book book = bookService.findBookById("1");
        assertEquals("Sample Book", book.getTitle());
        assertEquals("Sample Author", book.getAuthor());
    }
    @Test
    public void testFindAllBooks() {
        // Verify the behavior of findAllBooks method
        List<Book> books = bookService.findAllBooks();
        assertEquals(2, books.size());
        assertEquals("Sample Book 1", books.get(0).getTitle());
        assertEquals("Sample Book 2", books.get(1).getTitle());
    }
}
