package com.Spring1.calender.controller;

import com.Spring1.calender.model.BookStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*specialized version of the @Controller annotation.
It is used to create RESTful web services by combining @Controller and @ResponseBody.
This means that all methods in a class annotated with @RestController automatically return JSON or XML responses,
depending on the client request.*/
@RequestMapping({"/bookstore"})/*used to map web requests to specific handler methods in the controller classes.
can be applied at the class level and method level.
It supports mapping HTTP methods, request URLs, parameters, headers, and more.*/

public class BookStoreService {

    BookStore bookStore;
    @GetMapping("{Title}")//for get operation
    public BookStore getBookdetails(String Title){
        return new BookStore("One","John Mars","Thriller","INR 999");
    }




}
