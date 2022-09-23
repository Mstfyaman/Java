package Day_17_Class_And_Object;

import java.util.Random;
import java.util.Scanner;

public class Banka {

    int hesapNo;
    String musteriAdiSoyad;
    double paraMiktari;
    boolean mobilBankacilik;



    public void hesapAc(){
        Scanner scan=new Scanner(System.in);
        System.out.println(" isim: ");
        musteriAdiSoyad=scan.nextLine();

        Random random=new Random();
        hesapNo= random.nextInt(100000);
        System.out.println(musteriAdiSoyad+ " "+ hesapNo+ " nolu hesabiniz basari ile olusturulmustur");

    }

    public void mobilBankacilikOnay(){
        Scanner scan=new Scanner(System.in);
        System.out.println(" Mobil bankacilik kullanmak icin lutfen evet yaziniz");
        String onay=scan.nextLine();
        if (onay.equals("evet") || onay.equals("Evet") || onay.equals("EVET")){
            mobilBankacilik=true;
            System.out.println(" sayin "+musteriAdiSoyad+ " mobil bankaciligi kullanabilirsiniz");
        }else {
            System.out.println(" sayin "+musteriAdiSoyad+ " mobil bankaciliga giris yapamazsiniz");
        }

    }

    public void paraYatir(double para){
        paraMiktari+=para;

    }

    public void hesapOzeti(){
        System.out.println(musteriAdiSoyad+ " "+" "+hesapNo+ " nolu hesabinizda "+ " "+paraMiktari+ " $ vardir ");

    }

    public void paraCek(){

    }




}
