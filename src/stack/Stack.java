package stack;

import java.util.Arrays;

public class Stack {

    private Object[] data = new Object[0];


    public void push(Object o){
        Object[] newData = new Object[data.length + 1];
        newData[0] = o;
        for (int i = 0; i < data.length ; i++) {
            newData[i+1] = data[i];
        }
        data = newData;
    }

    public Object pop(){
        Object result = data[0];

        Object[] newData = new Object[data.length - 1];
        for (int i = 1; i < data.length ; i++) {
            newData[i-1] = data[i];
        }
        data = newData;
        return result;
    }

    @Override
    public String toString() {
        return  Arrays.toString(data);
    }
}
