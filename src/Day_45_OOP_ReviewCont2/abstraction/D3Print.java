package Day_45_OOP_ReviewCont2.abstraction;

public abstract class D3Print {

    String model;
    String fileFormat;

    public abstract void extrude();
    public abstract void polish();

    public D3Print(String mdel, String filFormat) {
        this.model = model;
        this.fileFormat = filFormat;



    }


    public String fileFormatCheck(){
        if (fileFormat.equals("OBJ")){
            return "fileFormat is suitable for pulishing";
        }else {
            return "fileFormat is not suitable for polishing";
        }
    }


}
