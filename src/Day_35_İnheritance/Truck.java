package Day_35_İnheritance;

public class Truck extends Vehicle{
// Truck is a Vehicle
    int carryingCapasity;

    public void carrying(){
        System.out.println(color + " " + type + " " + carryingCapasity + " yuk tasir");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapasity=" + carryingCapasity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
