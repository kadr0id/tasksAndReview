package oop.singleton;

//Double Checked Locking & volatile - fast

public class LandlinePhone1 {
    private static volatile LandlinePhone1 landlinePhone1;

    private LandlinePhone1(){}

    public static LandlinePhone1 getLandlinePhone1(){
        LandlinePhone1 myLandlinePhone1 = landlinePhone1;
        if (myLandlinePhone1 == null) {
            synchronized (LandlinePhone1.class){
                myLandlinePhone1 = landlinePhone1;
                if (myLandlinePhone1 == null){
                    landlinePhone1 = myLandlinePhone1 = new LandlinePhone1();
                }
            }
        }
        return myLandlinePhone1;
    }
}
