package me.vinay.tns.oopsexercise.inheritance;

public class Employee extends person {

        private  String empId;
        private float salary;

        public Employee(){
            System.out.println("This is employe constructor");
        }

        public String getEmpId() {
            return empId;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

    @Override
    public String toString() {
        return "Name "+getName()+"Address"+getAddress()+"Salary"+salary;
    }
}

