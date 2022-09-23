package Day_34_Static.staticClasses;

public class Outer {



    static class nested{
        public static void message1(){
            System.out.println("selam static class dan");
        }
    }
    class inner{
        public void message2(){
            System.out.println("selam inner class dan");
        }
    }
}

class main{
    public static void main(String[] args) {

        Outer.nested.message1();  //   nested clasını çağırdık

        Outer outer_1=new Outer();   //inner clasını çağırmak için 24-25. satırlar
        Outer.inner selam= outer_1.new inner();
        
        selam.message2();


    }
}
