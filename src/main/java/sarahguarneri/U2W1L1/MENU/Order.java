package sarahguarneri.U2W1L1.MENU;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Order {
    private int orderNumb;
    private int people;
    private String time;
    private Stato state;
    private int totalAmountService;
}
