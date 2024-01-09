package sarahguarneri.U2W1L1.MENU;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeansConfig {

    @Bean
    public Topping cheese(){
        Topping t = new Topping();
        t.setKcal(102);
        t.setName("cheese");
        t.setPrice(1.50);
        return t;
    }

    @Bean
    public Topping ham(){
        Topping t =  new Topping();
        t.setName("Ham");
        t.setKcal(35);
        t.setPrice(0.99);
        return  t;
    }

    @Bean
    public Topping onions(){
        Topping t =  new Topping();
        t.setName("Onions");
        t.setKcal(22);
        t.setPrice(0.69);
        return  t;
    }

    @Bean
    public Topping pineapple(){
        Topping t =  new Topping();
        t.setName("Cheese");
        t.setKcal(24);
        t.setPrice(0.79);
        return  t;
    }

    @Bean
    public Topping salami(){
        Topping t =  new Topping();
        t.setName("Salami");
        t.setKcal(86);
        t.setPrice(0.99);
        return  t;
    }

    @Bean
    public Pizza margherita(){
        return  new Pizza();
    }
    @Bean
    public Pizza hawaiianPizza(){
        Pizza p = new Pizza();
        p.setName("Hawaiian Pizza");
        p.addTopping(ham());
        p.addTopping(pineapple());
        return p;
    }
    @Bean
    public Pizza salamiPizza(){
        Pizza p = new Pizza();
        p.setName("Salami Pizza");
        p.addTopping(salami());
        return p;
    }

    @Bean
    public Drink lemonade(){
        Drink d = new Drink();
        d.setName("Lemonade");
        d.setKcal(128);
        d.setPrice(1.29);
        return d;
    }

    @Bean
    public Drink water(){
        Drink d = new Drink();
        d.setName("Water");
        d.setKcal(0);
        d.setPrice(1.29);
        return d;
    }

    @Bean
    public Drink wine(){
        Drink d = new Drink();
        d.setName("Wine");
        d.setKcal(607);
        d.setPrice(7.49);
        return d;
    }

    @Bean(name = "menu")
    public Menu menu(){
        Menu menu = new Menu();
        menu.addPizza(margherita());
        menu.addPizza(hawaiianPizza());
        menu.addPizza(salamiPizza());

        menu.addTopping(cheese());
        menu.addTopping(ham());
        menu.addTopping(onions());
        menu.addTopping(pineapple());
        menu.addTopping(salami());

        menu.addDrink(lemonade());
        menu.addDrink(water());
        menu.addDrink(wine());
        return menu;
    }
}
