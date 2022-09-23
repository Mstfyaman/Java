package Day_40_İnterface;

public class Circle extends Square  implements  Geometric{  // hem extends hem implement ettik


    public Circle(double a) {
        super(a);
    }


    @Override
    public double getArea(double expo) {
        return Geometric.PI*Math.pow(a,2);
    }
}




