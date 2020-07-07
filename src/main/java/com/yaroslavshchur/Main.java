package main.java.com.yaroslavshchur;


import main.java.com.yaroslavshchur.generic.MyList;


public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();
        myList.add(3);
        myList.add(32);
        myList.add(26);

        System.out.println("Largest number: " + myList.getMaxValue());
        System.out.println("Smallest number: " + myList.getMinValue());
    }
}