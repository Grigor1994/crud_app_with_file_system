package com.grigor.picsart.model.electronic.phone;

import com.grigor.picsart.model.electronic.ElectronicItem;

public abstract class Phone extends ElectronicItem {

    public abstract void call(String name);

    public abstract void hangUp();
}