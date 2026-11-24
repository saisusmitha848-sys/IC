class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class MainOverridding {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate());
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate());
    }
}