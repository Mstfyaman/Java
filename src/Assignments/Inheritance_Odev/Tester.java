package Assignments.Inheritance_Odev;

public class Tester extends SoftwareDevelopmentTeam{

    boolean isManuel;
    protected int dailyOverTİme;
    boolean identifyProblems;



    public Tester(int dailyOverTİme, boolean isManuel ) {
        super(dailyOverTİme);
        this.isManuel = isManuel;
        this.dailyOverTİme = dailyOverTİme;
    }

    public Tester(int dailyOverTİme, boolean isManuel, boolean identifyProblems) {
        super(500);
        this.isManuel = isManuel;
        this.dailyOverTİme = dailyOverTİme;
        this.identifyProblems = identifyProblems;
    }

    public void kullanılanİde(){
        System.out.println("Kullanilan ide JAVA' dir");
    }


}
