package pl.sda.krzysztof.fourthday;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {

    List<T> listOfItems = new ArrayList<>();

    public void offer(T t){
        listOfItems.add(t);
    }

    public T pool(){

        return listOfItems.remove(0);
    }

    public void printAll(){
        listOfItems.forEach(s -> System.out.println(s.toString()));
    }

}
