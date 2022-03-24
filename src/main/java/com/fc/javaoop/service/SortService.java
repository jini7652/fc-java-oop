package com.fc.javaoop.service;

import com.fc.javaoop.logic.JavaSort;
import com.fc.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + this.sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
//        Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }
}
