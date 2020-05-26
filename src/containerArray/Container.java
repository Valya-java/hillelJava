package containerArray;

public class Container {

    private int[] array = new int[10];
    private int size = 0;

    public Container() {
    }

    public void print() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i] + ", ";
        }

        if (!s.isEmpty()) {
            s = s.substring(0, s.length() - 2);
        }
        s = "[" + s + "]";
        System.out.println(s);
    }

    public int size() {
        return size;
    }

    public void clear() {
        array = new int[0];
    }

    public int indexOf(int toFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index) {
        return array[index];
    }

    private int[] createCopy(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public void add(int el) {
        if (size == array.length) {
            int[] newArray = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = el;
        size++;

    }

    public boolean isEmpty() {
        return size == 0;
    }

}
