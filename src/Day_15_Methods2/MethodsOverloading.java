package Day_15_Methods2;

public class MethodsOverloading {
    public static void main(String[] args) {

        //System.out.println(gecmenotu(85,90,77));
       // System.out.println(CalculateArea(3));
        //CalculateArea(5, 4);
        //concat(5,"Alparslan",false);
        //concat("Alparslan",5);
    }

    public static char gecmenotu(double not1,double not2,double not3){

        double ortalama= ((not1+not2+not3)/3);
        if (ortalama>=76 && ortalama<=100){
            return 'A';
        } else if (ortalama>=51 && ortalama<= 75){
                   return 'B';
        } else if (ortalama>=0 && ortalama<=50) {
            return 'C';
        }
    return 'X';
    }

    //---------------METHOT OVERLOADİNG-----------------------

    public static double CalculateArea ( int a){
       double sonuc= 3.14*a*a;
        return sonuc;
    }
    public static void CalculateArea (int a, int b){
        System.out.println(a * b);

    }



    public static void concat(int i,String str,boolean bl){
        if (bl==true){  // if'in içerisi sadece bl de oluyormuş
            System.out.println(str+i);
        } else{
           concat(str,i);                                              // iç içe method çağrılmış
        }

    }
    public static void concat(String kelime,int c){
        for (int t=0; t<c ; t++){
            System.out.println(kelime);
        }

    }









}
