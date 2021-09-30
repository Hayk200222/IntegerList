package com.company;

public interface List {
    int size();
    boolean contains(int number);
    void add(int number);
    void addAll(int [] numbers);
    boolean isEmpty();
    int firstIndexOf(int number);
    int lastIndexOf(int number);
    boolean removeFirst (int number);
    boolean removeLast(int number);
    boolean romoveAll(int number);

}
