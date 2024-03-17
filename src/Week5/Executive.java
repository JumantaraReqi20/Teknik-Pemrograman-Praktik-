package Week5;

public class Executive extends Employee{
    private double bonus;

    //---------------------------------------------------------
    //  Set up a staff member using the specified information.
    //---------------------------------------------------------

    public Executive(String eName, String eAddress, String ePhone, String socsecNumber, double rate){
        super(eName, eAddress, ePhone, socsecNumber, rate);
        bonus = 0; //bonus has yet to be awarded
    }

    //---------------------------------------------------------
    //  Awad the specified bonus to this executive.
    //---------------------------------------------------------
    public void awardBonus(double execBonus){
        bonus = execBonus;
    }

    //---------------------------------------------------------
    //  Computes and returns the pay for an executive, which is
    //  the regular employee payment plus a one0time bonus.
    //---------------------------------------------------------
    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;

        return payment;
    }
}
