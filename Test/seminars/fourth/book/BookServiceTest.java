package seminars.fourth.book;
//У вас есть класс BookService, который использует интерфейс BookRepository для получения
// информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
// используя Mockito для создания мок-объекта BookRepository.
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testBookServiceFindById() {
        BookRepository repositoryInterface = mock(BookRepository.class);
        when(repositoryInterface.findById("1")).thenReturn(new Book("1", "Hunters Notes", "I.S.Turgenev"));

        BookService bookService = new BookService(repositoryInterface);
        Book result = bookService.findBookById("1");

        assertEquals("1", result.getId());
        assertEquals("Hunters Notes", result.getTitle());
        assertEquals("I.S.Turgenev", result.getAuthor());

    }

    @Test
    void testBookServiceFindAll() {
        BookRepository repositoryInterface = mock(BookRepository.class);
        when(repositoryInterface.findAll()).thenReturn(List.of(new Book("1", "Hunters Notes", "I.S.Turgenev")));

        BookService bookService = new BookService(repositoryInterface);

        List<Book> result = bookService.findAllBooks();

        assertEquals(1, result.size());
        assertEquals("Hunters Notes", result.get(0).getTitle());
        assertEquals("I.S.Turgenev", result.get(0).getAuthor());

    }
}