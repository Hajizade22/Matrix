package Lesson_26;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassWork {
    public static void main(String[] args) {
        List<Test> peoples=List.of(
                new Test("Yusif",1),
                new Test("Anar",15),
                new Test("Orxan",25),
                new Test("Tural",35));

        List<Test> test=peoples.stream().filter(a-> a.getAge()>=30).toList();
        System.out.println("Yaslari 30-an boyuk olanlar :" + test);

        List<String> test2=peoples.stream().map(Test::getName).toList();
        System.out.println(test2);

        double test3=peoples.stream().mapToInt(Test::getAge).average().orElse(0.0);
        System.out.println(test3);

        Test oldestPerson = peoples.stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .orElse(null);

        System.out.println("Oldest person: " + oldestPerson);

        Map<String, Integer> personMap = peoples.stream()
                .collect(Collectors.toMap(Test::getName, Test::getAge));

        System.out.println("Person map: " + personMap);
    }
    }

