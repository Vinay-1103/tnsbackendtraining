package me.vinay.tns.oopsexercise.abstraction;

abstract public class Vehicle {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    abstract void fuel();

    void display(){
        System.out.println("used in "+ this.name);
    }


}
