package bootCamp.oop;

public class B10_Encapsulation {

    // encapsulation : daha hiding / private access modifier
    // use getter and setter method
    // getter : read only -- return the private data-no parameter
    // setter: write only -- does not return --has parameter
    //

    private String rank ="quarter";
    private int score= 10;

    public String getRank(){
        return rank;
    }
    public void setRank(int newScore){
        score=newScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }













}
class main{
    public static void main(String[] args) {

        B10_Encapsulation soldier=new B10_Encapsulation();
        System.out.println(soldier.getRank());

        boolean hit = true;
        int score= soldier.getScore();
        if (hit){
            soldier.setScore(score+=10);

        }
        System.out.println("soldier.getRank() = " + soldier.getRank());
        System.out.println("soldier.getScore() = " + soldier.getScore());

    }
}
