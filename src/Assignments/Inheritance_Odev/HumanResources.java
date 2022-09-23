package Assignments.Inheritance_Odev;

public class HumanResources extends Person{

    String areaResponsibility;
    int dailyOverTİme;
   private boolean customerSatisfaction;

    public HumanResources() {
        System.out.println("bos constructor");
    }

    public boolean getCustomerSatisfaction() {
        return customerSatisfaction;
    }

    public HumanResources(int dailyOverTİme) {
        this();
        this.dailyOverTİme = dailyOverTİme;
    }

    public HumanResources(String areaResponsibility) {
        this(10);
        this.areaResponsibility = areaResponsibility;

    }

    public void setCustomerSatisfaction(boolean customerSatisfaction) {
        this.customerSatisfaction = customerSatisfaction;
    }

    public HumanResources(String areaResponsibility, boolean customerSatisfaction) {
        this.areaResponsibility = areaResponsibility;
        this.customerSatisfaction = customerSatisfaction;
    }
}
