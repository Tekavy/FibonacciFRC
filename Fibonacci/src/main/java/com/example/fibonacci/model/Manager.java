package com.example.fibonacci.model;

public interface Manager {
    int numByOrderManager(int location);
    int orderByNumManager(int wantedNum);
    String displayList();
}
