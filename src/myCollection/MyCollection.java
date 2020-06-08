package myCollection;


import students.Student;


public class MyCollection {
    
    private Object[] array= new Object[0];

    public int size(){
        return array.length;
    }

    public void add(Object object ){
        Object [] newArray = new Object[array.length + 1];
        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array [i];
        }
        newArray[array.length] = object;
        array = newArray;

    }

    public boolean contains(Object object){
        for(Object o: array){
            if(o.equals(object))
                return true;
        }
        return false;

    }

    private Object [] createCopy(Object [] array){
        Object [] result = new Object[array.length];
        for (int i = 0; i <array.length ; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public boolean isEmpty(){
        return array.length == 0;
    }

    public void addAll(MyCollection collection){
        for (int i = 0; i <collection.array.length ; i++) {
            add(collection.array[i]);

        }

    }

    public boolean remove(Object object) {
        if (contains(object)) {
            Object[] result = new Object[array.length - 1];
            int k = 0;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i].equals(object)) {
                    k = 1;
                }

                result[i] = array[i + k];
            }
            array = result;
            return true;

        }
        else return false;
    }

    public boolean removeAll(MyCollection collection){
        MyCollection result = new MyCollection();
        result.array = createCopy(array);
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <collection.size() ; j++) {
                if(array[i].equals(collection.get(j)))
                   result.remove(array[i]);
            }
        }
        array = result.array;
        return true;

    }

    public boolean containsAll(MyCollection collection){
        int count = 0;
        for (int i = 0; i <collection.size() ; i++) {
            if(contains(collection.get(i)))
                count++;
        }
        if(count == collection.size())
            return true;
        return false;
    }


    public boolean retainAll(MyCollection collection) {
        MyCollection result = new MyCollection();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <collection.size() ; j++) {
                if(array[i].equals(collection.get(j)))
                    result.add(array[i]);
            }
        }
        array = result.array;
        return true;
    }

    public void clear(){
        array = new Object[0];
    }

    public Object get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        String result = "";
        for (Object o : array) {
            result += o + ", ";
        }
        if (result.length() != 0)
            result =  result.substring(0, result.length() - 2) ;
        return "[" + result + "]";

    }
}
