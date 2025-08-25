package me.vinay.tns.oopsexercise.inheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setSalary(150000);
        person person=new person();
//        person.setName("Vinay");
//        person.setAddress("MTPALLY");
        person.setPhone(996645788);
        employee.setName("Vinay");
        employee.setAddress("MtPally");
        System.out.println(employee);

    }
}
