package me.vinay.tns.oopsexercise.polymorphism;

public class Employee extends Person{

    private String EmpId;

    public Employee(String name,String EmpId){
        super(name);
        this.EmpId=EmpId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Hi I am "+name+"an employee with empId "+EmpId);
    }
    public void work(){
        System.out.println("I am working on project ");
    }
}
