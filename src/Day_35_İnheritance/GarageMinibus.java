package Day_35_İnheritance;

public class GarageMinibus {
    public static void main(String[] args) {

    Minibus minibus=new Minibus();

        minibus.type="Minibus";
        minibus.color="Mavi";
        minibus.seat=14;
        minibus.sellPriceWithTax(50000);

        minibus.using();
        minibus.toString();

    }
}class GarageTruck{
    public static void main(String[] args) {

        Truck truck=new Truck();

            truck.carryingCapasity=16000;
            truck.type="Kamyon";
            truck.color="kirmizi";
            truck.sellPriceWithTax(120000);

            truck.carrying();
            truck.toString();


    }
}
