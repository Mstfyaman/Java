package Day_45_OOP_ReviewCont2.hidingCont;

import Day_45_OOP_ReviewCont2.hidingCont.MyCar;

public class YourCar extends MyCar {

    public static boolean haveSunroof(){
        return true;
    }

    public void getYourCarSunroofStatus(){

        System.out.println("Your Car have sunroof" + haveSunroof());
    }


}
