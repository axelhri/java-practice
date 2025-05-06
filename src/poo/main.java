package poo;

public class main {
    public static void main(String[] args) {

        /* CAR */

        car car = new car();
        car car2 = new car();

        car.year = 1995;

        System.out.println(car.make + " " + car.model + " " + car.year);
        System.out.println(car2.make + " " + car2.model + " " + car2.year);


        System.out.println(car.getCarModel());

        /* STUDENT */System.out.println("*********************");

        student student1 = new student("axel",25, 16.0);
        /*student student2 = new student();*/

        student1.getInfo();
    }
}
