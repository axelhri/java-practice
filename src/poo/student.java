package poo;

public class student implements informable {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void getStudent() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);
    }

    @Override
    public void getInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);
        System.out.println(isEnrolled);
    }

}
