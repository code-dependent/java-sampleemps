package com.local.snackbar;

import com.local.snackbar.models.Customer;
import com.local.snackbar.models.Snack;
import com.local.snackbar.models.VendingMachine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnackbarApplication
{
    private static void workWithData(){
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine machine1 = new VendingMachine("Food");
        VendingMachine machine2 = new VendingMachine("Drink");
        VendingMachine machine3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, machine1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.0, machine1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.0, machine1.getId());
        Snack snack4 = new Snack("Soda", 24, 2.5, machine2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, machine2.getId());


        // Customer 1 (Jane) buys 3 of snack 4 (Soda).
        //     Print Customer 1 (Jane) Cash on hand.
        //     Print quantity of snack 4 (Soda).
        customer1.buySnacks(snack4.getTotal(3));
        snack4.buySnack(3);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand() + " left. only " + snack4.getQuantity() + " " + snack4.getName() + "'s left.");
        // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        //     Print Customer 1 (Jane) Cash on hand.
        //     Print quantity of snack 3 (Pretzel).
        System.out.println();
        customer1.buySnacks(snack3.getTotal(1));
        snack3.buySnack(1);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand() + " left. only " + snack3.getQuantity() + " " + snack3.getName() + "s left.");
        // Customer 2 (Bob) buys 2 of snack 4 (Soda).
        //     Print Customer 2 (Bob) Cash on Hand.
        //     Print quantity of snack 4 (Soda).
        System.out.println();
        customer2.buySnacks(snack4.getTotal(2));
        snack4.buySnack(2);
        System.out.println(customer2.getName() + " has $" + customer2.getCashOnHand() + " left. only " + snack4.getQuantity() + " " + snack4.getName() + "s left.");
        //  Customer 1 (Jane) finds $10.
        //     Print Customer 1 (Jane) Cash on Hand.
        System.out.println();
        customer1.addCash(10.00);
        System.out.println(customer1.getName() + " found $10.00. Now " + customer1.getName() + " has $" + customer1.getCashOnHand());
        //  Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        //     Print Customer 1 (Jane) Cash on Hand.
        //     Print quantity of snack 2 (Chocolate Bar).
        System.out.println();
        customer1.buySnacks(snack2.getTotal(1));
        snack2.buySnack(1);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand() + " left. only " + snack2.getQuantity() + " " + snack2.getName() + "s left.");
        // Add 12 more items to snack 3 (Pretzel).
        //     Print quantity of snack 3 (Pretzel).
        System.out.println();
        snack3.addQuantity(12);
        System.out.println("There are " + snack3.getQuantity() + " " + snack3.getName() + "s left.");
        //  Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        //     Print Customer 2 (Bob) Cash on hand.
        //     Print quantity of snack 3 (Pretzel).
        System.out.println();
        customer2.buySnacks(snack3.getTotal(3));
        snack3.buySnack(3);
        System.out.println(customer2.getName() + " has $" + customer2.getCashOnHand() + " left. only " + snack3.getQuantity() + " " + snack3.getName() + "s left.");
        //  Display each snack with
        //     Name
        //     Vending Machine Name
        //     Quantity on hand
        //     Total cost of all of the quantities of this snack on hand
        System.out.println();
        System.out.println("Snack: " + snack1.getName() + "\n" + "Vending Machine: " + machine1.getName() + "\n" + "Quantity: " + snack1.getQuantity() + "\n" + "Total Cost: " + snack1.getTotal(snack1.getQuantity()) + "0");
        System.out.println();
        System.out.println("Snack: " + snack2.getName() + "\n" + "Vending Machine: " + machine1.getName() + "\n" + "Quantity: " + snack2.getQuantity() + "\n" + "Total Cost: " + snack2.getTotal(snack2.getQuantity()) + "0");
        System.out.println();
        System.out.println("Snack: " + snack3.getName() + "\n" + "Vending Machine: " + machine1.getName() + "\n" + "Quantity: " + snack3.getQuantity() + "\n" + "Total Cost: " + snack3.getTotal(snack3.getQuantity()) + "0");
        System.out.println();
        System.out.println("Snack: " + snack4.getName() + "\n" + "Vending Machine: " + machine2.getName() + "\n" + "Quantity: " + snack4.getQuantity() + "\n" + "Total Cost: " + snack4.getTotal(snack4.getQuantity()) + "0");
        System.out.println();
        System.out.println("Snack: " + snack5.getName() + "\n" + "Vending Machine: " + machine2.getName() + "\n" + "Quantity: " + snack5.getQuantity() + "\n" + "Total Cost: " + snack5.getTotal(snack5.getQuantity()) + "0");

    }

    public static void main(String[] args)
    {
        SpringApplication.run(SnackbarApplication.class,
                args);
        workWithData();
    }

}
