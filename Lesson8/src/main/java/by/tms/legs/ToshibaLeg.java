package by.tms.legs;

import by.tms.abs.RobotParts;

public class ToshibaLeg extends RobotParts implements ILeg {

    public ToshibaLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba сделала шаг");
    }
}