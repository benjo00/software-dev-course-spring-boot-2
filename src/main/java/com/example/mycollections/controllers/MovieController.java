package com.example.mycollections.controllers;

import com.example.mycollections.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Movie")
public class BookController {

    private final List<Movie> movie = new ArrayList<>() {{
        add(new Movie("LOTR", "Peter Jackson", 2001, 120));
        add(new Movie("Princess Bride", "Carey Elwes", 1992, 90));
        add(new Movie("Om Shanti Om", "Sha Ruk Khan", 1996, 180));
    }};

    @GetMapping("/json")
    public List<Movie> getBooksJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {
        String movieList = "<ul>";
        for (Movie movie : movies) {
            movieList += "<li>" + movie + "</li>";
        }
        movieList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Books</h1>
                        <ul>
                """ +
                movieList +
                """
                        </ul>
                    </body>
                """;
    }

}