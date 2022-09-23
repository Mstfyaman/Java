package Day_41_Polymorphism;

public class Main_Polymorphism {
    public static void main(String[] args) {
        Animal karabas=new Dog();   // animalden bir obje oluşturuyoruz, sadece dog a göre hareket ediyor
        karabas.voice(); // animalde ne varsa kullanır, dogtan sadece overriding olanları alır. gerisini almaz.

        SporCar kırmızıMelek=new SporCar();
        kırmızıMelek.start();
        kırmızıMelek.speed();
        kırmızıMelek.stop();

        Car beyazMelek= new SporCar();   // cardaki bütün özellikleri kullanacak, sporcardaki sadece overridingleri

       // IVehicle sarıMelek= new SporCar(); // ıvehicledeki bütün özellikleri kullanacak, sporcardaki sadece overridingleri
       // sarıMelek.start();   // star overrinding olduğundan  sporcodakini alacak
       // sarıMelek.stop(); // stop  sporkarda olmadığından üst class olan carsan stop alacak
       // System.out.println(sarıMelek.tekerSayisi());  // ıvehivledeki tekersayisini methodta attık ve burda çağırıp yazdırdık

        Kus limon=new Kanarya();
        Kus mavis=new Muhabbet();

      //  System.out.println(mavis instanceof Kus);  // mavis kusun bir örneğimidir soorusu true/false

//          if (limon instanceof Kanarya)
//              System.out.println("Limon karnaryanın bir örneği");
//
//        if (limon instanceof Muhabbet)
//            System.out.println("Limon muhabbetin bir örneği");  // false vercek ve birşey yazmıycak
//


        Kus kus=new Kus();
        Kanarya kanarya=(Kanarya) kus; // kus burda parent sınıf olduğundan parantez içindeki kanarya ile casting(down-casting) yaptık







    }

}
