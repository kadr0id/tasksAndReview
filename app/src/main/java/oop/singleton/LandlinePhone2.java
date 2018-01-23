package oop.singleton;

// On Demand Holder - fast

public class LandlinePhone2 {
    private LandlinePhone2(){}
    public static class LandlinePhone2Holder {
        public static final LandlinePhone2 HOLDER_LANDLINE_PHONE_2 = new LandlinePhone2();
    }
    public static LandlinePhone2 getHolderLandlinePhone() {
        return LandlinePhone2Holder.HOLDER_LANDLINE_PHONE_2;
    }

}
