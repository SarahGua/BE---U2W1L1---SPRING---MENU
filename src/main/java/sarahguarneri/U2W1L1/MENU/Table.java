package sarahguarneri.U2W1L1.MENU;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Table {
    private int number;
    private int maxPeople;
    private Availability availability;
}
