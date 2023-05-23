package com.example.fibonacci.model;

import java.util.List;

public interface Actions {
    String toString();

    List getList();

    void extendList();

    int getSize();

    int numByOrder(int location);

    int orderByNum(int wantedNum);
}
