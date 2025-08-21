package tns.tns.assignments;

import java.util.Scanner;

public class ATMmain {
    public static void main(String[] args) {
            ATM atm=new ATM();
            Scanner sc=new Scanner(System.in);
            String option;
        try {
            System.out.print("Enter Password :");
            int pass=sc.nextInt();
            int result=atm.validatePassword(pass);
            do{
            if (result==1){
                System.out.println("*******Welcome*******");
                System.out.println("1.CheckBalance");
                System.out.println("2.Withdraw");
                System.out.println("3.Add amount");
                int choice= sc.nextInt();
                switch (choice){
                    case 1 ->{
                        atm.balanceInAccount();
                    }
                    case 2->{

                        try{System.out.println("Enter amount :");
                        double amount=sc.nextDouble();
                        atm.withdraw(amount);
                        }
                        catch (InsufficientBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 3->{
                        System.out.println("Enter amount :");
                        double amount=sc.nextDouble();
                        atm.addAmount(amount);
                    }
                    default -> System.out.println("Invalid choice");
                }
            }
                System.out.println("Enter 1 for goto options ,press any key for Exit ");
                option=sc.next();
            }while (option.equals("1"));
        }catch (InvalidPinException e){
            System.out.println(e.getMessage());
        }

    }
}
