package Day_45_OOP_ReviewCont2._interface;

public interface A {

    // int i; //instance variable olmaz ( yani değer atamamızı ister. çünkü gizli final vardır)

        public static final int i=10;    // gizli final olduğundan deger atamamız gerekli.
                            int j=20;    // üstteki  ile aynıdır.

    public abstract void M1();
    public abstract void M2();
    public abstract void M3();
    public abstract void M4();

    private void M5(){
        System.out.println("Hello from private method from interface A");
    }

    default void M6(){
        M5();
        System.out.println("Hi from interface A");
    };  // java 8   // defaultu override etmek zorunda değiliz(badisi var)
    // tüm alt sınıfları kolayca etkilemek için default metot kullanımına izin verilmiş.
    // backyard compatibility/geriye dönük uyumluluk
    static void M7(){
        System.out.println("Hello from static method from A interface");

    };  // java 8  ( static override olmaz classa aittir)
    private static void M5_1(){
        System.out.println("Hello from private static method");
    };  // java 9  da gelen özellikler ( private zaten yasak )


}
