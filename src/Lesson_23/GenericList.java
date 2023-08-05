package Lesson_23;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> elements;

    public GenericList() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException();
        }
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }

}

class Main {
    public static void main(String[] args) {
        GenericList<Integer> integerList = new GenericList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);


        for (int i = 0; i < integerList.size(); i++) {
            int element = integerList.get(i);
            System.out.println(element);
        }


        GenericList<String> stringList = new GenericList<>();

        stringList.add("Hello");
        stringList.add("World");


        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }
    }
}







