package com.example.fibonacci.model;

public class Management implements Manager{
    FibonacciActions fa;

    public Management() {
        fa = new FibonacciActions();
    }

    //Right now they are in the basic form!
    @Override
    public int numByOrderManager(int location) {
        while (true) {
            try {
                int answer = fa.numByOrder(location);
                return answer;
            } catch (IndexOutOfBoundsException e) {
                fa.extendList();
            }
        }
    }

    @Override
    public int orderByNumManager(int wantedNum) {
        return (fa.fibonacciList.indexOf(wantedNum));
    }

    @Override
    public String displayList() {
        String fibonaccyListS = fa.toString();
        return fibonaccyListS;
    }
}
