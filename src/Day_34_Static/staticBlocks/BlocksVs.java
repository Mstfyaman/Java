package Day_34_Static.staticBlocks;

public class BlocksVs {

    static int i=10;

    public BlocksVs(int i){
        this.i=i;
        System.out.println(" constuctor calisti");
    }
    static {
        System.out.println("static blok calisti");
        i=i*10;
        System.out.println(i);
    }

    {
        System.out.println("instance block calisti");
    }

}
