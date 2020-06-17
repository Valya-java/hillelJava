package stack;

import myCollection.MyCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list2.add(5);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(622);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.addAll(list2));
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o.toString());}









    }



}
