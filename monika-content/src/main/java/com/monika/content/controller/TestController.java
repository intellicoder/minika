package com.monika.content.controller;

import com.monika.content.dao.BookMapper;
import com.monika.content.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/test")
    public List<Book> test() {
        return bookMapper.selectList(null);
    }




}
