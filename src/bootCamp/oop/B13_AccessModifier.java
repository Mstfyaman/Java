package bootCamp.oop;

public class B13_AccessModifier {

    // private : visible/reachable only within class
    // protected : visible/reachable in same package, and reachable outside if there is inheritance
    //default : reachable in same package
    // public : reachable everywhere

    // **private constructor role**
    // you can not create the instance of out of class
    public static void main(String[] args) {

       // Restricted s=new Restricted(); // class içerisinde private bir constructor varsa nesne oluşturmaya izin vermez
        // you can create an object from private constructor
    }




}
class Restricted{   // kısıtlı demek

    private Restricted(){

    }

}
