package Assignments.Inheritance_Odev;

public class Developer extends SoftwareDevelopmentTeam{

    String softwareLanguage;
    int dailyOverTİme;
   private   boolean isWorksWithTeam;

    public Developer() {
    }

    public boolean getWorksWithTeam() {
        return isWorksWithTeam;
    }

    public void setWorksWithTeam(boolean worksWithTeam) {
        isWorksWithTeam = worksWithTeam;
    }

    public Developer(String softwareLanguage, int dailyOverTİme) {
        this.softwareLanguage = softwareLanguage;
        this.dailyOverTİme = dailyOverTİme;
    }

    public Developer(String softwareLanguage, int dailyOverTİme, boolean isWorksWithTeam) {
        this.softwareLanguage = softwareLanguage;
        this.dailyOverTİme = dailyOverTİme;
        this.isWorksWithTeam = isWorksWithTeam;
    }

   public static void yoruldum(){
       System.out.println(hangisi(80, 80));
   }


}
