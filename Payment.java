interface Cashpay
{
void cash();
}
interface upi{
void pay();
}
class Pay implements Cashpay,upi{
public void cash(){
System.out.println("cash payment.");
}
public void pay(){
System.out.println("UPI payment.");
}
}
public class Payment{
public static void main(String[] args){
Pay obj=new Pay();
obj.cash();
obj.pay();
}
}
