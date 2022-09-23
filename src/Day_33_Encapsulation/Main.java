package Day_33_Encapsulation;

public class Main {
    public static void main(String[] args) {

        //-------------------person-------------------

//        Person enes=personCreate("enes yilmaz",1211);
//            System.out.println(enes.name);
//
//        Person mehmet=personCreate("mehmet can",1212);
//        System.out.println(mehmet.name);

//
        //-----------------------Dog------------------------

//        Dog karabas=new Dog();
//        karabas.setName("karabas");
//        System.out.println(karabas.getName());
//        karabas.setName("boncuk");
//        System.out.println(karabas.getName());

        //------------------------------Circle-----------------------------


      //  Circle circle_1=new Circle(5);

        //System.out.println(Math.PI * Math.pow(circle_1.getRadius(), 2));
       // circle_1.setRadius(12);
       // System.out.println(circle_1.getRadius());
       // System.out.println(circle_1.circleArea());

       // System.out.println(Circle.circleArea(5));



        //-------------------------------KraftBank---------------------------


        KraftBankCustomer enes=new KraftBankCustomer(1254,"Enes Yilmaz",false);
        System.out.println(enes.getCustomerToken());
        enes.setCustomerFullName("1254En12","Enes Sen");
        System.out.println(enes.getCustomerFullName());
        enes.addMoney(500);
        enes.setIsSms(true);
        

    }










}
