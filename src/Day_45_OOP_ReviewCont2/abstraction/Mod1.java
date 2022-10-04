package Day_45_OOP_ReviewCont2.abstraction;

public class Mod1 extends D3Print{

    public Mod1(String model, String fileFormat) {
        super(model, fileFormat);
        extrude();              //sadece mainden çağırmamıza gerek yok. extend olduğumuz için böylede çağırabiliyoruz.
       // polish();
        System.out.println(fileFormatCheck());
        if (fileFormat.equals("OBJ")){
            polish();
        }else {
            fileFormatCheck();
        }
    }

    @Override
    public void extrude() {
        System.out.println("printing a " + model + " with " + fileFormat + " fileformat");
    }

    @Override
    public void polish() {
        System.out.println( model + " is polishing ");
    }
}
