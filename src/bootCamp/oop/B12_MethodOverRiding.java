package bootCamp.oop;

public class B12_MethodOverRiding {

    // only happen in subClass
    // method name, return type, parameter must be same
    // access modifier must bu same or more visible(gözle görülür)
    // final-private-static methods can not override

    // benefit of overriding : one method different implementation(uygulama)

 public void method(){
    System.out.println("from parent");
}

//static void method(){}     // static-private ve final methodlar overriding olmaz
//private void method(){}
//final void method(){}



}

// ---------child class
class B extends B12_MethodOverRiding {

    @Override
    public void method() {
        System.out.println("from child");
    }

}
class test{
    public static void main(String[] args) {

        B b= new B();
        b.method();

        B12_MethodOverRiding c = new B12_MethodOverRiding();
        c.method();


    }

}
