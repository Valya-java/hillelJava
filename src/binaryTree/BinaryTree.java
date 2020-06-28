package binaryTree;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BinaryTree implements Set {


    private Node root;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(Object o) {
        return containsIn((Integer) o, root);
    }

    private boolean containsIn(int i, Node node) {
        if (node == null)
            return false;
        if (node.data == i) {
            return true;
        } else if (node.data > i)
            return containsIn(i, node.left);
        else
            return containsIn(i, node.right);
    }

    private Node findNode(Object o, Node node) {
        Integer data = (Integer) o;
        if (node.data == data)
            return node;
        else if (node.data > data)
            return findNode(o, node.left);
        else return findNode(o, node.right);
    }


    @Override
    public String toString() {
        String result = print(root);
        if (!result.isEmpty())
            result = result.substring(0, result.length() - 2);
        return "[" + result + "]";
    }

    private String print(Node node) {
        String result = "";
        if (node == null)
            return result;
        result += print(node.left);
        result += node.data + ", ";
        result += print(node.right);
        return result;

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node x = root; x != null; x = x.left)
            result[i++] = x.data;
        for (Node x = root.right; x != null; x = x.right)
            result[i++] = x.data;
        return result;
    }

/*    public void getData(Node node) {
        if (node != null){
            getData(node.left);
            System.out.println(node.data);
            getData(node.right);}
    }*/

    @Override
    public boolean add(Object o) {
        Integer data = (Integer) o;
        Node newNode = new Node(data);
        if (root == null)
            root = newNode;
        else
            appendToNode(data, root);
        size++;
        return true;
    }

    private void appendToNode(Integer toAdd, Node node) {
        if (node.data == toAdd)
            return;
        else if (node.data > toAdd) {
            if (node.left == null)
                node.left = new Node(toAdd);
            else
                appendToNode(toAdd, node.left);

        } else {
            if (node.right == null)
                node.right = new Node(toAdd);
            else
                appendToNode(toAdd, node.right);

        }

    }


    @Override
    public boolean remove(Object o) {
        Node remove = findNode(o, root);
        remove.data = null;
        size--;
        return true;
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
        root = null;
        size = 0;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
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


    private class Node {
        Integer data;
        Node left;
        Node right;

        public Node(Integer data) {
            this.data = data;
        }
    }

}
