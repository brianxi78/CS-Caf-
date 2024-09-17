// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int noCups, String Flavor, boolean Whipped) {

        numberOfCups = noCups;
        flavor = Flavor;
        hasWhippedCream = Whipped;
        printInfo();

        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {

        System.out.println("You ordered " + numberOfCups + " cups of " + flavor + ".");
        if(hasWhippedCream == true){
            System.out.println("Your order has whipped cream.");
        }else{
            System.out.println("Your order doesn't have whipped cream.");
        }

        // TODO
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
