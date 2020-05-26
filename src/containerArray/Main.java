package containerArray;

public class Main {
    public static void main(String[] args) {

        Container container = new Container();
        container.print();
        container.add(1);
        container.print();
        System.out.println(container.size());
        container.add(2);
        container.add(6);
        container.add(2);
        container.add(2);
        container.print();
        System.out.println(container.size());
        container.add(2);
        container.add(2);
        container.print();
        System.out.println(container.get(2));
        container.clear();
        System.out.println(container.size());
        container.print();









    }
}
