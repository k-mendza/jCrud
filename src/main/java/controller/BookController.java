package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping("/getAll")
    public String getAllBooks() {
        return "Books";
    }
}
