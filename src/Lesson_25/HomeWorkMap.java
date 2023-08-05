package Lesson_25;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HomeWorkMap {
    public void start() {
        Random random = new Random();
        int value = 0;
        int numberYusif = 100;
        int randomNumber1 = random.nextInt(100) + 1;
        int randomNumber2 = random.nextInt(100) + 1;
        int randomNumber3 = random.nextInt(100) + 1;

        Map<String, Integer> student = new HashMap<>();
        student.put("Yusif", numberYusif);
        student.put("Elmin", randomNumber1);
        student.put("İbrahim", randomNumber2);
        student.put("Əhməd", randomNumber3);
        for (Map.Entry<String, Integer> a : student.entrySet()) {
            System.out.println(a.getKey() + " : " + a.getValue());
            if (a.getValue() >= 51 && a.getValue() <= 80) {
                System.out.println(a.getKey() + " Orta nəticə topladı");
            } else if (a.getValue() >= 81 && a.getValue() <= 100) {
                System.out.println(a.getKey() + " Yuxarı nəticə topladı");
            } else {
                System.out.println(a.getKey() + " Aşağı nəticə");
            }
        }
        int enYuksekBal = Collections.max(student.values());
        String enYuksekBalAlan = null;
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            if (entry.getValue() == enYuksekBal) {
                enYuksekBalAlan = entry.getKey();
                break;
            }
        }
        System.out.println("Ən yüksək bal alan tələbə: " + enYuksekBalAlan + ", Bal: " + enYuksekBal);

        for (int number : student.values()) {
            value += number;
        }
        System.out.println("Tələbələrin ortalama Balları :" + value / student.size());
    }
}




