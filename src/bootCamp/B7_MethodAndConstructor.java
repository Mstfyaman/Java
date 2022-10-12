package bootCamp;

public class B7_MethodAndConstructor {

    public static void main(String[] args) {

     // method : code fragment which can perform task

     // access modifier - return type- name( varsa parameter){implementation/body/code}   yapısı


     message("hello");
     message();
     message(5,10.0,"hello");


    Test test = new Test("hello");
        System.out.println(test.str = ("world"));


    }

    // method overloading
    // same method name different parameter in same class
    // return type no effect method overloading

    public static void message(String str){
      //  System.out.println(str);
    }

    public static void  message(){
       // System.out.println("hello");
    }

    public static void  message(String str, int a){}
    public static void  message(String str, int a, double b){}    // parametrelerin yerlerinin değişmiş olması, sayısının farklı olması etkiler
    public static void  message( int a, double b,String str){}
    public static void  message( double b,int a ,String str){}
    public static void  message( double b){}
    public static void  message( int a){}


    // Constructor
    // special method
    // used for creating object
    // constructor name must be sama with class name
    // dosent hace any return type
    // if we dont put any constructor always there is a default constructor as implicit
    // if we put a parameterized constructor there is not default constructor.



}

class Test{

    String str;

    public Test() {   // boş constructor
    }

    public Test(String str) {   // parametreli constructor
        this.str = str;
    }
}
