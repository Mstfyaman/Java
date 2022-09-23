package Assignments.class_object;

public class Vehicle {
    //attribute veya fields

    String type;
    String color;
    int tires;
    int price;

    public void  getinfo(){
        System.out.println(" vehicle { type :"+type+" color :"+color+" tires :"+tires+" price :"+price);
    }

    public void setWinter(){
        System.out.println(color+" "+type+" icin "+tires+ " adet kislik lastik lazim");
    }
    public void foRent(){
        System.out.println(color+" "+type+ " icin 1 gunluk kiralama bedeli "+price+ " Tl dir" );
    }
    public void forRentOption(int daycount){
        System.out.println(color+" renkli "+type+ " icin "+daycount+ " gunluk kiralama bedeli "+price*daycount+ " TL dir");
    }


}
