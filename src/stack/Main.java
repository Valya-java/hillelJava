package stack;

import myCollection.MyCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        System.out.println(list);
        System.out.println(list.subList(1,5));
        System.out.println(list);


        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        a.add(1);
        a.add(5);
        a.add(6);
        a.add(8);
        a.add(9);
        System.out.println(a);
        System.out.println(a.subList(1,5));
















    }



}
