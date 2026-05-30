abstract class Restaurant
{
    protected String foodName;
    protected String beverage;
    protected int quantity;
    protected double price;
    protected double billAmount;

    Restaurant()
    {
        System.out.println("\n===== Welcome to Food Corner =====");
    }

    abstract void placeOrder();

    void displayBill()
    {
        System.out.println("\n------ Order Summary ------");
        System.out.println("Food Item : " + foodName);
        System.out.println("Drink     : " + beverage);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : ₹" + price);
    }
}

class FoodOrder extends Restaurant
{
    void placeOrder()
    {
        System.out.println("\nOrder Placed Successfully!");

        if(foodName.equalsIgnoreCase("Sandwich"))
        {
            price = 50;
        }
        else if(foodName.equalsIgnoreCase("Pizza"))
        {
            price = 80;
        }
        else if(foodName.equalsIgnoreCase("Burger"))
        {
            price = 60;
        }
        else
        {
            System.out.println("Invalid Food Item");
            return;
        }

        billAmount = price * quantity;
    }

    void displayBill()
    {
        super.displayBill();
        System.out.println("Total Bill : ₹" + billAmount);
    }
}

public class AbstractionDemo
{
    public static void main(String args[])
    {
        FoodOrder order1 = new FoodOrder();
        order1.foodName = "Pizza";
        order1.beverage = "Pepsi";
        order1.quantity = 2;
        order1.placeOrder();
        order1.displayBill();

        FoodOrder order2 = new FoodOrder();
        order2.foodName = "Burger";
        order2.beverage = "Sprite";
        order2.quantity = 1;
        order2.placeOrder();
        order2.displayBill();

        FoodOrder order3 = new FoodOrder();
        order3.foodName = "Sandwich";
        order3.beverage = "Fanta";
        order3.quantity = 3;
        order3.placeOrder();
        order3.displayBill();
    }
}