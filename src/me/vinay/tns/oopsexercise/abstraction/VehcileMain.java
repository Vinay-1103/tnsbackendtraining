package me.vinay.tns.oopsexercise.abstraction;


public class VehcileMain {
    public static void main(String[] args) {
//        Vehicle vehicle=new Bike();
//        vehicle.fuel();
//        vehicle.setName("HERO");
//        vehicle.display();
//        System.out.println(vehicle.getName());
        Vehicle veh2;
        veh2=new EvVehicle();
        veh2.setName("TataEV");
        veh2.fuel();
        veh2.display();
        Vehicle veh1=new Car();
        veh1.fuel();
        veh1.setName("BMW");
        veh1.display();
    }
}
