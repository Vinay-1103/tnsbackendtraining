package me.vinay.tns.oopsexercise.inheritance;

public class Student extends person {

        private short rollNo;
        private String course;

        public String getCourse() {
            return course;
        }

        public short getRollNo() {
            return rollNo;
        }

        public void setCourse(String course) {
//            this.rollNo=rollNo;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Rollno is :"+rollNo+ " Course :"+course;
        }
    }
