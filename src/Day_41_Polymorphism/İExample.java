package Day_41_Polymorphism;

public interface İExample {

    default  void  başlat(){
        mesaj();
    }
    private void mesaj(){
        System.out.println("merhaba dunya");
    }
}
class Main implements İExample{
    public static void main(String[] args){
        Main main=new Main();
        main.başlat();
    }
}
class Main2 extends Main{

}