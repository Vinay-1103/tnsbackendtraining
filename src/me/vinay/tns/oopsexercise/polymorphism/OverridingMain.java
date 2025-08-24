package me.vinay.tns.oopsexercise.polymorphism;

public class OverridingMain {
    public static void main(String[] args) {
        Person person;

        person=new Student("Vinay",94);
        person.displayDetails();

        person=new Employee("Kumar","RA94");
        person.displayDetails();
        Student student=new Student("Korakoppula",6694);
        student.displayDetails();
        student.study();
        student.greet();

        person=new Person("Vinay Kumar");
        person.displayDetails();
        person.greet();
    }
}
