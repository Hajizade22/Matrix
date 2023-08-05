package Lesson_26;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HomeWork {
    public static void main(String[] args) {
        List<Person> person = List.of
                (new Person("Samsung", 1000, "TV"),
                        new Person("LG", 1500, "Refrigerator"),
                        new Person("Apple", 2000, "Telephone"),
                        new Person("Huawei", 45, "Earphone"));

        List<Person> test = person
                .stream()
                .filter(a -> a.getPrice() > 50)
                .toList();
        System.out.println(test);

        Integer test2 = person
                .stream()
                .mapToInt(Person::getPrice)
                .sum();
        System.out.println("Total price : " + test2);

        double test3 = person
                .stream()
                .mapToInt(Person::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Average: " +test3);

        Map<String, Integer> personMap = person
                .stream()
                .collect(Collectors.toMap(Person::getCategory,Person::getPrice));
        System.out.println(personMap);
    }
}
