 // are for single line comments and /* ...comments... */ are for multi-line comments.

import java.util.ArrayList;

public class CafeUtil {
    /*Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks */
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i=1; i<= numWeeks; i++){
            sum+=i; 
        }
        return sum;

    }
    
    //Given an array of item prices from an order, add all of the prices in the array and return the total.

    public double getOrderTotal(double[] prices){
        double total=0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
//Given an ArrayList of menu items (strings), print out each index and menu item.

    public void displayMenu(ArrayList<String> menuItems){
        for( int i=0; i< menuItems.size(); i++){
            System.out.printf("%s: %s \n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people ahead of you.\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
        // Price chart
        // create a method that prints the cost for buying 1, then the price for buying 2, then for 3 and so on, up to the max

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.printf("%s \n", product);
        for(int i=1; i<=maxQuantity; i++)
        System.out.printf("%s : $%.2f\n", i, (price*i));
    }


      // Display Coffee Menu

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            return false;
        }
        else{
            for (int i=0; i< menuItems.size(); i++) {
                System.out.printf(" %s : %s  -- $%.2f \n", i, menuItems.get(i), prices.get(i));
            }
        }
        return true;
    }


    /* 
    Make a method addCustomers where a barista can enter multiple customers. 
    Hint: You can use a while loop and ask the user to type q when they are finished entering names.
    */

    public void addCustomers(ArrayList<String> customerList) {

         boolean stop= false;
         while (!stop) {
            System.out.println("Please enter a customer name or press q to quit:");
            String customerName = System.console().readLine();
            if(customerName.equals("q")){
                stop=true;
                return ;
            }
            customerList.add(customerName);
            System.out.printf("%s was added to the list of customers \n", customerName);
            System.out.println(customerList);

        }
    }

    
}