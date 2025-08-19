package me.vinay.tns.assignments;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private int noOfSeats;
    private double amount;

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public TicketBooking(){
        System.out.println("Welcome to ticket booking");
    }
    public TicketBooking(String stageEvent,String customer,int noOfSeats){
        this.stageEvent=stageEvent;
        this.customer=customer;
        this.noOfSeats=noOfSeats;
    }


    public void makePayment(double amount){
        this.amount=amount;
        System.out.println("Amount "+this.amount+" paid in cash");
    }

    public void makePayment(double amount,String walletNo){
        this.amount=amount;
        System.out.println("Amount "+this.amount+" paid using wallet number"+walletNo);
    }
    public void makePayment(String credicard,String cvv,String name,double amount){
        this.amount=amount;
        System.out.println("Amount "+this.amount+" paid using Master card\nCVV :"+cvv+"\nCredit card Number :"+credicard);
    }

    void display(){
        System.out.println("Stage event :"+this.stageEvent);
        System.out.println("Customer :"+this.customer);
        System.out.println("Number of Seats :"+this.noOfSeats);
    }



}
