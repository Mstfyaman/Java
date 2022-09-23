package Day_10_Swich;

import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println(" -------------------------");

//        System.out.print(" Kacinci ay; ");
//        int numOfMont = scan.nextInt();
//
//        switch (numOfMont) {
//            case 1:
//                System.out.println(" Ocak");
//                break;
//            case 2:
//                System.out.println(" Şubat ");
//                break;
//            case 3 :
//                System.out.println(" Mart ");
//                break;
//            case 4 :
//                System.out.println(" Nisan ");
//            case 5:
//                System.out.println(" Mayis ");
//                break;
//            case 6 :
//                System.out.println(" Haziran ");
//                break;
//            case 7 :
//                System.out.println(" Temmuz ");
//            case 8:
//                System.out.println(" Agustos ");
//                break;
//            case 9 :
//                System.out.println(" Eylul ");
//                break;
//            case 10 :
//                System.out.println(" Ekim ");
//            case 11:
//                System.out.println(" Kasim ");
//                break;
//            case 12 :
//                System.out.println(" Aralik ");
//                break;
//            default:
//                System.out.println(" Girdiginiz sayi bir ay ile eslesmiyor ");
//
//        }

        // System.out.println("--------------------------------------------");
//
//        System.out.print(" Hangi gun; ");
//        int numOfWeek = scan.nextInt();
//
//        switch (numOfWeek) {
//            case 1:
//                System.out.println(" Pazartesi");
//                break;
//            case 2:
//                System.out.println(" Sali ");
//                break;
//            case 3 :
//                System.out.println(" Carsamba ");
//                break;
//            case 4 :
//                System.out.println(" Persembe ");
//            case 5:
//                System.out.println(" Cuma ");
//                break;
//            case 6 :
//                System.out.println(" Cumartesi ");
//                break;
//            case 7 :
//                System.out.println(" Pazar ");
//                break;
//            default:
//                System.out.println(" Girdiginiz sayi bir gün ile eslesmiyor");


//
       // System.out.print(" Kac Beden? ");
//        int bedennu = scan.nextInt();
//
//        switch (bedennu) {
//            case 38,40,42 :
//                System.out.println(" small");
//                break;
//            case 44,46,48:
//                System.out.println(" medium ");
//                break;
//            case 50,52,54 :
//                System.out.println(" large ");
//                break;

//        System.out.println("------HESAP MAKİNESİ-------------");
//
//        System.out.println(" Hesap Makinesi Hazir ");
//
//        int num1 = scan.nextInt();
//        scan.nextLine();
//        String aritmetik = scan.nextLine();
//        int num2 = scan.nextInt();
//        int sonuc = 0;
//
//        switch (aritmetik) {
//            case "+":
//                sonuc = num1 + num2;
//                System.out.println("sonuc : " + sonuc);
//                break;
//            case "-":
//                sonuc = num1 - num2;
//                System.out.println("sonuc : " + sonuc);
//                break;
//            case "*":
//                sonuc = num1 * num2;
//                System.out.println("sonuc : " + sonuc);
//                break;
//            case "/":
//                sonuc = num1 / num2;
//                System.out.println("sonuc : " + sonuc);
//                break;
//            default:
//        }



//
//        System.out.println("SAYI TAHMİNİ------------------------");
//
//
//        System.out.println(" Pozitif bir sayı tahmin et"      );
//        int sayı =20;
//        int tahmin= scan.nextInt();
//
//        if (tahmin<sayı){
//            if (tahmin>sayı/2){
//                System.out.println(" Yaklaştın biraz daha büyük bir sayi söyle");
//            } else if (tahmin<sayı/2) {
//                System.out.println(" Yakın değilsin daha büyük bir sayı söyle");
//            }else {
//                System.out.println(" Ne uzaksın ne çok yakınsın");
//            }
//
//
//
//        } else if (tahmin>sayı) {
//            if (tahmin<sayı+sayı/2){
//                System.out.println(" Tahmininiz yakın ancak daha küçük bir sayı söylemelisiniz");
//            } else if (tahmin>sayı+sayı/2) {
//                System.out.println(" çok büyük bir sayi söyledin daha küçük bir tahminde bulun");
//
//            }else {
//                System.out.println(" Pek yakın değilsin biraz daha küçük bir sayı söyle");
//            }
//
//        }else
//            System.out.println(" tahmininiz doğrudur TEBRİKLER");
//
//
        System.out.println(" Otel Yapımı-----------------------------");

//        3 katlı bir motel in
//        1. katında Resepsion, Güvenlik ve Oda hizmetler var.
//        2 katında Yemekhane, Dinlenme salonu ve Room1,Room2
//        3.katında ise Room3,Room4,Room5,Room6 vardır.
//                Bir switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım alacagınız bir program(nested
//        switch) yazın. Tanıtım bilgileri için aşağıdakileri kullanabilirsiniz.
//                message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.
//        message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
//        2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
//        3.kat : Room3-Room4-Room5-Room6
//        Resepsion : tüm işlemleriniz için bekleriz
//        Güvenlik : profosyonel bir hizmettir
//        Oda hizmetleri : temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz
//        Yemekhane : Kahvaltı 08-11
//        Öğle yemeği 12-15
//        Akşam yemeği 18-21
//        Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
//        Room1,Room2 : ekonomik oda
//        Room3,Room4 : standart oda
//        Room5,Room6 : özel oda


        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.");
        System.out.println("1.kat : Resepsion-Güvenlik-Oda hizmetleri\n2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n3.kat : Room3-Room4-Room5-Room6");

        int kat= scan.nextInt();
        scan.nextLine();
         String secim=scan.nextLine();

         switch (kat){
             case 1:
                 switch (secim){
                     case "resepsion":
                         System.out.println("tüm işlemleriniz için bekleriz");
                         break;
                     case " güvenlik":
                         System.out.println("profosyonel bir hizmettir");
                         break;
                     case " oda hizmetleri":
                         System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz\n" +
                                 "//        Yemekhane : Kahvaltı 08-11");
                         break;
                     default:
                         System.out.println(" böyle bir oda yoktur");


                 }
                 break;

             case 2:
                 switch (secim){
                     case "yemekhane":
                         System.out.println("Kahvaltı 08-11\nÖğle yemeği 12-15\nAkşam yemeği 18-21");
                         break;
                     case "dinlenme salonu":
                         System.out.println("24 saat çay servisi ile hizmetinizdedir");
                         break;
                     case "Room1","Room2":
                         System.out.println("ekonomik oda");
                         break;
                     default:
                         System.out.println(" böyle bir oda yoktur");

                 }

                 break;

             case 3:
                 switch (secim){
                     case " room3","room4":
                         System.out.println("standart oda");
                         break;
                     case "room5","room6":
                         System.out.println("özel oda");
                         break;
                     default:
                         System.out.println(" böyle bir oda yoktur");
                 }
                 break;
             default:
                 System.out.println(" Otelimizde boyle bir kat yoktur.");

         }















        }
        }

