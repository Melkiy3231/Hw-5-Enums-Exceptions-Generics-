package main.java.com.yaroslavshchur;
import main.java.com.yaroslavshchur.generic.MyList;
public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(112);
        myList.add(1333);
        myList.add(92);
    }
         System.out.println("List - 1 Min = "+myList.getMin());
         System.out.println("List - 1 Max = "+myList.getMax());
}
