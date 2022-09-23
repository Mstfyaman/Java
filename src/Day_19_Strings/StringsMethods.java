package Day_19_Strings;

import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args) {

//    String str="Persembe";
//    System.out.println(str.length());    // str içerisindeki kelimelerin boşluklar dahil kaç karakter olduğunu verir.
//    int i= str.length();  // değerede atayabiliriz.
//        System.out.println(i);
//        String str2="";
//        System.out.println(str2.length()); // 0 yazacaktır, çünki değer atamadık
//
//
//        String str3=" JavaYi SevİyoRuZ";
//        System.out.println(str3.toUpperCase());  // hepsini büyük yazaar
//        System.out.println(str3.toLowerCase()); // hepsini kücük yazar

        //String str4 = "Program Files\\Java\\jdk-18.0.2\\bin\\java.exe\" \"-javaagent:D:\\IntelliJ IDEA Community Edition 2022.1.4\\lib\\idea_rt.jar=65041:D:\\IntelliJ IDEA Community Edition 2022.1.4\\bin\" -Dfile.encoding=UTF-8 -classpath C:\\KraftBatch_2\\out\\production\\KraftBatch_2 Day_19_Strings.StringsMethods\n" +
                //"8";
        // System.out.println(str4.length());
        // System.out.println(str4.length() - 1);                   // son indeksi verir ( son harf )
        // System.out.println(str4.charAt(str4.length() - 1));     // -1 olmasının nededi saymaya 0 dan başlar ve -1 yaparak bulur
        // System.out.println(str4.charAt(9));                    // str.4 ün 9. karakterini ister
        // System.out.println(str4.charAt(0));                   // str.4 ün ilk karakterini ister


//        String str5="Selam Arkadaslar ";
//        String str6="nasilsiniz";
//
//        System.out.println(str5.concat(str6));   //  'concat'  iki stringi birbirine bağlar


        // ---------------------------- ÖRNEKLER --------------------

//        Scanner scan=new Scanner(System.in);
//                                                            // girilen kelimenin karakter sayısı
//        System.out.print("Lutfen bir kelime giriniz =");
//        String kelime=scan.nextLine();
//        System.out.println(" girdiginiz kelimenin karakter sayisi = " +kelime.length());


//        Scanner scan=new Scanner(System.in);
//        String name=scan.nextLine();
//        String surName=scan.nextLine();                 // isim soy isim karakter sayisi
//        int a=name.length();
//        int b=surName.length();
//        System.out.println(" adinizin karakter sayisi ="+(a+b)+ " dir");


//        String str8=" Selam Arkadaslar ";
//        System.out.println(str8);
//        System.out.println(str8.trim());        // 'trim' string içindeki ön ve arka bosluğu alır, kelime arasını alamaz


//        String str9= " Selam Arkasiradakiler";
//        System.out.println(str9.replace("Selam", " Merhaba"));           // 'replace'   istenilen kelimeyi değistirme
//
//        String str10= "Selam Arkadaslar";
//        System.out.println(str10.indexOf("Ark"));  // string içindeki girilen kelimenin başındaki harfin indeksini verir




        //System.out.println(asSoyadBuyukKucuk());
        //sonİndeks();
        //herKarakter();                              // bunlar alttali methodları çalıştırıyor
        //  trim();
        //tarih();
        //odev();
        //indeks();
        //System.out.println(word("Javayi Seviyor muyum?"));
        //System.out.println(sesliHarf());
        //sev();
        //System.out.println(myName());
        // myName2();
        // System.out.println(ortaHarfler("Mustafa"));
        //System.out.println(buNasılOrnek("hacibaci", "kalemmalem"));
        // withoutFirst("talip","tiras");
        // nickName();
    }

//        public static String asSoyadBuyukKucuk(){
//
//        Scanner scan=new Scanner(System.in);
//        String nameSurname=scan.nextLine();          // method içinde assoyad  büyük yazdirma
//
//        return nameSurname.toUpperCase();



//    public static void sonİndeks(){
//
//        Scanner scan=new Scanner(System.in);                              // son indeksi alma ( son harf)
//        String kelime=scan.nextLine();
//
//        System.out.println(kelime.charAt(kelime.length() - 1));
//    }

//    public static void herKarakter(){
//
//        Scanner scan=new Scanner(System.in);
//        String kelime=scan.nextLine();
//        int x=  kelime.length();
//                                                     // hata aldım bak !!!
//        for (int i=0; i<x; i++);
//        System.out.println(kelime.charAt(i));
//
//    }


//    public  static void trim(){
//
//        String kelime= " herkese benden cay ";
//       System.out.println(kelime.trim());
//    }

//    public static void tarih(){          // istenilen kelimeyi değiştirme
//
//        String tarih= " 18/10/2022 20:50:55 ";
//        System.out.println(tarih.replace("18/10/2022 20:50:55", " 18102022205055"));
//
//    }

