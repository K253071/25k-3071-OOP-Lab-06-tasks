class Account {
    double balance = 10000;
}

class SavingsAccount extends Account {
}

class PremiumSavings extends SavingsAccount {

    void calculateInterest() {
        int interest = (int)(balance * 0.07);
        System.out.println("Interest: " + interest);
    }
}

public class Main {
    public static void main(String[] args) {

        PremiumSavings p = new PremiumSavings();
        p.calculateInterest();
    }
}