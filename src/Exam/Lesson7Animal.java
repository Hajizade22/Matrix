package Exam;

public class Lesson7Animal {

    String name;
    int age;
    String sound;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return "dog";
    }

    public int getAge() {
        return 4;
    }

    public Lesson7Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Lesson7Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                '}';
    }
}

