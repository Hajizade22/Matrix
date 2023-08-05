package Lesson_13;

import java.util.Objects;

public class ClassWork {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassWork classWork = (ClassWork) o;
        return age == classWork.age && Objects.equals(name, classWork.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClassWork(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
    class work extends ClassWork {
        private String work;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            work work1 = (work) o;
            return Objects.equals(work, work1.work);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), work);
        }

        public String getSurname() {
            return work;
        }

        @Override
        public String toString() {
            return getName() + getSurname() + getAge();
        }

        public work(String name, int age, String surname) {
            super(name, age);
            this.work = surname;

        }
    }
        class main {
            public static void main(String[] args) {
                work abc = new work("Yusif", 0, "Hacizade");
                work abc1 = new work("Yusif", 0, "Hacizade");
                work abc2=abc;

//                System.out.println(abc.equals(abc1));
                System.out.println(abc==abc1);
//                System.out.println(abc2 == abc);
            }
        }




