package by.tms.hands;

import by.tms.abs.RobotParts;

public class SonyHand extends RobotParts implements IHand {

    public SonyHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Sony");
    }
}