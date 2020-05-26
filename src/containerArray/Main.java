package containerArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Container container = new Container();
        container.print();
        container.add(1);
        container.print();
        System.out.println(container.getSize());
        container.add(2);
        container.add(6);
        container.add(2);
        container.add(2);
        container.print();
        System.out.println(container.contains(8));
        container.addAll(new int[]{9, 8, 10});
        container.print();
        System.out.println(container.equals(new int[]{1, 2, 3}, new int[]{1, 2, 3, 5}));
        container.sort();
        container.print();


    }
}
