package Lesson_8;

public class Name {

    String name;
    int age;
    String surname;

    public String getName() {
        return "Ad: " + name;
    }

    public void setName(String ad, String ataAdi) {
        this.name = ad + " "+ ataAdi + " oglu";
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }
}
