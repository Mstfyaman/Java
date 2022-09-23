package Day_40_İnterface;

public interface A {

   int number=10; // interfacede default fieldsler public static final olarak kabul edilir.
                    // ve fieldse değier vermek zorunludur çünki final


    public abstract void M1(); // bu normade abstract methodur. o yüzden
                                // public anstract kısmını gereksiz görerek sönük veriyor
    void M2();
    void M3();
    void M4();

    default void M5(){  // bu normal method override gerektirmezz- istersek yine override edilebilir

    }

    static void M6(){  //static method da override gerektirmezz- istersek yine override edilebilir

    }


}
