package com.jpa.test.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jpa.test.Entity.Data;
import com.jpa.test.Service.DataService;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping
    public List<Data> getAllData() {
        return dataService.getAllData();
    }
}
