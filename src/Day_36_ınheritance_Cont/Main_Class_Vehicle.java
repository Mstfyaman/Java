package Day_36_ınheritance_Cont;

public class Main_Class_Vehicle {
    public static void main(String[] args) {

        Automobile automobile_1=new Automobile();
        automobile_1.color="blue";
        automobile_1.hb=110;
        automobile_1.model=1991;
        automobile_1.radioBrand="pioneer";
        automobile_1.start();
        automobile_1.stop();


        Automobile automobile_2=new Automobile();
        automobile_2.color="red";
        automobile_2.hb=115;
        automobile_2.model=2008;
        automobile_2.radioBrand="sony";
        automobile_2.start();
        automobile_2.stop();

        Motorcycle motorcycle_1=new Motorcycle();
        motorcycle_1.cc=250;
        motorcycle_1.model=2012;
        System.out.println(motorcycle_1.changeCcHp());


        System.out.println(automobile_1.color);
        System.out.println(automobile_2.color);


    }

    // şuan methon overlooding hatırlama

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(int a, byte b,int c, int d){
        return a+b+c+d;
    }





}