//    public static void odev(){
//
//        Scanner scan=new Scanner(System.in);
//        String word1=scan.nextLine();
//        String word2=scan.nextLine();
//        String word3=scan.nextLine();
//        int x,y,z;
//        x=word1.length();
//        y=word2.length();
//        z=word3.length();
//
//        if (x>y && y>z){
//            System.out.println(word1.concat(word2).concat(word3));
//        } else if (y>x && x>z) {
//            System.out.println(word2.concat(word1).concat(word3));
//        } else if (x>z && z>y) {
//            System.out.println(word1.concat(word3).concat(word2));
//        } else if (y>z && z>x) {
//            System.out.println(word2.concat(word3).concat(word1));
//        } else if (z>x && x>y) {
//            System.out.println(word3.concat(word1).concat(word2));
//        } else if (z>y && y>x) {
//            System.out.println(word3.concat(word2).concat(word1));
//        }else {
//            System.out.println(" DIKKAT !!! gir diginiz kelimelerin uzunlugu birbirinden farkli olmalidir");
//        }
//    }

//        public static void indeks(){
//
//        Scanner scan=new Scanner(System.in);
//        String kelime1=scan.nextLine();            // 2. kelimenin içine 1. kelimedeki bir harfi bulma
//        String kelime2=scan.nextLine();
//        System.out.println(kelime2.indexOf("bak"));
//
//        }


//    public static int word(String str){
//
//        int count= 0;                                        // kelime içinde ki y harflerini yazdıracaktı ama çalıştıramadım.
//        for (int i=0; i< str.length(); i++){
//            if (str.charAt(i)=='y'|| str.charAt(i)== 'Y');
//            count++;
//
//        }
//        return count;
//    }

    //------------------------------------------------//

//    public static String sesliHarf(){
//
//        //Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın.
//
//        Scanner scan=new Scanner(System.in);
//        String word1=scan.nextLine();
//        String holder= "";
//        for (int i =0; i <word1.length() ; i++){       // kelime içerindeki sesli harfleri yazdırma
//            switch (word1.charAt(i)){
//                case 'a','e','i','ü','o','ı','ö':
//                    holder+= word1.charAt(i);
//                    break;
//                default:
//            }
//        }
//        return holder;
//            }

//-----------------------------------//

//    public static void sev(){                          // 'sev' kelimesi varsa alttaki mesajı yazdırma
//        Scanner scan=new Scanner(System.in);
//        System.out.println(" lutfen icerisinde 'sev' ibaresi bulunan bir kelime giriniz ");
//        String sev=scan.nextLine();
//        if (sev.contains(sev)){
//            System.out.println("what a lovely person");
//        }
//    }

    //------------------------------------------------------------//

//    public static String myName(){
//        String name= "Mustafa";                  // ismimin son 3 harfini uc kez yazdırma
//        for (int i = 0; i < 2; i++) {
//            System.out.println(name.substring(name.length() - 3));
//        }
//        return name.substring(4);
//    }

//---------------------------------------------------//


//    public static void myName2(){
//       // 1-İsminizin ortadaki 3 harfini veren bir method yazın
//
//        String name= "Mustafa";
//            System.out.println(name.substring(2,name.length() - 2));
//    }

    //-----------------------------------------------//

//    public static String ortaHarfler(String str){
//       return str.substring(str.length()/2-1,str.length()/2+2);
//
//
//        // 1-İsminizin ortadaki 3 harfini veren bir method yazın     üsteki örneğin benzeri
//    }

    //--------------------------------------------------//


//    public static String buNasılOrnek(String name, String surName){
//
//        //2-İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
//        //kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
//        //birleştirin
//
//        if (name.length()>surName.length()){
//           return name.substring(0,surName.length()).concat(surName);
//            // System.out.println(name.concat(surName));
//
//        } else if (surName.length()>name.length()) {
//           return surName.substring(0,name.length()).concat(name);
//            //System.out.println(surName.concat(name));
//
//        }else {
//           return name.concat(surName);
//        }
//    }

//_------------------------------------------//

//    public static void  withoutFirst(String str, String str2){
//
//        //3-İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
//        //baş harfinden arındırıp yazdıran bir method oluşturun.
//
//        String empty= "";
//        char birincininİlkHarfi= str.charAt(0);
//        for (int i = 0; i < str2.length(); i++) {
//            if (str2.charAt(i)!=birincininİlkHarfi){
//                empty+=str2.charAt(i);
//            }
//
//        }
//        System.out.println(empty);
//    }

//    public static void nickName(){
//        //İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname oluşturan bir method yazın.
//
//        String name= " Mustafa";
//        String surName= " Yaman";
//        System.out.println(name.substring(0, 3).concat(surName.substring(surName.length() - 3)));
//    }






}
