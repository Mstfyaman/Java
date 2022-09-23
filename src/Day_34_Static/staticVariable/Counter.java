package Day_34_Static.staticVariable;

public class Counter {

    static int counter;  //1. nesede deger 1 oldu //2. nesnede dger 2 oldu // 3.nesnede ....

    public Counter(){
        counter++;
        System.out.println(counter);
    }

}

class main{                                      // burda kendimiz main methodu açtık :)
    public static void main(String[] args) {

        Counter ct1=new Counter();
        Counter ct2=new Counter();
        Counter ct3=new Counter();
        Counter ct4=new Counter();
        Counter ct5=new Counter();
        Counter ct6=new Counter();
        Counter ct7=new Counter();
    }
}

