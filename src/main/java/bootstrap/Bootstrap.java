package bootstrap;

import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Service;

@Service
public class Bootstrap {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/book_store","sa",null).load();
        flyway.migrate();
    }
}
