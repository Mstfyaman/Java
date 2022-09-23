package Assignments.Inheritance_Odev;

public class SoftwareDevelopmentTeam extends Person{

    private String team;
    private String domain;
    private int numberOfPerson;
    int dailyOverTİme;



    public SoftwareDevelopmentTeam() {

    }




    public void kullanılanİde() {
        System.out.println("Kullanılan ide C++'dır");   // overriding (tester)
    }

    public SoftwareDevelopmentTeam(int dailyOverTİme) {
        this.dailyOverTİme = dailyOverTİme;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public void dailyTime(){
        System.out.println("günlük dailytime gerçekleştirildi");
    }

    public void sprintTime(){
        System.out.println("sprinttime çalışıyor");
    }

    public static int hangisi(int a,int b){
        return a+b;
    }



}
