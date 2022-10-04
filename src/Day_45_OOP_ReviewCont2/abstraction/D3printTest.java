package Day_45_OOP_ReviewCont2.abstraction;

public class D3printTest {
    public static void main(String[] args) {

        Mod1 mod1=new Mod1("doll","OBJ");
     //   mod1.extrude();
      //  mod1.polish();
        Mod1 toy=new Mod1("ToyCar","STL");
        System.out.println("---------------");
        Mod1 toy2=new Mod1("doll","OBJ");
        System.out.println("---------------");
        Mod1 toy3=new Mod1("ToyTruck","STL");
        System.out.println("---------------");
        Mod1 toy4=new Mod1("toyMonkey","OBJ");
        System.out.println("---------------");
        Mod1 toy5=new Mod1("ToyCar","OBJ");

    }
}
