package Day_46_Exception;

public class Faktorial {
    public static void main(String[] args) {

    }

    public static int faktoriyel(int n){
        int result=1;
        if (n<0) {
            return -1;
        }else {
            for ( int i=1; i<=n; i++){
                result*=i;
            }
        }
        return result;
    }


}
