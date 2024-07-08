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
            if(platform.equals(SupportedPlatform.Windows)){
                return new WindowsUIFactory();
            }
            else if(platform.equals(SupportedPlatform.IOS)){
                return new IOSUIFactory();
            }
            else if(platform.equals(SupportedPlatform.Android)){
                return new AndroidUIFactory();
            }
            else{
                return null;
            }
    }

}
