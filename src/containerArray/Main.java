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
        Container container2 = new Container(new int[] {1, 2, 6, 2, 2, 9, 8, 10});
        Container container3 = new Container(new int[] {2, 2, 6, 2});
        Container container4 = new Container(new int[] {2, 2, 6, 2});
        System.out.println(container.equals(container2));
        System.out.println(container3.equals(container2));
        System.out.println(container3.equals(container4));
        container.sort();
        container.print();


    }
}
