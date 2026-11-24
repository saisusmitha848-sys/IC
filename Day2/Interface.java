interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment done");
    }
}
class Interface{
    public static void main(String[]args){
        UPI upi = new UPI();
        upi.pay();
    }
}

