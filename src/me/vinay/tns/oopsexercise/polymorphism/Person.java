package me.vinay.tns.oopsexercise.polymorphism;

public class Person {
    protected String name;
    public Person(String name){
        this.name=name;
    }
    public void displayDetails(){
        System.out.println("I am a person & My name is "+name);
    }
    public void greet(){
        System.out.println("Hi everyOne");
    }
}
