package Day_45_OOP_ReviewCont2.hidingCont;

public class MyCar {

    public static boolean haveSunroof(){
        return false;
    }
    public void getMyCarSunroofStatus(){

        System.out.println("My Car have sunroof" + haveSunroof());
    }
}
