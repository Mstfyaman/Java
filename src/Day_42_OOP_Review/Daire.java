package Day_42_OOP_Review;

public class Daire {

   private final static double Pİ=3.14;
   private double radius;


   Daire(){}

   Daire(int radius){
      this.radius=radius;
   }

   public void setRadius(double radius){
      if (!(radius<=0)){
         this.radius=radius;
      }else {
         System.out.println("Yaricap 0 ve 0 dan kücük olamaz");
      }
   }

   public double getRadius(){
      return this.radius;
   }

   public double alan(){
      return Pİ*Math.pow(radius,2);
   }

   public double cevre(){
      return 2*Pİ*this.radius;
   }

   public static double alan(double radius){
      return Pİ*radius*radius;
   }

   public static double cevre(double radius){
      return 2*Pİ*radius;
   }

}
