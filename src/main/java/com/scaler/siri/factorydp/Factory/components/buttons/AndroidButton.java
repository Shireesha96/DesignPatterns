package com.scaler.siri.factorydp.Factory.components.buttons;

public class AndroidButton implements Button{
    @Override
    public void click() {
     System.out.println("AndroidButton clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("AndroidButton change size");
    }
}
