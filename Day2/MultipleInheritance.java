interface Payment1{
    void pay();
}
interface payment2{
    void pay();
}
class UPI implements Payment1, payment2 {
    public void pay(){
        System.out.println("Payment Pending");
    }
}
class MultipleInheritance{
    public static void main(String[]args){
        UPI upi = new UPI();
        upi.pay();
    }
}

