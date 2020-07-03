package stack;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList implements Collection, List {
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
    public boolean addAll(int index, Collection c) {
        Object[] objects = c.toArray();
        for (Object e : objects) {
            add(index, e);
            index++;
        }
        return true;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        if (index <= size && index >= 0) {
            Node result = node(index);
            return result.data;
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public Object set(int index, Object element) {
        if (index <= size && index >= 0) {
            Node result = node(index);
            Object o = result.data;
            result.data = element;
            return o;
        } else throw new IndexOutOfBoundsException();
    }

    Node node(int index) {

        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;

    }

    @Override
    public void add(int index, Object element) {
        if (index <= size && index >= 0) {
            if (index == size)
                add(element);
            if (index == 0) {
                Node newNext = head;
                Node newNode = new Node(element, null, newNext);
                head = newNode;
                size++;
            } else {
                Node newPrev = node(index - 1);
                Node newNext = node(index);
                Node newNode = new Node(element, newPrev, newNext);
                newPrev.next = newNode;
                newNext.prev = newNode;
                size++;

            }
        } else throw new IndexOutOfBoundsException();

    }

    @Override
    public Object remove(int index) {
        if (index <= size && index >= 0) {
            Node result = node(index);
            Object o = result.data;
            removeNode(result);
            return o;
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size;
        if (o == null) {
            for (Node x = last; x != null; x = x.prev) {
                index--;
                if (x.data == null)
                    return index;
            }
        } else {
            for (Node x = last; x != null; x = x.prev) {
                index--;
                if (o.equals(x.data))
                    return index;
            }
        }

        return -1;

    }

    @Override
    public ListIterator listIterator() {
        return new ListIterator(0);
    }

    @Override
    public ListIterator listIterator(int index) {
        return new ListIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        MyLinkedList result = new MyLinkedList();
        for (int i = fromIndex; i < toIndex; i++) {
            result.add(get(i));
        }
        return result;
    }

    @Override
    public boolean retainAll(Collection c) {
        if (containsAll(c) && c.size() == size())
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

    private class Iterator implements java.util.Iterator {

        private Node current;
        private int index;


        public Iterator(Node current) {
            this.current = current;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return (index < size());
        }

        @Override
        public Object next() {
            Object result = current.data;
            index++;
            current = current.next;
            return result;
        }
    }

    private class ListIterator implements java.util.ListIterator {
        private Node current;
        private Node next;
        private int nextIndex;


        public ListIterator(int index) {
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }

        @Override
        public boolean hasNext() {
            return (nextIndex < size());
        }

        @Override
        public Object next() {
            current = next;
            next = next.next;
            nextIndex++;
            return current.data;
        }

        @Override
        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        @Override
        public Object previous() {
            current = next = (next == null) ? last : next.prev;
            nextIndex--;
            return current.data;
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            return nextIndex - 1;
        }

        @Override
        public void remove() {
            Node lastNext = current.next;
            removeNode(current);
            if (next == current)
                next = lastNext;
            else
                nextIndex--;
            current = null;

        }

        @Override
        public void set(Object o) {
            current.data = o;

        }

        @Override
        public void add(Object o) {
            current = null;
            if (next == null) {
                Node l = last;
                Node newNode = new Node(o, l, null);
                last = newNode;
                if (l == null)
                    head = newNode;
                else
                    l.next = newNode;
                size++;
            } else {
                Node newPrev = node(nextIndex - 1);
                Node newNext = node(nextIndex);
                Node newNode = new Node(o, newPrev, newNext);
                newPrev.next = newNode;
                newNext.prev = newNode;
                size++;

            }
            nextIndex++;
        }
    }


}

