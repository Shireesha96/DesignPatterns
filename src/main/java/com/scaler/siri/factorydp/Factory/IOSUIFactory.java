package com.scaler.siri.factorydp.Factory;

import com.scaler.siri.factorydp.Factory.components.buttons.Button;
import com.scaler.siri.factorydp.Factory.components.buttons.IOSButton;
import com.scaler.siri.factorydp.Factory.components.menu.IOSMenu;
import com.scaler.siri.factorydp.Factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button CreateButton() {
        return new IOSButton();
    }

    @Override
    public Menu CreateMenu() {
        return new IOSMenu();
    }
}
