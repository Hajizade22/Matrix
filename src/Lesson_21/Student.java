package Lesson_21;

public class Student {
    String name;
    Grade Grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.Grade = grade;
    }

    public void displayGrade() {
        System.out.println("AD: " + name);
        System.out.println("BAL: " + Grade);
    }

    public void promoteStudent() {
        switch (Grade) {
            case A, B:
                Grade = Grade.A;
                break;
            case C:
                Grade = Grade.B;
                break;
            case D:
                Grade = Grade.C;
                break;
            case E:
                Grade = Grade.D;
                break;
            case F:
                Grade = Grade.E;
                break;
        }
    }
}
     class Score {
        double value;

        public Score(double value) {
            this.value = value;
        }

        public Grade convertToGrade() {
            if (value > 90) {
                return Grade.A;
            } else if (value >= 80) {
                return Grade.B;
            } else if (value >= 70) {
                return Grade.C;
            } else if (value >= 60) {
                return Grade.D;
            } else if (value>=51) {
                return Grade.E;
            } else {
                return Grade.F;
            }
            }
        }




