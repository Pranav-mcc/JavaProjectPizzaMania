package com.pranav.pizzamania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAmount = 0;
        System.out.println("-------------------------WELCOME TO PIZZAMANIA----------------------");
        boolean loop = true;
        while (loop) {
            System.out.println("Press 1 for order pizza or Press 2 for exit");
            int ch = sc.nextInt();
            if (ch == 2) {
                System.out.println("Thank you!!!!! Visit Again......");
                System.out.println("-----------------------------------------------------------------------------");
                System.exit(0);
            }
            if (ch == 1) {
                System.out.println("Which Pizza: (1.Veg Pizza   2.Non Veg Pizza   3.Deluxe Veg Pizza  4.Deluxe Non Veg Pizza)");
                int pizzaChoice = sc.nextInt();
                Pizza pizza = null;
                switch (pizzaChoice) {
                    case 1:
                        pizza = new Pizza(true);
                        break;
                    case 2:
                        pizza = new Pizza(false);
                        break;
                    case 3:
                        pizza = new DeluxPizza(true);
                        break;
                    case 4:
                        pizza = new DeluxPizza(false);
                        break;
                    default:
                        System.out.println("Entered value is wrong.. Please check and try again");
                        continue;
                }
                if (pizza != null) {
                    pizza.addExtraToppings();
                    pizza.addExtraCheese();
                    pizza.takeAway();
                    int currentBill = pizza.getBill(); // Get the current pizza bill
                    totalAmount += currentBill; // Add to totalAmount
                    System.out.println("Total Amount: " + totalAmount); 
                }
            }
        }
        sc.close();
    }
}
