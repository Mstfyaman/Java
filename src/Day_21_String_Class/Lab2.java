package Day_21_String_Class;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        //System.out.println(firtThree("Ahmet meraba döndünmü"));
        //System.out.println(boslukKaldir("merhaba dunya nasilsin hava nasil   "));
        //System.out.println(ikinciyari("harmer"));
        // System.out.println(changerWord("Merhaba", "a", "i"));
        //System.out.println(ucKezYazdirma("abow"));
        //System.out.println(harfSayisi("Ankara","a"));
         //System.out.println(kelimeSayisi("ankara", "An"));
        //System.out.println(harfTemizle("yapmaetme","e"));
        //System.out.println(controlSentesce("merhaba dunya", "rha"));
        // System.out.println(kisaUzunKelime("Ali", "Mehmet"));
        //System.out.println(kelimeVeyaSoz("baba"));
        //System.out.println(ilkİkiHarf("salsa"));
         //System.out.println(adSoyad());
        //System.out.println(yinelenenKarakter("merhaba"));

        //System.out.println(unluUNSUZ());
        //System.out.println(min3("merhaba"));
        //System.out.println(minUc2(" merhaba "));

    }

   //1  //Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
//ise inputu döndüren bir metot yazınız.

    public static String firtThree(String str){

        if (str.length()<3){
            return str;
        }
        return str.substring(0,3);
    }

    //2  //Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static String boslukKaldir(String str){

        return str.replace(" ","%");
    }
    //3  //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
//yazdırın.

    public static String ikinciyari(String str){

        return str.substring(str.length()/2);
    }

    //4  //Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
    //alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
    //yazınız.

    public static String changerWord(String str,String old, String new1 ){

     return str.replaceFirst(old, new1);
    }

    //5  //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.

    public static String ucKezYazdirma(String str){

        String result="";
        for (int i = 0; i <str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result=result+str.charAt(i);
            }
        }
        return result;
    }

   //6  //Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    //kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    //edilecek)
    // bulamaz ise 0 dondursun

    public static int harfSayisi(String str, String target){

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

    //Kullanıcıdan iki keilme alın ve
    // bu kelimenin istenen 2. kelimenin ilk kelimede kaç adet bulunduğunu ekrana
    //getiren programı yazınız
    // büyük küçük harf göz ardı edilecek
    //Ankaran, ank        1
    //sarmalasaksa , sa      3
    // bulamaz ise 0 döndüren programı yazınız


    public static int kelimeSayisi(String str, String target){

        int count=0;
        for (int i = 0; i < str.length()-target.length()-1; i++) {
            if (str.substring(i,i+target.length()).equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

    //7  //Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
    //kaldırılmış şekilde string döndüren programı yazınız.

    public static String harfTemizle(String kelime, String harf){

        return  kelime.replace(harf,"");
    }

    //8 //Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;

    public static boolean controlSentesce(String str, String control){

        if (str.substring(0,control.length()).equalsIgnoreCase(control) ||
                str.substring(1,1+control.length()).equalsIgnoreCase(control) ){
            return  true;
        }
        return false;
    }












    //14 //Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
    //olarak return eden methot yazınız.






    //15 //Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    //ayrı ayrı ekrana yazan programı yazınız.

    public static String unluUNSUZ(){

        Scanner scan=new Scanner(System.in);
        String word1=scan.nextLine();
        String unluUnsuz= "";
        for (int i =0; i <word1.length() ; i++){
            switch (word1.charAt(i)){
                case 'a','e','i','ü','o','ı','ö':
                    unluUnsuz+= word1.charAt(i);
                    break;
                default:
            }
       }
        return unluUnsuz;
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









}
