package sarahguarneri.U2W1L1.MENU;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends IMenu{
    List<Topping> toppings = new ArrayList<>();

    public Pizza() {
        toppings = new ArrayList<>();
        Topping tomato = new Topping();
        tomato.setName("tomato");
        tomato.setKcal(40);
        tomato.setPrice(0.50);
        toppings.add(tomato);
        Topping cheese = new Topping();
        cheese.setName("cheese");
        cheese.setPrice(0.6);
        cheese.setKcal(300);
        toppings.add(cheese);
        setName("Pizza Margherita");
        setPrice(4.99);
        setKcal(1104);
    }

    public void addTopping(Topping t){
        toppings.add(t);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Topping t: toppings){
            sb.append(t.getName()).append(", ");
        }
        String ingred = sb.toString();
        return getName()+" ("+ ingred.substring(0, ingred.length() - 2)+")";
    }
}
