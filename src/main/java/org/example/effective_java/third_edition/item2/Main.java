package org.example.effective_java.third_edition.item2;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.LARGE)
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.HAM)
                .build();

        Pizza calzone = new CalzonePizza.Builder()
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.PEPPER)
                .sauceInside()
                .build();
    }
}
