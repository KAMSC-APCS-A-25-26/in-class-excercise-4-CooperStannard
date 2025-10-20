import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int times = sc.nextInt();
        double total = 0;
        // TODO: Use a for loop to read each item's price (double)
        for (int i= 0; i< times; i++){
            System.out.print("Price of item " + (i+1) + "? ");
            total += sc.nextDouble();
        }
        System.out.println("Your cart has " +times + " items with a total cost of $" + total);
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
    }
}
