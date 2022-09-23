package Assignments.Inheritance_Odev;

public class Main_person_and_other {
    public static void main(String[] args) {

        //Tester enes=new Tester(68,true,true);
      //  Developer alparslan=new Developer();
       // ProjectOwner salih=new ProjectOwner(true,6);
        HumanResources ali=new HumanResources("ali");
        System.out.println(ali.areaResponsibility);
        System.out.println(ali.dailyOverTİme);
//        System.out.println(enes.dailyOverTİme);
//        System.out.println(enes.isManuel);
//        System.out.println(enes.identifyProblems);
        // Developer.yoruldum();


        // ----------tüm sınıflara istediğiniz kadar consructorlar tanımlanacak
        // super ve this keyword kullanılacak
        //-----------softwareDevelopment sınıfına 2 farklı method yazılacak (daily time, sprint day)
        // ----------tüm sınıfların getter ve setter methodları olacak
        //-----------bazı sınıflarda değişkenler için default/protected/private kullanılacak
        //2 adet sınıfta static method kullanın ( methodları size bırakıyorum)
        // ----------method overriding yapılacak

       //enes.kullanılanİde();



    }
}
