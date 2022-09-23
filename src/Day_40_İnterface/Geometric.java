package Day_40_İnterface;

public interface Geometric {
    int exponential= 2;
    double PI=3.14;
    double getArea(double expo); //abstract method {}' i yok.


    default double getPrimeter(double...sides){
        double primeter=0;
        for (double side:sides){
            primeter+=side;
        }
        return primeter;
    }

}
class Square implements Geometric{

    double a;  // instance variabledir

    public Square(double a) {
        this.a = a;
//        System.out.println("Area =" +getArea());
//        System.out.println("Primeter =" +getPrimeter(this.a, this.a, this.a, this.a));
    }

    @Override
    public double getArea(double expo) {
       return Math.pow(a,expo);
    }
}
class run{
    public static void main(String[] args) {

        Square square1=new Square(2);
        Circle circle1=new Circle(3);
        System.out.println(circle1.getArea(Geometric.exponential));
//        System.out.println("Area : "+square1.getArea());
//        square1.getPrimeter(2,2,2,2);
//        double primeter= square1.getPrimeter(2,2,2,2);
//        System.out.println("primeter = "+primeter);



    }
}