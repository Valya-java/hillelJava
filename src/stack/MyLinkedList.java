package stack;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList implements Collection {
    private Node head;
    private Node last;
    private int size = 0;


    private class Node {
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data, Node prev, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    @Override
    public boolean add(Object o) {
        Node l = last;
        Node newNode = new Node(o, l, null);
        last = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
        return true;
    }

    public Object pop() {
        Object result = head.data;
        head = head.next;
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        Node current = head;
        while (current != null) {
            result += current.data + ", ";
            current = current.next;
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
        return new Iterator(head);
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node x = head; x != null; x = x.next)
            result[i++] = x.data;
        return result;
    }


    public Object removeNode(Node x) {
        Object result = x.data;
        Node next = x.next;
        Node prev = x.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.data = null;
        size--;
        return result;

    }


    @Override
    public boolean remove(Object o) {
        for (Node x = head; x != null; x = x.next) {
            if (o.equals(x.data)) {
                removeNode(x);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] objects = c.toArray();
        for (Object e : objects)
            add(e);
        return true;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        if (containsAll(c)&&c.size()==size())
            return false;
        MyLinkedList result = new MyLinkedList();
        for (int i = 0; i < c.size(); i++) {
            if (contains(c.toArray()[i]))
                result.add(c.toArray()[i]);
        }
        head = result.head;
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
        if (a.length < size())
            return toArray();
        int i = 0;
        Object[] result = a;
        for (Node x = head; x != null; x = x.next)
            result[i++] = x.data;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    private class Iterator implements java.util.Iterator{

        private Node current;
        private int index;


        public Iterator(Node current) {
            this.current = current;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return (index<size());
        }

        @Override
        public Object next() {
            Object result = current.data;
            index++;
            current = current.next;
            return result;
        }
    }
}

