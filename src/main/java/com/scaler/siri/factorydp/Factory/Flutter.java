package com.scaler.siri.factorydp.Factory;

public class Flutter {

    //Non Factory Methods
    void refreshUI(){
        System.out.println("Refreshing UI");
    }

    void setTheme(){
        System.out.println("Setting Theme");
    }

    //factory method to get object of corresponding
    //UI factory based on the input
    public UIFactory getUIFactory(SupportedPlatform platform){
           return UIFactoryFactory.getUIFactory(platform);
    }

}
