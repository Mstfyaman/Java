package Day_35_İnheritance;

// multi level inheritance yapı

public class Human {


    public void name(){
        System.out.println("ismi Ahmet olabilir");
    }

}
class Man extends Human{
    public void role(){
        System.out.println("baba olurlar");
    }
}
class Son extends Man{
    public void activity(){
        System.out.println("oyun oynar");
    }
 }
 class Test{
     public static void main(String[] args) {

         Son son = new Son();
         son.name();
         son.role();
         son.activity();
         System.out.println("-------------------------------");
         Man man = new Man();
         man.role();
         man.name();
         System.out.println("-------------------------------");
         //man.activity();  erişemez çünkü alt class

         Human human = new Human();
         human.name();
         // human.rolu();   //erişemez  çünkü alt class
         //human.activity();  //erişemez çünkü alt class


     }
 }