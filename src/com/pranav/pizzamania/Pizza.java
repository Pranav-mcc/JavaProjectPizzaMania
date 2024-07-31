package com.pranav.pizzamania;

import java.util.Scanner;

public class Pizza {
    private boolean veg;
    protected int price;
    protected int basePizzaPrice;
    
    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;
    
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;
    
    Scanner sc = new Scanner(System.in);
    
    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    
    public void addExtraCheese() {
        System.out.println("Extra cheese (y/n)? => ");
        String cheese = sc.next();
        if (cheese.equalsIgnoreCase("y")) {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
        }
    }
    
    public void addExtraToppings() {
        System.out.println("Extra toppings (y/n)? => ");
        String toppings = sc.next();
        if (toppings.equalsIgnoreCase("y")) {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        }
    }
    
    public void takeAway() {
        System.out.println("Want TakeAway (y/n)? => ");
        String takeaway = sc.next();
        if (takeaway.equalsIgnoreCase("y")) {
            isTakeAway = true;
            this.price += backPackPrice;
        }
    }
    
    public int getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings: " + extraToppingsPrice + "\n";
        }
        if (isTakeAway) {
            bill += "Take Away: " + backPackPrice + "\n";
        }
        bill += "\nBill: " + this.price + "\n";
        System.out.println(bill);
        
        return this.price; // Return the price of the current pizza
    }
}
