package Week5;

public class Hourly extends Employee{
    private int hoursWorked;

    //---------------------------------------------------------
    //  Set up a staff member using the specified information.
    //---------------------------------------------------------
    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    //---------------------------------------------------------
    //  Add the specified number of hours to this employee's
    //  accumulated hours.
    //---------------------------------------------------------
    public void addHours(int moreHours){
        hoursWorked += moreHours;
    }

    //---------------------------------------------------------
    //  Compute and returns the pay fot his hourly employee
    //---------------------------------------------------------

    @Override
    public double pay() {
        double payment = payRate*hoursWorked;
        hoursWorked = 0;

        return payment;
    }

    //---------------------------------------------------------
    //  Return information about this hourly employee as a string.
    //---------------------------------------------------------

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours : " + hoursWorked;

        return result;
    }
}
