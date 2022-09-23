package Day_32_Constructors_Cont;

public class Main_Day_32 {
    public static void main(String[] args) {

        //---CONSTRUCTOR-ÖZEELLİKLER----
        //1-ismi sınıf ismi le aynı olmalı
        //2-return type yok
        //3-oluşturulmazsa boş olarak otomatik atanır
        //4-sınıfın özel bir methodudur
        //5-ilk oluşturma esnasında constructor çağrılır


//        Square square_1=new Square();
//        square_1.sideLenght=5;
//        System.out.println(square_1.calculateArea());
//        System.out.println(square_1.calculatePerimeter());       // bunlar gibide yazdırılabilir
//
//        Square square_2=new Square(8);    // bunlar gibide çağrılabilir
//        System.out.println(square_2.calculatePerimeter());
//        System.out.println(square_2.calculateArea());


        //----------------------Pencil-------------------------

//        Pencil benimKalemim=new Pencil("sari",7,false);
//        System.out.println(benimKalemim.lenght);
//        System.out.println(benimKalemim.haveEraser);
//        System.out.println(benimKalemim.color);
//        benimKalemim.write();
//        benimKalemim.delete();

    //----------------------------Cat--------------------------

//        Cat efe=new Cat("yesil", "sokak kedisi",true,false);
//        Cat minnos=new Cat("yesil", "sokak kedisi",false,true);
//        Cat pamuk=new Cat("mavi","van kedisi",false,true);
//
//
//        System.out.println(pamuk.eyeColor);
//        System.out.println(pamuk.food());
//        System.out.println(minnos.food());


   //---------------------------------KraftBank-------------------------------

        KraftBankCustomer enes=new KraftBankCustomer("154544525","Enes Yaman",true);
//
//        System.out.println(enes.customerToken);
//        System.out.println(enes.customerAccount);
//        enes.addMoney(500);
//        System.out.println(enes.customerAccount);
//        enes.addMoney(250);
//        System.out.println(enes.customerAccount);
//        System.out.println(enes.customerFullName);
//        enes.addMoney(2000);
//        System.out.println(enes.customerAccount);

    chanceFullName(enes,"Enes Sen");
        System.out.println(enes.customerFullName);


    }

        public static KraftBankCustomer chanceFullName(KraftBankCustomer kraftBankCustomer, String fullName){
        kraftBankCustomer.customerFullName=fullName;
        return kraftBankCustomer;
        }











}
