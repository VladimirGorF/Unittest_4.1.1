package seminars.fourth.book;
//У вас есть класс BookService, который использует интерфейс BookRepository для получения
// информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
// используя Mockito для создания мок-объекта BookRepository.

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class InMemoryServiceTest {
    InMemoryBookRepository memory;

    @BeforeEach
    void setUp() {
        memory = new InMemoryBookRepository();
    }

    @Test
    void testBookServiceFindById() {
        assertThat(memory.findById("1").getId()).isEqualTo("1");
        assertThat(memory.findById("1").getAuthor()).isEqualTo("Author1");
        assertThat(memory.findById("1").getTitle()).isEqualTo("Book1");
    }

    @Test
    void testBookServiceFindAllListType() {
        assertThat(memory.findAll()).isInstanceOf(List.class);
    }
    @Test
    void testBookServiceFindSize() {
        assertThat(memory.findAll()).hasSize(2);
    }

    @Test
    void testBookServiceFindNotEmpty() {
        assertThat(memory.findAll()).isNotEmpty();
    }
}