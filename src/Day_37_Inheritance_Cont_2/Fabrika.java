package Day_37_Inheritance_Cont_2;

public class Fabrika {

    int num;
    String member;
    boolean isActive;


    public Fabrika(){  // bos consructor
    }

    public Fabrika(String str){
        this.member =str;
    }

    public Fabrika(String str,boolean isActive){
        this.member =str;
        this.isActive=isActive;
    }



    String personelAdi1;
    protected String personelAdi2; // (protected) başka bir packagede çağıracaksak o packagedeki classı extends etmek gerekir.

    public String defaultMethod(){  // methodun başında public-privite falan yazmasa default method olur.
        return member;
    }

    static void staticDefaultMethod(){
        System.out.println("method calişti");
    }




}
