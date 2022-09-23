package Assignments.Inheritance_Odev;

public class ProjectOwner extends SoftwareDevelopmentTeam{

    protected boolean isTechnical;
    private int dailyOverTİme;

    public int getDailyOverTİme() {
        return dailyOverTİme;
    }

    public void setDailyOverTİme(int dailyOverTİme) {
        this.dailyOverTİme = dailyOverTİme;
    }

    public ProjectOwner(boolean isTechnical, int dailyOverTİme) {
        super();
        this.isTechnical = isTechnical;
        this.dailyOverTİme = dailyOverTİme;
    }


    public boolean getTechnical() {
        return isTechnical;
    }

    public void setTechnical(boolean technical) {
        isTechnical = technical;
    }




}
