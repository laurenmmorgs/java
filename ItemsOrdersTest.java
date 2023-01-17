import java.util.ArrayList;
public class ItemsOrdersTest {
    public static void main(String[] args) {
      

      Items item1 = new Items();
        item1.name = "Drip Coffee";
        item1.price = 2.5;

      Items item2 = new Items();
         item2.name = "Latte";
         item2.price = 3.5;

      Items item3 = new Items();
         item3.name = "Cap";
         item3.price = 4.5;
      
      Items item4 = new Items();
         item4.name = "Mocha";
         item4.price = 5.5;    

      Orders order1 = new Orders();
         order1.name = "Cindhuri";
         order1.total = item1.price + item2.price;
         order1.ready = true;

      Orders order2 = new Orders();
         order2.name = "Jimmy";
         order2.total = item2.price;
         order2.ready = true;


      Orders order3 = new Orders();
         order3.name = "Noah";
         order3.total = item3.price;
         order3.ready = true;
      
      Orders order4 = new Orders();
         order4.name = "Sam";
         order4.total = item2.price *2;
         order4.ready = true;



        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
