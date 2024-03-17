package Week5;

public class Commission extends Hourly {
    private double totalSales;
    private double commission;

    //---------------------------------------------------------
    //  Set up a staff member using the specified information.
    //---------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double eCommission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commission = eCommission;
    }

    //---------------------------------------------------------
    //  Add the specified number of commission to this employee's
    //  accumulated commission.
    //---------------------------------------------------------
    public void addSales(double sumSales){
        totalSales += sumSales;
    }

    //---------------------------------------------------------
    //  Compute and returns the pay for his commission employee
    //---------------------------------------------------------
    @Override
    public double pay() {
        double payment = super.pay() + (commission*totalSales);
        totalSales = 0;

        return payment;
    }

    //---------------------------------------------------------
    //  Return information about this Commission employee as a string.
    //---------------------------------------------------------
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales : $" + totalSales;

        return result;
    }
}