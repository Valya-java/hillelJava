package containerArray;

public class Container {

    private int[] array = new int[10];
    private int size = 0;

    public Container() {
    }

    public Container(int [] array){
        this.array = createCopy(array);
        addAll(this.array);
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
        int first = 0;
        int last = getSize()-1;
        int position = getSize()/2;
        while ((array[position] != toContains) && (first<=last)){
            if(array[position] > toContains){
                last = position-1;
            }
            else{
                first = position + 1;
            }
            position = (first + last)/2;
        }
        if(first<=last) return true;
        else
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

    public void addAll(int[] array) {
        for (int a : array)
            add(a);
    }

    private int [] createCopy(int[] array){
        int[] result = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public boolean equals(Container container) {
        if(size == container.getSize()){
            for (int i = 0; i <size; i++) {
                if (array[i] != container.get(i))
                    return false;
            }
            return true;
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
