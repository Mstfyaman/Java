package bootCamp.oop;

public class B15_Abstraction {

    // hiding implementation
    // focusing essential, ignore details

    // important point abstraction : abstract method
    // abstract classes dont have body so implementation is not allowed
    // abstraction method private olamaz, final olamaz, static olamaz

    // abstraction's two ways:
    // 1-abstract class
    //  abstract class fcant be final because it is parent
    //  can not create object from abstract class, can have all types + abstract methods
    //  normal/regular class can not have abstract methods


    // 2-interface
    //  blueprint of class
    // provide(sağlamak) additinal methods
    //  it is not a class- it is pure abstraction
    //  cannot create object
    //  keyword : implements
    //  allows multiple inheritance
    //  has one type variable
    //




}
abstract class Vehicle{   // abstraction metotlarda badi yoktur. {}
    abstract double price();


}
class Car extends Vehicle{
    @Override
    double price() {    // abstraction classtaki methodu override etmezsek hata verir. overide zorunlu
        return 0;
    }

    public void test(){

    }


}
interface  I{   // interface class

    public static final String name ="Ahmet"; // variables in interface public static final as default

    public abstract void test();
    default void test2(){};
    static void test3(){};
    private void test4(){};
}


