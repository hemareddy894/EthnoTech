class BankBalance{
private int balance;
public void setbalance(int balance){
this.balance=balance;
}
public int getbalance(){
return balance;
}
public static void main(String[] args)
{
BankBalance ob1=new BankBalance();
ob1.setbalance(1000);
BankBalance ob2=new BankBalance();
ob2.setbalance(2000);
System.out.println(ob1.getbalance());
System.out.println(ob2.getbalance());
}
}