package Day_40_İnterface;

public class Fish implements Animal, Food { // çift parent(multi inheritance) yaptık çünki interface


    public Fish() {
        super();
    }

    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}
class Chicken implements Food{
    //chicken classı hiyerarşik olarak 2 interfaceyede bağlı olduğu için
    //tüm abstract methodların yapmak zorunda

    public Chicken() {
        super();
    }

    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}