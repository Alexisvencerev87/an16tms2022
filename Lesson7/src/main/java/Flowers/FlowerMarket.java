package Flowers;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class FlowerMarket implements FlowerMarketAware {

    private final List<Bouquet> soldBouquets = new ArrayList<>();

    public Bouquet getBouquet(String... flowers) {

        Flower[] result = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            String flowerName = flowers[i];

            Flower.Type type = findPriceByFlowerName(flowerName);
            if (type != null) {
                result[i] = new Flower(type.name(), type.getCost());
            }
        }
        Bouquet bouquet = new Bouquet(result);
        soldBouquets.add(bouquet);
        return bouquet;
    }

    private Flower.Type findPriceByFlowerName(String name) {
        for (Flower.Type flowerType : Flower.Type.values()) {
            if (flowerType.name().equalsIgnoreCase(name)) {
                return flowerType;
            }
        }
        return null;
    }

    public int getCountSoldFlowers() {
        int count = 0;
        for (Bouquet soldBouquet : soldBouquets) {
            count += soldBouquet.getFlowers().length;


        }
        return count;
    }


}
