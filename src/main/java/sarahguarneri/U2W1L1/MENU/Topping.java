package sarahguarneri.U2W1L1.MENU;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
public class Topping extends IMenu{

    @Override
    public String toString() {
        return getName()+" kcal: "+ getKcal() +" price: "+getPrice();
    }
}
