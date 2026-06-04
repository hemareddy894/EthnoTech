class Main1
{
    public static void main(String args[])
    {
        Deposit d = new Deposit();

        d.showBalance();
        d.depositAmount(2000);

        System.out.println();

        Withdraw w = new Withdraw();

        w.showBalance();
        w.withdrawAmount(3000);
    }
}