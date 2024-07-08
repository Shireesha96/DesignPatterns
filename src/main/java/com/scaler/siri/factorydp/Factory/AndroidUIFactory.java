package com.scaler.siri.factorydp.Factory;

import com.scaler.siri.factorydp.Factory.components.buttons.AndroidButton;
import com.scaler.siri.factorydp.Factory.components.buttons.Button;
import com.scaler.siri.factorydp.Factory.components.menu.AndroidMenu;
import com.scaler.siri.factorydp.Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button CreateButton() {
        return new AndroidButton();
    }

    @Override
    public Menu CreateMenu() {
        return new AndroidMenu();
    }
}
