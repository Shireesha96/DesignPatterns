package com.scaler.siri.factorydp.Factory;

import com.scaler.siri.factorydp.Factory.components.buttons.Button;
import com.scaler.siri.factorydp.Factory.components.buttons.WindowsButton;
import com.scaler.siri.factorydp.Factory.components.menu.Menu;
import com.scaler.siri.factorydp.Factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public Menu CreateMenu() {
        return new WindowsMenu();
    }
}
