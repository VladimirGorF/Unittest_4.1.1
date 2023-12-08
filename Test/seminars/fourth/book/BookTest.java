package seminars.fourth.book;
//У вас есть класс BookService, который использует интерфейс BookRepository для получения
// информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
// используя Mockito для создания мок-объекта BookRepository.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BookTest {
    //    Book book;
    //
    //    @BeforeEach
    //    void createBook() {
    //        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
    //    }

    @Test
    void testBookConstructor() {
        String expId = "1";
        String expTitle = "Hunters Notes";
        String expAuthor = "I.S.Turgenev";
        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        assertNotNull(book);
    }

    @Test
    void testBookGetId() {
        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        assertThat(book.getId()).isEqualTo("1");
    }

    @Test
    void testBookSetId() {
        Book book = new Book("2", "Hunters Notes2", "I.S.Turgenev2");
        book.setId("3");
        assertThat(book.getId()).isEqualTo("3");
    }

    @Test
    void testBookGetTitle() {
        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        assertThat(book.getTitle()).isEqualTo("Hunters Notes");
    }

    @Test
    void testBookSetTitle() {
        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        book.setTitle("New Title");
        assertThat(book.getTitle()).isEqualTo("New Title");
    }

    @Test
    void testBookGetAuthor() {
        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        assertThat(book.getAuthor()).isEqualTo("I.S.Turgenev");
    }

    @Test
    void testBookSetAuthor() {
        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        book.setAuthor("New Author");
        assertThat(book.getAuthor()).isEqualTo("New Author");
    }

    @Test
    void testBookToString() {
        Book book = new Book("1", "Hunters Notes", "I.S.Turgenev");
        assertThat(book.toString()).isEqualTo("1 Hunters Notes I.S.Turgenev");
    }
}