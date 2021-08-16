package com.backend.backendapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<List<Integer>> test(){

        final ArrayList<Integer> testObj = new ArrayList<>();
        testObj.add(1);
        testObj.add(2);
        testObj.add(3);

        return new ResponseEntity<>(testObj, HttpStatus.OK);
    }
}
