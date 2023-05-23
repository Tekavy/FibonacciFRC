package com.example.fibonacci.model;

import java.util.ArrayList;
import java.util.List;

public class FibonacciActions implements Actions{
    List<Integer> fibonacciList = new ArrayList<>();
    private final int initialTermination = 45;

    public FibonacciActions() {
        fibonacciList.add(0, 0);
        fibonacciList.add(1, 1);
        fibonacciList = createList(fibonacciList, fibonacciList.size(), initialTermination);
        System.out.println(fibonacciList.toString());
        //This is the reason for writing the list in the first line!
    }

    private List<Integer> createList(List<Integer> fibonacciList, int order, int termination) {
        fibonacciList.add(fibonacciList.get(order - 1) + fibonacciList.get(order - 2));
        if (order < termination) {
            createList(fibonacciList, order + 1, termination);
        }
        return fibonacciList;
    }

    public String toString() {
        StringBuilder strb = new StringBuilder();

        for(Integer element: fibonacciList) {
            strb.append(element).append(", ");
        }

        return strb.toString();
    }

    @Override
    public List getList() {
        return fibonacciList;
    }

    @Override
    public void extendList() {
        fibonacciList = createList(fibonacciList, fibonacciList.size(), initialTermination);
    }

    @Override
    public int getSize() {return fibonacciList.size();}

    @Override
    public int numByOrder(int location) throws IndexOutOfBoundsException{
        return fibonacciList.get(location);
    }

    @Override
    public int orderByNum(int wantedNum) throws IndexOutOfBoundsException{
        return fibonacciList.indexOf(wantedNum);
    }
}
