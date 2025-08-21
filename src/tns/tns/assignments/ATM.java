package tns.tns.assignments;

public  class ATM {
    private double balance=10000.94;
    private final int validPassword=1103;


     int validatePassword(int password) throws InvalidPinException{
        if (password!=validPassword){
            throw new InvalidPinException("Password is not valid.Enter correct password");
        }
        System.out.println("Authentication sucessfully Done");
        return 1;
    }
     void withdraw(double amount) throws InsufficientBalanceException{
        if (amount>balance){
            throw new InsufficientBalanceException("Insufficent balance,Check Balance ,Enter valid amount");
        }
         balance-=amount;
         System.out.printf("Withdrawn amount :%.3f |Balance in Account :%.3f ",amount,balance);
         System.out.println();
    }

    void balanceInAccount(){
        System.out.println(balance);
    }
    void addAmount(double amount) {
         balance+=amount;
        System.out.printf("Amount added :%.3f|Balance in Account :%.3f ",amount,balance);
        System.out.println();
    }
}
