package Day_32_Constructors_Cont;

import java.util.Random;

public class KraftBankCustomer {

    public int customerld;  // yaman
    public String customerFullName; // mustafa yaman
    public boolean isSms;
    public double customerAccount;
    public String customerToken;  //'k4vunYer1z'

    public KraftBankCustomer() {
    }

    public KraftBankCustomer(String customerId, String customerFullName, boolean isSms) {
        this.customerld = customerld;
        this.customerFullName = customerFullName;
        this.isSms = isSms;

        Random random=new Random();
        this.customerToken=customerld+customerFullName.substring(0,2)+random.nextInt(8999)+1000;
    }

    public double addMoney(double para){

        return customerAccount+=(para*18.22);
    }

}
