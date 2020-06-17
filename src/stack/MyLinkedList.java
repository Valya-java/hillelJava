package stack;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList implements Collection {
    private Node head;
    private Node last;
    int size = 0;

    public MyLinkedList() {
        last = new Node(null, head, null);
        head = new Node(null, null, last);
    }

    private class Node {
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data, Node prev, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }
    }


    @Override
    public boolean add(Object o) {
        Node newNode = last;
        newNode.setData(o);
        last = new Node(null, newNode, null);
        newNode.setNext(last);
        size++;
        return true;
    }

    //public Object pop(){
    //if(head == null){
    //System.out.println("Could not get from empty");

    //}
    //Object result = head.getData();

    //head = head.getNext();

    //return result;

    // }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String result = "";
        Node current = head.getNext();
        while (current != last) {
            result += current.getData() + ", ";
            current = current.getNext();
        }

        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 2);
        }

        return "[" + result + "]";
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        for (Node x = head; x != null; x = x.next) {
            if (o.equals(x.data))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node x = head.getNext(); x != last; x = x.next)
            result[i++] = x.data;
        return result;
    }


    @Override
    public boolean remove(Object o) {
        for (Node x = head.getNext(); x != last; x = x.next) {
            if (o.equals(x.data)) {
                Node first = x.prev;
                Node last = x.next;
                last.prev = x.prev;
                first.next = x.next;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] objects = c.toArray();
        for (Object object : objects) {
            add(object);
        }
        return true;
    }

    @Override
    public void clear() {
        head.next = null;
        size = 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        if (containsAll(c))
            return false;
        for (int i = 0; i < c.size(); i++) {
            if (!contains(c.toArray()[i]))
                remove(c.toArray()[i]);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        int count = 0;
        for (int i = 0; i < c.size(); i++) {
            if (contains(c.toArray()[i])) {
                remove(c.toArray()[i]);
                count++;
            }
        }
        if (count > 0)
            return true;
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        int count = 0;
        for (int i = 0; i < c.size(); i++) {
            if (contains(c.toArray()[i]))
                count++;
        }
        if (count == c.size())
            return true;
        return false;
    }


    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

