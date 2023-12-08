package seminars.fourth.book;
//У вас есть класс BookService, который использует интерфейс BookRepository для получения
// информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
// используя Mockito для создания мок-объекта BookRepository.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookTest {
        Book book;

        @BeforeEach
        void createBook() {
            book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        }

    @Test
    void testBookConstructor() {
        assertTrue(book instanceof Book);
    }

    @Test
    void testBookGetId() {
        assertThat(book.getId()).isEqualTo("1");
    }

    @Test
    void testBookSetId() {
        book.setId("3");
        assertThat(book.getId()).isEqualTo("3");
    }

    @Test
    void testBookGetTitle() {
        assertThat(book.getTitle()).isEqualTo("Hunters Notes");
    }

    @Test
    void testBookSetTitle() {
        book.setTitle("New Title");
        assertThat(book.getTitle()).isEqualTo("New Title");
    }

    @Test
    void testBookGetAuthor() {
        assertThat(book.getAuthor()).isEqualTo("I.S.Turgenev");
    }

    @Test
    void testBookSetAuthor() {
        book.setAuthor("New Author");
        assertThat(book.getAuthor()).isEqualTo("New Author");
    }

}