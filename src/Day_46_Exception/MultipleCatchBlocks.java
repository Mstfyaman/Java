package Day_46_Exception;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        int arr[]=new int[4];
        System.out.println("program başladi");
        try {
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("ArrayİndexOutOfBoundsException excption yakalandi");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Exception yakalandi");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally blogu calisti");
        }
        System.out.println("program sonlandi");

    }
}
