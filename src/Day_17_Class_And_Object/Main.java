package Day_17_Class_And_Object;

public class Main {
    public static void main(String[] args) {
//    Person ogrenci_1= new Person();
//    ogrenci_1.isim="Harun";
//    ogrenci_1.cinsiyet="Erkek";
//    ogrenci_1.yas=18;
//    Person ogrenci_2=new Person();
//    ogrenci_2.isim="Ayse";
//    ogrenci_2.cinsiyet="Kadin";
//    ogrenci_2.yas=16;
//    //ogrenci_1.oyunoyna();
//    //ogrenci_1.uyu();
//
//        System.out.println(ogrenci_1.isim+ " ile "+ogrenci_2.isim+" arkadastir" );
//        System.out.println(ogrenci_1.isim+" yas: " +ogrenci_1.yas);


//        Dog kucukucu=new Dog();
//        kucukucu.isim="Karabas";
//        kucukucu.renk="Beyaz";
//        kucukucu.cins="Sivas Kangali";
//        //kucukucu.uyu();
//       // kucukucu.yemekYe();
//        //kucukucu.havla();
//
//        System.out.println(kucukucu.isim+" isimli "+kucukucu.renk+" renkli "+kucukucu.cins+" kopek ");


//        Car tesla_1=new Car();
//        tesla_1.model="Model 3";
//        tesla_1.marka="Tesle";
//        tesla_1.hiz=360;
//        tesla_1.renk="Sari";
//        tesla_1.engine=1.9;
//        tesla_1.dur();
//        tesla_1.calistir();
//        tesla_1.far();
//        tesla_1.hizlan();

//        Daire daire_1=new Daire();
//
//        daire_1.yariCap=2;
//        System.out.println("dairenin alani= " +daire_1.alanHesapla());
//
//        Daire daire_2=new Daire();
//        daire_2.yariCap=5;
//        System.out.println("dairenin cevresi= " +(int)daire_2.cevre());


        //System.out.println(Math2.pow(2, 6));


//        Daire daire=new Daire();
//        daire.r=5;
//        System.out.println("dairenin alani = " +daire.alanHesapla());
//        daire.cevreHesapla();

//       double x= Daire.alanHesaplaParametreli(6);
//        System.out.println("x: "+x);
//
//        System.out.println(Daire.pi);
//        double y=Daire.cevreHesaplaParametreli(6);
//        System.out.println("y: "+y);

        Banka person_1=new Banka();
        person_1.hesapAc();
        person_1.mobilBankacilikOnay();
        person_1.paraYatir(50);
        person_1.paraYatir(50);
        //System.out.println(person_1.musteriAdiSoyad+ " "+" "+person_1.hesapNo+ " nolu hesabinizda "+ " "+ person_1.paraMiktari+ " $ vardir ");
        person_1.hesapOzeti();
        person_1.paraYatir(150);


        Banka person_2=new Banka();
        person_2.hesapOzeti();
        person_2.hesapAc();
        person_2.mobilBankacilikOnay();
        person_2.paraYatir(188);

        person_1.hesapOzeti();
        person_2.hesapOzeti();








    }

}
