package binaryTree;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set set = new BinaryTree();
        System.out.println(set);
        Set set2 = new BinaryTree();
        set2.add(8);
        set2.add(9);
        set2.add(2);
        System.out.println(set2);
        set.addAll(set2);
        System.out.println(set.size());
        System.out.println(set);



    }
}
