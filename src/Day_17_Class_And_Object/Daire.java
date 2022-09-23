package Day_17_Class_And_Object;

public class Daire {

    final static double pi=3.14;
    int r;

        public void mesaj(){
            System.out.println(r+ " yarıcapli bir dairedir");
        }

        public void cevreHesapla(){
            double sonuc=2*pi*r;
            System.out.println(r+ " yaricapli daireninin cevresi =" +sonuc);

        }
         public double alanHesapla(){
            return (pi*r*r);
         }
    public static double cevreHesaplaParametreli(int yaricap){
        double sonuc=2*pi*yaricap;

            return 0;
    }

    public static double alanHesaplaParametreli(int yaricap){

        return (pi*yaricap*yaricap);
    }


}
