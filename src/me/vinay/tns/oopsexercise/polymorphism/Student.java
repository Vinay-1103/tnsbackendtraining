package me.vinay.tns.oopsexercise.polymorphism;

public class Student extends Person {
    private int rollNo;
    public Student (String name,int rollNo){
        super(name);
        this.rollNo=rollNo;
    }

    @Override
    public void displayDetails() {
        System.out.println("I am a Student with name "+name+" and rollNo "+rollNo);
    }
    public void study(){
        System.out.println("I am studying as I have exam tommorow");
    }
}
