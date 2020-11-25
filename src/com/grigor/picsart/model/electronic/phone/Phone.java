package com.grigor.picsart.model.electronic.phone;

import com.grigor.picsart.model.electronic.ElectronicItem;

public abstract class Phone extends ElectronicItem {
    public Phone(String brand, String model, String serialNumber, int produceYear, int weight) {
        super(brand, model, serialNumber, produceYear, weight);
    }

    public abstract void call(String name);

    public abstract void hangUp();
}
