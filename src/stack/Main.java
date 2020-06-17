package stack;

import myCollection.MyCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list2.add(5);
        list2.add(6);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.addAll(list2));
        System.out.println(list);
        list.pop();
        System.out.println(list);









    }



}
