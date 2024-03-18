package Week5.case1;

public class Volunteer  extends StaffMember{

    //---------------------------------------------------------
    //  Set up a staff member using the specified information.
    //---------------------------------------------------------
    public Volunteer(String eName, String eAddress, String ePhone){
        super(eName, eAddress, ePhone);
    }

    //---------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //---------------------------------------------------------
    @Override
    public double pay() {
        return 0;
    }
}
