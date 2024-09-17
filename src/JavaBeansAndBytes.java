import javax.print.attribute.standard.PrinterInfo;
import java.awt.*;
import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;
    int discount;
    String SpecialoftheDay;


    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 2006;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay();
        countCups();
        baristasChoice();

        CoffeeDrink Cappuccino = new CoffeeDrink(1,"Vanilla", false);
        CoffeeDrink Expresso = new CoffeeDrink(2,"Mocha", true);

        // TODO
        // Create two CoffeeDrink objects

        // TODO
        // Print out the order details


    }

    // Method to generate a random discount
    public void randomDiscount() {
        discount = (int)(Math.random()/(10/3)*100);

        System.out.println("The discount today is " + discount + "%.");
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay() {
        for(int x = 1; x<8; x++){
            if (x == 1){
                SpecialoftheDay = "Mocha Latte";
            }
            else if(x == 2){
                SpecialoftheDay = "Strawberry Latte";
            }
            else if(x == 3){
                SpecialoftheDay = "Pumpkin Spice Latte";
            }
            else{
                SpecialoftheDay = "Expresso Shot";
            }
        }
        System.out.println("The Special of the Day is the " + SpecialoftheDay + ".");

        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");
        for (int x = 1; x < 6; x++){
            System.out.print(x + "\n");
        }
        System.out.println();
        for (int i = 2; i < 12; i = i+3){
            System.out.print(i + "\n");
        }
        System.out.println();
        for (int j = 8; j >= 0; j--){
            System.out.print(j + "\n");
        }
        System.out.println();


        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5


        // Print 2, 5, 8, 11


        // Print 8 to 0

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        String Rec = null;
        double Decider = 0;
        Decider = Math.random();
        if(Decider>=0 && Decider <= 0.25){
            Rec = "Special of the Day";
        }
        if(Decider>0.25 && Decider <= 0.5){
            Rec = "Caramel Macchiato";
        }
        if(Decider> 0.5 && Decider <= 0.75) {
            Rec = "Strawberry Açai Refreshner";
        }
        if(Decider>0.75 && Decider <1){
            Rec = "Iced White Chocolate Mocha";
        }
        System.out.println("I would recommend the " + Rec + ".");
        System.out.println(Decider);


        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
    }
}

