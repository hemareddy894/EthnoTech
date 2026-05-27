public class Electricity
{
     public static void main(String[] args)
     {
          int b=500;
          int limit=250;
          int cost=50;
          if(limit > b || limit == b)
          {
               System.out.println("Electricity bill is 0 ");
          }
          else
          {
              System.out.println("Electricity bill is : "+ (b-limit));
           }
      
      }
}