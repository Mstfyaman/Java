package bootCamp.oop;

public class B11_İnheritance {

    // is A relationship between parent/child
    // keyword extends -----child/subClass extends super/parentClas
    // can not inheritance from subClass/ subClass methodlarını ve değişkenlerini superClass kullanmaz
    // aclass can not extends more than one super class
    // a super class can bu extended more than one class/subClass

    // benefits : inheritance prevent code duplication
    //          : provide easy maintaining // kolay bakım sağlar
    // example: basePAGE or testBase class in automation framework

}
class Parent{
    String name;
    int age;

    public  Parent(){
        System.out.println("parent class constructor");
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
class Child extends Parent{

    public Child(){
        super();  // bu boş super i koymak zorunda değiliz. compiler pu put keyword automaticaly and implicit
    }
    // if there is a parameterized constructor in parent class
    // wu must pu super() with parameter in child class

    public Child(String name, int age){   // parent classtaki parametreli metodu super ile çağırmak gerekir
        super(name, age);
    }

}



























