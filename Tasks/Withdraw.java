class Withdraw extends Bank
{
    void withdrawAmount(int amount)
    {
        balance = balance - amount;

        System.out.println("Withdraw Amount: " + amount);
        System.out.println("Balance After Withdraw: " + balance);
    }
}