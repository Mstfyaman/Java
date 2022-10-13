package bootCamp;

public class B9_ObjectAndClass {

    // Class is template(kalıp-şablon) of object-------what properties an behavior the object have
    // class bir şablondur, nesnenin şablonudur. ----- nesneye ait davranış ve özellikler class dan gelir.

    // Object : comes from class--- instance of class
    // nesne class in bir örneğidir

    //fields--instance
      String name;

      // fields----static
      static String schoolName= "KRAFT";

    //behavior --- metot---instance
        void action(){
            System.out.println("action of "+name);
        }

        // behavior-- static
    static void status(){
        System.out.println("student");
    }


}
class test{   // test classı oluşturduk, obje oluşturcak için
    public static void main(String[] args) {

        //object gelcek- comes from class-- instance of class

        B9_ObjectAndClass copy=new B9_ObjectAndClass();
        copy.name="name1";
        copy.action();

        B9_ObjectAndClass copy2 =new B9_ObjectAndClass();
        copy2.name="name2";
        copy2.action();

        // instance vs static
        // instance--belongs to the object ---each object has its own copy
        // static --belongs to class ---only one copy for all object

        // static olmayan methoddan  static ve non static
        // static methoddan static elemanlara erişebiliriz

       // B9_ObjectAndClass.schoolName="superKraft";
       // B9_ObjectAndClass.status();

    }
}
