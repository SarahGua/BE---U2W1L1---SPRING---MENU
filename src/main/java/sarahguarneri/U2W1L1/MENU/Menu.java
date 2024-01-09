package sarahguarneri.U2W1L1.MENU;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Menu {
    List<Pizza> pizzas = new ArrayList<>();
    List<Drink> drinks = new ArrayList<>();
    List<Topping> toppings = new ArrayList<>();

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public void addDrink(Drink drink){
        drinks.add(drink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu\n\nPizzas\n");
        for(Pizza pizza: pizzas){
            sb.append(pizza.toString()).append("\n");
        }
        sb.append("Toppings\n");
        for(Topping topping: toppings){
            sb.append(topping.toString()).append("\n");
        }
        sb.append("Drinks\n");
        for(Drink drink: drinks){
            sb.append(drink.toString()).append("\n");
        }

        return sb.toString();
    }
}
