package bootCamp.oop;

public class B14_FinalKeyWord {

    // final keyword : it means constant/değiştirilemez

    // final variable :
    // we initialize(başlatma) in same statements
    // we initialize in constructor
    // we initialize in init(içinde) block


    final double PI = 3.14;   // başlatma yerinde atama yapılabilir
    final double PI2;
    final double PI3;
    final static double PI4;
    final static double PI5 = 3.14; // static e yerinde atama yapılır


    B14_FinalKeyWord(){
        PI2=3.14;                     // constructor içinde atama yapılabilir   // static e constructorde atama yapımaz
    }


    {
        PI3 = 3.14;    // block içinde atama yapılabilir           // static e blockta atama yapımaz
    }

    static {
        PI4= 3.14;   // static lere static block içinde atama yapılabilir.
    }


    // method :  final olursa
    // can not be overridden

    // class :  final olursa
    // can not be inherited
    // for immutable consept : for example class, being class is needed


}
 final class A{   // a class ı final olduğu için sub extend edemedi.


}
 //class sub extends A{

//}
