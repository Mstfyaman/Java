package Day_31_Constructor;

public class Summary {
    public static void main(String[] args) {


        Okul gaziİlkOgretimOkulu=new Okul();
        Okul gaziOrtaokulu=new Okul("lacivert",20);
        Okul eregliLisesi=new Okul(450);

        System.out.println("eregliLisesi.kapasite = " + eregliLisesi.kapasite);
        eregliLisesi.kontrolKapasite();


    }






}
