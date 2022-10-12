package bootCamp;

import java.util.Scanner;

import static java.lang.Math.*;  // static import budur.

public class B8_İmport {


        // Normal import
        // import packedName.ClassName;    yapı bölye
        // import packageName.*;   paketteki bütün classları import edeceksek


        // Static import
        // import static packedName.ClassName.staticMember;       yapı böyle
        // import static packedName.ClassName.*;       tüm staticleri import edeceksek * koyacaz
        // benefit of static import is I can reach static member of library without typing class name
        // faydası; kütüphanelerdeki veya classlardaki static üyelere class adını yazmadan doğrudan erişim sağlar


        Scanner sc=new Scanner(System.in);

        public  static void main(String[] args){

            max(5,5);  // normalde başında Math.max vardi.  static import is needed
            max(5,7);




        }










}
