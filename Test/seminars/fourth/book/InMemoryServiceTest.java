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
//    InMemoryBookRepository memory;

//    @BeforeEach
//    void setUp() {
//        InMemoryBookRepository memory = new InMemoryBookRepository();
//    }

    @Test
    void testBookServiceFindById() {
        InMemoryBookRepository memory = new InMemoryBookRepository();
        assertThat(memory.findById("1").toString()).isEqualTo("1 Book1 Author1");
    }

    @Test
    void testBookServiceFindAllListType() {
        InMemoryBookRepository memory = new InMemoryBookRepository();
        assertThat(memory.findAll()).isInstanceOf(List.class);
    }
    @Test
    void testBookServiceFindSize() {
        InMemoryBookRepository memory = new InMemoryBookRepository();
        assertThat(memory.findAll()).hasSize(2);
    }

    @Test
    void testBookServiceFindNotEmpty() {
        InMemoryBookRepository memory = new InMemoryBookRepository();
        assertThat(memory.findAll()).isNotEmpty();
    }
}