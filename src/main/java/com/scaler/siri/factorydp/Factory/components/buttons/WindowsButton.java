package com.scaler.siri.factorydp.Factory.components.buttons;

public class WindowsButton implements Button{
    @Override
    public void click() {
      System.out.println("Clicked Window Button");
    }

    @Override
    public void changeSize() {
        System.out.println("Changed Window Button size");
    }
}
