package com.pranav.pizzamania;

public class DeluxPizza extends Pizza {
    
    public DeluxPizza(boolean veg) {
        super(veg);
        addExtraCheese(); 
        addExtraToppings(); 
    }
    
    public void addExtraPortionOfCheese() {
        this.price += extraCheesePrice; 
    }

    public void addDeluxeToppings() {
        this.price += extraToppingsPrice; 
    }
}
