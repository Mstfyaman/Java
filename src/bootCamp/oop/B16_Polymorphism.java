package bootCamp.oop;

import java.util.*;

public class B16_Polymorphism {

    // poly morph--- çokca form
    // it is the ability of an object to take many form/bir nesnenin birden fazla form alma yeteneği
    // there must be is a relation
    // parent/super class or interface bring referenced to the child class

    // parent type decides which can be accessible(erişilebilir)
    // object type decides which implementation(uygulama) to the executed(yürütme)

    // static polymorphism--compile(derlemek) time polymorphism-- method overloading
    // dynamic polymorphism-- runtime polymorphism-- method overriding

    public static void main(String[] args){
        NavigableSet <Integer> navigableSet = new TreeSet<>();  // polymorphic way
        TreeSet<Integer> treeSet =new TreeSet<>();

        // reference type casting
        // upcasting - auto casting -- smaller type to larger type--implicit

        List<Integer> list= new ArrayList(); // upcasting - newden önce (List) var aslında ama java bunu gereksiz olduğu için yazmıyor

        // dawncasting --larger to smaller type


        Super sub1 =new Super();
        sub1.message();
        ((Sub)sub1).message2(); // dawncasting örneği - sonradan oluşturulan message2 metoduna erişemeişti dawncasting yaptık


    }







}
class Super {

    void message(){
        System.out.println("message from super");
    }


}
class Sub extends Super {

    @Override
    void message() {
        super.message();
        System.out.println("message from sub");
    }

    void message2() {                                 // bunu sonradan yazdık ve super ile çağırmadık sonra yukarda çağırırken dawncasting yaptık
        System.out.println("message2 from sub");
    }

}