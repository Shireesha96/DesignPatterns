package com.scaler.siri.factorydp.Factory;

//helper class - to avoid srp violation in Flutter class
public class UIFactoryFactory {
    
    
    //make static to avoid creation of object
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform) {
        if(supportedPlatform.equals(SupportedPlatform.Windows)){
            return new WindowsUIFactory();
        }
        else if(supportedPlatform.equals(SupportedPlatform.IOS)){
            return new IOSUIFactory();
        }
        else if(supportedPlatform.equals(SupportedPlatform.Android)){
            return new AndroidUIFactory();
        }
        else{
            return null;
        }
    }


}
