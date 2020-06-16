package stack;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements Collection {
    private Node head;

    public void push(Object o){
        Node newNode = new Node(o, head);
        head = newNode;

    }

    public Object pop(){
        if(head == null){
            System.out.println("Could not get from empty");
            return null;
        }
        Object result = head.getData();

        head = head.getNext();

        return result;

    }

    @Override
    public String toString() {
        String result = "";
        Node current = head;
        while(current!=null){
            result += current.getData() + ", ";
            current = current.getNext();
        }

        if(!result.isEmpty()){
            result = result.substring(0, result.length()-2);
        }

        return "[" + result + "]";
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

