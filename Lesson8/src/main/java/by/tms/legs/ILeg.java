package by.tms.legs;

import by.tms.abs.IPrice;

public interface ILeg extends IPrice {
    void step();
}
