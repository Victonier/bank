package fancybank.data.Handlers;

import java.lang.reflect.Array;

public interface ArrayAppend<T> {
    public default T[] addElement(T[] arr, T t) {
        try {
            T[] arrNew = (T[]) Array.newInstance(arr.getClass().getComponentType(), arr.length + 1);
            for(int i = 0; i < arr.length; i ++) {
                arrNew[i] = arr[i];
            }
            arrNew[arr.length] = t;
            return arrNew;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
