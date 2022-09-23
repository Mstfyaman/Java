package Day_31_Constructor;

public class Okul {

    public String renk;
    public int sinifAdedi;
    public int kapasite;

    //kapasite>500 aşılmıştır ikazı versin.

    public Okul(){

    }

    public Okul(String renk){

        this.renk=renk;
    }

    public Okul(String renk,int sinifAdedi){

        this.sinifAdedi=sinifAdedi;
        this.renk=renk;
    }

    public Okul(int kapasite){

        this.kapasite=kapasite;
    }

    public void kontrolKapasite(){
        if (this.kapasite>500){
            System.out.println("kapasite asilmistir");
        }else {
            System.out.println("kapasite asilmasina "+ (500-this.kapasite) +" kalmistir");

        }
    }




}

