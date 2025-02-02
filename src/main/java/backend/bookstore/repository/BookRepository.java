package backend.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

