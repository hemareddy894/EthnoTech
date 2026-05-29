class Deposit extends Bank
{
    void depositAmount(int amount)
    {
        balance = balance + amount;

        System.out.println("Deposited Amount: " + amount);
        System.out.println("Balance After Deposit: " + balance);
    }
}