package com.farhan.library.controllers;

import com.farhan.library.Constans;
import com.farhan.library.payload.Response;
import com.farhan.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/ceritaKEKL/load")
    public Object loadCeritaKeklPageable(Pageable pageable, @RequestParam(required = false) String keyword, @RequestParam Long isEng) {

        Response response = new Response();

        try {
            boolean isEnglish = isEng == 1;


            response.setRC("00");
            response.setMessage("Success");
            response.setData(null);
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
