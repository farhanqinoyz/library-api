package com.farhan.library.controllers;

import com.farhan.library.Constans;
import com.farhan.library.models.Books;
import com.farhan.library.payload.Response;
import com.farhan.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/load")
    public Object loadBookPageable(@RequestParam(required = false) String keyword) {

        Response response = new Response();

        try {
            List<Map<String, Object>> datas = new ArrayList<>();
            Map<String, Object> data = new HashMap<>();
            List<Books> books = keyword != null ? bookRepository.getBooksByKeyword(keyword) : bookRepository.findAll();
            for(Books book : books){
                Map<String, Object> loop = new HashMap<>();
                loop.put("bookId", book.getBookId());
                loop.put("title", book.getTitle());
                loop.put("yearRelease", book.getYearRelease());
                datas.add(loop);
            }
            data.put("data", datas);


            response.setRC("00");
            response.setMessage("Success");
            response.setData(data);
            response.setResponseType(Constans.RESPONSE_TYPE_SUCCESS);
            return ResponseEntity.ok().body(response);

        } catch (Exception e) {
            response.setRC("99");
            response.setMessage(e.getLocalizedMessage());
            response.setData(null);
            response.setResponseType(Constans.RESPONSE_TYPE_ERROR);
            return ResponseEntity.ok().body(response);
        }
    }

}
