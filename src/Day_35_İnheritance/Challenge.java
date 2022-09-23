package Day_35_İnheritance;

public class Challenge extends GameActivity{

    private int shootOption;
    private int pointOfShoot;
    private int shootSucces;

    public Challenge(int shootOption, int shootSucces) {
        int point;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;

        pointOfShoot=1000/shootOption;

        point=pointOfShoot*shootSucces;

    //    Score(point); // score değişkeni parent classta private olarak
                         // tanımlandığı için doğrudan erişilemez

        setScore(point); // setter methodu o yüzden kullanıldı

    }
}
