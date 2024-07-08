package com.scaler.siri.factorydp.Factory;

import com.scaler.siri.factorydp.Factory.components.buttons.Button;
import com.scaler.siri.factorydp.Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
//        UIFactory uiFactory=  flutter.getUIFactory("Android"); if wrong value passed it throws exception, use Enum instead

        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatform.Windows);

        Button button = uiFactory.CreateButton();
        button.changeSize();
        button.click();

        Menu menu = uiFactory.CreateMenu();
        menu.showMenu();

    }
}
