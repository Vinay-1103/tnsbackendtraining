package me.vinay.tns.collections.comparable;

public class Student  implements Comparable<Student> {
        
        int sid;
        String name;
        int marks;

        public Student(int sid, String name, int marks){
            super();
            this.sid = sid;
            this.name = name;
            this.marks = marks;
        }

        // compareTo method (natural ordering by marks)
        @Override
        public int compareTo(Student s1) {
            return this.marks - s1.marks;  // ascending order
            // return s.marks - this.marks; // descending order
        }

        @Override
        public String toString() {
            return sid + " " + name + " " + marks;
        }

    }

