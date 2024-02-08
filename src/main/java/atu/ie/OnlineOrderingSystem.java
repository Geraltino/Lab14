package atu.ie;


public class OnlineOrderingSystem {
    public static void main(String[] args) {
        // Create an array or list of MenuItem object
        MenuItem[] menuItems = new MenuItem[]{
         new Burger("Cheese Borgur",10,"Craft's Singles, Beef Patty"),
         new Pizza("PizzaName",12,"nahlol"),
         new Salad("Ceaser Salad", 8, "Julius Caeser"),
         new Dessert("Sahara",8,"It is a dessert about the desert(Sand)")

};


        // Display details of each menu item
        for (MenuItem menuItem : menuItems){
            System.out.println("Name: "+ menuItem.getName());
            System.out.println("Description: "+ menuItem.getDescription());
            System.out.println("Price: €"+ menuItem.getPrice() + "\n");
        }

        // Calculate and display the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            totalCost += menuItem.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}