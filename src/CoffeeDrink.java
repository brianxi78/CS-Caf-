// CoffeeDrink object class

class Drink {

    int numberOfCups;
    String TypeofDrink;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public Drink (int numberOfCups, String TypeofDrink, boolean hasWhippedCream) {

        this.numberOfCups = numberOfCups;
        this.TypeofDrink = TypeofDrink;
        this.hasWhippedCream = hasWhippedCream;
        printInfo();

        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {

        System.out.print("You ordered " + numberOfCups + " cups of " + TypeofDrink);
        if(hasWhippedCream == true){
            System.out.println(" with whipped cream.");
        }else{
            System.out.println(" without whipped cream.");
        }

        // TODO
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
