package com.example.demo.service;

import com.example.demo.model.Model;
import com.example.demo.model.ModelInteger;
import com.example.demo.model.ModelList;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyService {

    public List mergeMe(Model model) {

        List<Integer> list = Arrays.stream(model.getValue1()).boxed().collect(Collectors.toList());
        list.addAll(Arrays.stream(model.getValue2()).boxed().collect(Collectors.toList()));
        Collections.sort(list);

        return list;
    }

    public List mergeNsort(ModelInteger mi){

        mi.getValue1().addAll(mi.getValue2());
        Collections.sort(mi.getValue1());

        return mi.getValue1();
    }

    public List mergeNsortList(ModelList mi){

        mi.getValue1().addAll(mi.getValue2());
        Collections.sort(mi.getValue1());

        return mi.getValue1();
    }
}
