package com.example.demo.service.impl;

import com.example.demo.model.MyModel;
import com.example.demo.service.MyService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public List<MyModel> getMyList() {
        return List.of(
                new MyModel(1,"Abhi")
        );
    }
}
