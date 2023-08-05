package Lesson_12_2;

    public class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void speak() {
            System.out.println("An animal speaks!");
        }
    }

        class Dog extends Animal {
        private int bir;
        public Dog(String name,int bir) {
            super(name);
            this.bir=bir;
        }

        @Override
        public void speak() {
            super.speak();  // calls the speak() method of the Animal class
            System.out.println("A dog barks!");
        }
    }

       class psvm {
        public static void main(String[] args) {
            Dog dog = new Dog("Fido",1);
            dog.speak();
        }
    }