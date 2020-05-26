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

    public int getSize() {
        return size;
    }

    public boolean contains(int toContains) {
        for (int el : array) {
            if (el == toContains)
                return true;
        }
        return false;
    }

    public void clear() {
        array = new int[0];
        size = 0;
    }

    public int indexOf(int toFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public int[] addAll(int[] arrayToAdd) {
        for (int a : arrayToAdd)
            add(a);
        return array;
    }

    public boolean equals(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i])
                    return true;
            }
        }
        return false;
    }

    public int get(int index) {
        return array[index];
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

    public void sort() {
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

}
