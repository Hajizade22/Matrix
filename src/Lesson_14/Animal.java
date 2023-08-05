package Lesson_14;

abstract public class Animal {
    public abstract String sound();

    public String sleep() {
        return "An animal is sleeping";
    }
}

class Cat extends Animal {
    private String purr;

    @Override
    public String toString() {
        return purr;
    }

    public Cat(String purr) {
        this.purr = purr;
    }

    @Override
    public String sound() {
        return " Meow ";
    }

}

class Dog extends Animal {
    private String fetch;

    @Override
    public String toString() {
        return fetch;

    }

    public Dog(String fetch) {
        this.fetch = fetch;

    }

    @Override
    public String sound() {
        return " Woof ";
    }


}

class main {
    public static void main(String[] args) {
        Cat cat = new Cat(" Cat is purring ");
        System.out.println(cat.sleep() + cat.sound() + cat);
        Dog dog = new Dog(" Dog is fetching a ball ");
        System.out.println(dog.sleep() + dog.sound() + dog);
    }
}




