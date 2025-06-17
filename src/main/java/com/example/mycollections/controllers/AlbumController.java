package com.example.mycollections.controllers;

import com.example.mycollections.models.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Album")
public class AlbumController {

    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("Hard Day's Night", "The Beatles", 1970, 120));
        add(new Album("Al", "Weird Al", 1989, 201));
        add(new Album("Banana", "Rafee", 1993, 115));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumsJson() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Books</h1>
                        <ul>
                """ +
                albumList +
                """
                        </ul>
                    </body>
                """;
    }

}