package pl.sda.krzysztof.fourthday;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {

    private List<T> underlyingList = new ArrayList<>();

    public void offer(T someObject) {
        underlyingList.add(someObject);
    }

    public T pool() {
        return underlyingList.remove(0);
    }

    public void printAll() {
        for (T obj : underlyingList) {
            System.out.println(obj.toString());
        }
    }
}
