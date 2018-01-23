package oop.singleton;

//Synchronized Accessor - slow

public class LandlinePhone {
    private LandlinePhone(){}
    private static LandlinePhone landlinePhone;
    public static synchronized LandlinePhone getLandlinePhone(){
        if (landlinePhone == null){
            landlinePhone = new LandlinePhone();
        }
        return landlinePhone;
    }
}
