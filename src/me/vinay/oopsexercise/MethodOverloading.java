package me.vinay.oopsexercise;

public class MethodOverloading {
        static  void print(int a){
            System.out.println("Printing integer value: "+a);
        }
        static  void print(double a){
            System.out.println("Printing double value: "+a);
        }
        static  void print(String a){
            System.out.println("Printing String value: "+a);
        }
        
        double add(int a,double b){
            return a+b;
        }

        public static void main(String[] args) {
            MethodOverloading obj=new MethodOverloading();
            System.out.println(obj.add(1,20)) ;
        print(5);
        print("Vinay");
        print(8.5);
        }
    }

