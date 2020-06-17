import java.util.Collection;
import java.util.Iterator;

public class Test implements Collection {
    public static void main(String[] args) {
        Test list = new Test();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(1);
        System.out.println(list.size);
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list.remove(11));
        System.out.println(list);
    }

    private Node first;
    private Node last;
    int size = 0;


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
        Node newNode = new Node(o, first, last);
        first = newNode.getNext();
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
        String result = "";
        Node current = first.getNext();
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
        return first == null;
    }

    @Override
    public boolean contains(Object o) {
        for (Node x = first; x != null; x = x.next) {
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
        for (Node x =first.getNext(); x != last; x = x.next)
            result[i++] = x.data;
        return result;
    }


    @Override
    public boolean remove(Object o) {
        for (Node x = first; x != last; x = x.next) {
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
        first.next = null;
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




