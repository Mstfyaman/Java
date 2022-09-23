package Day_34_Static.staticVariable;

public class BirtDay {

    static int cakeSlice= 28;


    public void takeASlice(){
     cakeSlice--;
    }

    public void takeAslice(int count){
        cakeSlice-=count;
    }

}


class main2{                 // kendi oluşturduğumuz main methodu
    public static void main(String[] args) {

        BirtDay zafer=new BirtDay();
        BirtDay enes=new BirtDay();
        BirtDay ilyas=new BirtDay();
        BirtDay rıdvan=new BirtDay();
        BirtDay talip=new BirtDay();
        BirtDay ramazan=new BirtDay();
        BirtDay talha=new BirtDay();

        zafer.takeASlice();
        enes.takeASlice();
        ilyas.takeASlice();
        rıdvan.takeASlice();
        talip.takeASlice();
        ramazan.takeASlice();
        talha.takeASlice();
        //zafer.takeASlice();
        ilyas.takeASlice();



        System.out.println(BirtDay.cakeSlice);

    }
        }
