abstract class Foodorder
{
    String customerName;
    int quantity;
    double price;

    Foodorder()
    {
        System.out.println("Welcome to our food ordering system!");
    }

    
    Foodorder(String name,int quantity,double price)
    {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderFood();

    void generateBill()
    {
        double total = quantity * price;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Bill: " + total);
    }
}
class Pizza extends Foodorder
{
    Pizza(String name,int quantity,double price)
    {
        super(name,quantity,price);
    }

    void orderFood()
    {
        System.out.println("Pizza Ordered Successfully");
    }
}
class Main2
{
    public static void main(String args[])
    {
        Pizza p = new Pizza("Hema",2,150);

        p.orderFood();

        p.generateBill();
    }
}