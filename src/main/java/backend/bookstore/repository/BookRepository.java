package backend.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.bookstore.model.book;

public interface BookRepository extends JpaRepository<book, Long> {
}

