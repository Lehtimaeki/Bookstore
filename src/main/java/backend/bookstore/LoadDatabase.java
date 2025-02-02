package backend.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import backend.bookstore.model.Book;
import backend.bookstore.repository.BookRepository;

@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new Book(null, "Elämäni miehet", "Samuli Putro", "ISBN9789510510049", 2025, 34.95));
            repository.save(new Book(null, "Onyx Storm", "Rebecca Yarros", "ISBN9789510514986", 2025, 24.95));
            repository.save(new Book(null, "Rakel", "Satu Rämö", "ISBN9789510507339", 2024, 29.95));
        };
    }
}

