package me.vinay.tns.assignments;

import java.util.Scanner;

public class TicketBookingMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] aa=sc.nextLine().split(",");
        String event=aa[0];//sc.nextLine();
        String customer=aa[1];//sc.nextLine();
        int seats=Integer.parseInt(aa[2]);//sc.nextInt();

        TicketBooking tb=new TicketBooking(event,customer,seats);
        System.out.println("Payment choice:");
        System.out.println("1.Cash payment");
        System.out.println("2.Wallet payment");
        System.out.println("3.Credit card payment");

        int choice= sc.nextInt();
        switch (choice){
            case 1 -> {
                System.out.println("Enter amount");
                double amount= sc.nextDouble();
                tb.display();
                tb.makePayment(amount);
            }
            case 2->{
                System.out.println("Enter wallet No.");
                String walletNo=sc.nextLine();
                sc.nextLine();
                System.out.println("Enter amount");
                double amount=sc.nextDouble();
                tb.display();
                tb.makePayment(amount,walletNo);
            }
            case 3 ->{
                System.out.println("Enter credit Card Number");
                String credicard=sc.nextLine();
                sc.nextLine();
                System.out.println("Enter CVV ");
                String cvv=sc.nextLine();
                System.out.println("Enter cardholder name");
                String name=sc.nextLine();
               // sc.nextLine();
                System.out.println("Enter amount");
                double amount = sc.nextDouble();
                tb.display();
                tb.makePayment(credicard,cvv,name,amount);
            }
            default -> System.out.println("Invalid choice");
        }
    }
}
