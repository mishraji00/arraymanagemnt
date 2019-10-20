package com.example.demo.controller;

import com.example.demo.model.Model;
import com.example.demo.model.ModelInteger;
import com.example.demo.model.ModelList;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService service;


    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public HttpStatus  health(){

        return HttpStatus.OK;
    }

    @RequestMapping(value = "/mergeInt", method = RequestMethod.POST)
    public List mergeValues(@RequestBody Model model){

        return service.mergeMe(model);
    }

    @RequestMapping(value = "/mergeArray", method = RequestMethod.POST)
    public List mergeValues(@RequestBody ModelInteger model){

        return service.mergeNsort(model);
    }

    @RequestMapping(value = "/mergeList", method = RequestMethod.POST)
    public List mergeValues(@RequestBody ModelList model){

        return service.mergeNsortList(model);
    }


}
