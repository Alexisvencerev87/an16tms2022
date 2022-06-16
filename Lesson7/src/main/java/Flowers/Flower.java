package Flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Flower {
    private String name;
    private int price;

    @AllArgsConstructor
    @Getter
    enum Type {
        ROSE(15),
        LILY(7),
        ASTER(5),
        GERBERA(5),
        TULIP(8),
        CARNATION(11);

        private final int cost;
    }
}