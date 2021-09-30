package com.company;

public class InttegerList implements List {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private int[] elements;


    @Override
    public int size() {
        return size;
    }

    public InttegerList(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Invalid value of size");
        }
        elements = new int[size];
    }

    @Override
    public boolean contains(int number) {
        boolean check = false;
        for (int i = 0; i < size(); i++) {
            if (elements[i] == number) {
                check = true;
                break;
            }
        }
        return check;
    }

    @Override
    public void add(int number) {
        int[] newArray = new int[size() + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[newArray.length - 1] = number;
    }

    @Override
    public void addAll(int[] numbers) {

    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int firstIndexOf(int number) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == number) {
                i = index;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(int number) {
        int index = -1;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] == number) {
                i = index;
            }
        }
        return index;
    }

    @Override
    public boolean removeFirst(int number) {
        boolean check = false;
        for (int i = 0; i < size(); i++) {
            if (elements[i] == number) {
                check = true;
                removeElement(i);
                break;
            }
        }
        return check;
    }

    @Override
    public boolean removeLast(int number) {
        int[] newArray = new int[size() - 1];
        boolean check = false;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] == number) {
                check = true;
                break;
            }
            newArray[i] = elements[i];
        }
        return check;
    }

    @Override
    public boolean romoveAll(int number) {
        return false;
    }

    private void removeElement(int index) {
        int[] newArray = new int[size() - 1];
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                continue;
            }
            newArray[i] = elements[i];
        }

    }
}
