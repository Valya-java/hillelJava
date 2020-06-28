package stack;

import myCollection.MyCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list.add(1);
        list.add(5);
        list.add(6);
        list2.add(6);
        list2.add(9);
        list2.add(622);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.retainAll(list2));
        System.out.println(list);











    }



}
