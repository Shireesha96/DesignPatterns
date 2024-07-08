package com.scaler.siri.factorydp.Factory.components.buttons;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicked IOS button");
    }

    @Override
    public void changeSize() {
        System.out.println("Changed IOS button size");
    }
}
