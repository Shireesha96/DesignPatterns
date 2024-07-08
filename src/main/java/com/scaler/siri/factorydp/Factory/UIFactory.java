package com.scaler.siri.factorydp.Factory;

import com.scaler.siri.factorydp.Factory.components.buttons.Button;
import com.scaler.siri.factorydp.Factory.components.menu.Menu;

public interface UIFactory {
    Button CreateButton();
    Menu CreateMenu();
}
