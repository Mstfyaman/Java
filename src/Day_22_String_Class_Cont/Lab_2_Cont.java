package Day_22_String_Class_Cont;

import java.util.Scanner;

public class Lab_2_Cont {
    public static void main(String[] args) {

        //System.out.println(kisaUzunKelime("Ali", "Mehmet"));
        //System.out.println(kelimeVeyaSoz("karakter"));
        //System.out.println(ilkİkiHarf("panpa"));
        //System.out.println(adSoyad());
        //System.out.println(yinelenenKarakter("Merhaba"));
        //System.out.println(yinelenenKarakter2("kavva"));
        //System.out.println(rakamBul("2jaca1155445sere821"));
        //System.out.println(harfBul("2jaca115544%55se%r/e821"));
       // System.out.println(aynıHarflerdenOlusan("iftar", "tarif"));
        //System.out.println(birİlaDortharflikKelimeler("Slm", "Almmi"));
        //System.out.println(unluUNSUZ());

        // System.out.println(ardıArdına("asdasd"));
       // System.out.println(sevKelimesi("Sev seni seveni , sevmek güzeldir", "sev"));

      //27  System.out.println(acak("ZamlanaCak"));


    }

//9  //Kullanıcıdan 2 kelime alın kısa kelimeyi başta 2 defa uzun kelimeyi ortada 30
    //defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String kisaUzunKelime(String word1, String word2){

        String result="";
        if (word1.length()<word2.length()){
            for (int i=0; i<2; i++){
                System.out.print(word1);
            }
                for (int j = 1; j <= 30; j++) {
                    System.out.print(word2);
                }
                for (int k = 1; k <=2 ; k++) {
                    System.out.print(word1);
                }

        }

        return result;
    }


    //10 //Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    //altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String kelimeVeyaSoz(String str){

        if (str.length()>=5){
            return  str.substring(0,5);
        }else {
            String result="";
            for (int i=0; i<5-str.length(); i++){

                result+=".";
            }
            return str.concat(result);
        }

    }

    //11 //Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
    //almıyorsa false yazdırın

    public static boolean ilkİkiHarf(String str){

        if (str.substring(0,2).equals(str.substring(str.length()-2))){

            return true;
        }else {
            return false;
        }

    }

    //12 //Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    //Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.

    public static String adSoyad(){
        Scanner scan=new Scanner(System.in);
        String ad=scan.nextLine();

        ad=ad.trim();

        String sonuc= "soy adiniz = " +ad.substring(ad.lastIndexOf(" ")+1);


        return sonuc;
    }

    //13  //Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)

    public static String yinelenenKarakter(String str){

        String result="";

        while (!str.isEmpty()){

            result+=str.charAt(0);
            str=str.replace(str.substring(0,1), "");
        }

        return result;
    }


    //14 //Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
    //olarak return eden methot yazınız.

    public static String yinelenenKarakter2(String str){

        String x= str.replace(" ", "");
        String result="";

        while (!x.isEmpty()){
            if (x.substring(1).contains(str.substring(0,1))){
                result+=x.substring(0,1);

            }
            x=x.replace(str.substring(0,1),"");
        }
        return result;
    }


    // ara ornek  // yazılan kelimenin içerisinde sayıları yazdıran metodu yazınız
    // merha123ba 123
    //123a23ff34  1232334
    //ASCII

public static String rakamBul(String str){
        String result="";
        for (int i=0; i<str.length(); i++ ){
            if (str.charAt(i)>47 && str.charAt(i)<58){
                result+=str.charAt(i);
            }
        }
        return result;
}
// -------------------odev-----------2jaca1155445sere821

    public static String harfBul(String str){
        String result="";
        for (int i=0; i<str.length(); i++ ){
            if (str.charAt(i)>96 && str.charAt(i)<123){
                result+=str.charAt(i);
            }
        }
        return result;
    }


    //15 //Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //ayrı ayrı ekrana yazan programı yazınız.

    public static String unluUNSUZ(){

        Scanner scan=new Scanner(System.in);
        String word1=scan.nextLine();
        String unluUnsuz= "";
        String unsuz="";
        for (int i =0; i <word1.length() ; i++){
            switch (word1.charAt(i)){
                case 'a','e','i','ü','o','ı','ö':
                    unluUnsuz+= word1.charAt(i);
                    break;
                default:
                    unsuz+=word1.charAt(i);
            }
        }
        return "unlu harfler= "+unluUnsuz+"\n unsuz harflar ="+unsuz;
    }

    //16  //Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
    //harfini kelimeden keserek sonuna ekleyin.

    public static String min3(String str){

        String sonuc=  str.substring(3,str.length())+str.substring(0,3);


        return sonuc;
    }

    //17 //Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
    //harfini kelimeden keserek kelimenin başına ekleyin

    public static String minUc2(String str){

        String sonuc2= str.substring(str.length()-4)+str.substring((3));
        String x= sonuc2.replace(" ","");


        return x;
    }

    //18 //Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
    //küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
    //ikazı versin.






    //19 //Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
    //eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
    //yazdırın. (anagram kelime ise)   tamam

    public static boolean aynıHarflerdenOlusan(String str, String str2){

        int count=0;

        if (str.length()==str2.length() ){
            for (int i=0; i<str.length(); i++){
                for (int k = 0; k < str2.length(); k++) {
                    if (str.charAt(i)==str2.charAt(k)){
                        count++;
                        if (count==str.length()){
                            return true;
                        }
                    }

                }
            }

        }
        return false;
    }


    //20 //Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
//yazın     tamam

    public static String ardıArdına(String str){             //abaccb


        String result="";

        while (!str.isEmpty()){
            if (str.substring(1).contains(str.substring(0,1))){
                result+=str.substring(0,1);

            }
            str=str.replace(str.substring(0,1),"");
        }
        return result;
    }



//21    //Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
//girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
//Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
//giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
//birleştirerek yazdırın.

    public static String birİlaDortharflikKelimeler(String str, String str2) {


        String mtr = "";
        mtr = str.concat(" " + str2);


        if (str.length() >= 1 && str.length() <= 4 && str2.length() >= 1 && str2.length() <= 4) {

            System.out.println(str.concat(" " + str2));

        }

        return "";
    }


//22 //

//23  //Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
//true değil ise false döndüren metot yazınız

//24 //   23. soru ile aynı bu soru


//25 //Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
//ekrana yazdırın.     taman

    public static int sevKelimesi(String str, String target){

        int count=0;
        for (int i = 0; i < str.length()-target.length()-1; i++) {
            if (str.substring(i,i+target.length()).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }


    //26 //



    //27 //Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
    //döndüren metodu yazdırın    tamam

    public static boolean acak(String str){

        if (str.substring(str.length()-4).equalsIgnoreCase("acak")){

            return true;

        }else {
            return false;
        }
    }


    //28
















}






