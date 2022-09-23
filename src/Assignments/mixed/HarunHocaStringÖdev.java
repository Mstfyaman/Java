package Assignments.mixed;

import java.util.Scanner;

public class HarunHocaStringÖdev {
    public static void main(String[] args) {


        //System.out.println(unluUNSUZ());                                              //15
        //System.out.println(min3("kelgelmisnedemis"));                                 //16
        //System.out.println(minUc2("kelgelmisnedemis"));                               //17
        //System.out.println(ilkBenzersiz("Karkas rotası"));                            //18
        //System.out.println(aynıHarflerdenOlusan("iftar", "tarif"));                   //19
        //System.out.println(ardıArdına("aabccccseeeeeefff"));                          //20
        //System.out.println(birİlaDortharflikKelimeler("Slm", "Ali"));                 //21
        //22
        //System.out.println(tersKelime("kabak"));                                    //23 //24 aynı
        //System.out.println(sevKelimesi("Sev seni seveni , sevmek güzeldir", "sev"));  //25
        //System.out.println(bursaAnkara("Ankara ile Bursa arası 500 km. "));           //26
        //System.out.println(acak("ZamlanaCak"));                                       //27
        //System.out.println(harfSayiBası("Merhaba"));                                  //28
        System.out.println(enCokHarf());                                              //29



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

    public static String ilkBenzersiz(String str){
        str=str.replace(" ", "").toLowerCase();
        String harf="";
        for (int i=0; i<str.length();){
            if (!str.substring(1).contains(str.subSequence(0,1))){
                harf+=str.substring(0,1);
                return harf;
            }
            str=str.replace(str.substring(0,1),"");
        }
        return harf;
    }


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


//22 //Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//ikazı versin.



//23  //Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
//true değil ise false döndüren metot yazınız

    public static boolean tersKelime(String str){
        String result="";

        for (int i=str.length()-1; i>=0; i--){
            result+= str.charAt(i);
        }
        if (result.equals(str)){
            return true;
        }else {
            return false;
        }
    }


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


    //26 //Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
    //sayılarda dönüyorsa false yazdıran metodu yazınız.

    public static boolean bursaAnkara(String str){
        str=str.toLowerCase();
        String[] word;
        word=str.split("ankara");
        int count=word.length-1;
        word= str.split(" bursa");
        int count2=word.length-1;
        if (count==count2){
            return true;
        }
        return false;
    }


    //27 //Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
    //döndüren metodu yazdırın    tamam

    public static boolean acak(String str){

        if (str.substring(str.length()-4).equalsIgnoreCase("acak")){

            return true;

        }else {
            return false;
        }
    }

    //28 //Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
    //yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)

    public static String harfSayiBası(String str){

        str=str.toLowerCase();
        str=str.replace(" ","");
        String emptyString=" ";

        for (int i=0; i<str.length(); i++){
            int count=0;
            for (int j=0; j<str.length(); j++){
                if (str.charAt(i)== str.charAt(j)){
                    count++;
                }
            }
            if (str.contains(emptyString)){
                continue;
            }
            if (emptyString.contains("" +count + str.charAt(i))){
                continue;
            }
        }return emptyString;
    }

    //29 //Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.

    public static char enCokHarf() {
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle yaziniz : ");
        String word = scan.nextLine();
        word = word.toLowerCase();
        word = word.replace(" ", "");
        int max = 0;
        String nullString = "";
        loop1:
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            loop2:
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
                if (max < count) {
                    max = count;
                    nullString += word.charAt(i);
                    continue loop1;
                }
            }
        }
        return nullString.charAt(1);
    }









}