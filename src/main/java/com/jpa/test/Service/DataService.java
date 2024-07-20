package com.jpa.test.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.Entity.Data;
import com.jpa.test.Repository.DataRepository;

import java.util.List;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;

    public List<Data> getAllData() {
        return dataRepository.findAll();
    }
}
