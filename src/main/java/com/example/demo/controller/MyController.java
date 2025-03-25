package com.example.demo.controller;

import com.example.demo.model.MyModel;
import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    private MyService myService;

    public MyController(MyService myService){
        this.myService = myService;
    }

    @GetMapping
    public List<MyModel> getMyList(){
        return myService.getMyList();
    }
}
