//----------------------------------
// Reqi Jumantara Hapid - 231524023
//----------------------------------
package Week5.case3;

public class Salesperson implements Comparable<Salesperson>{
    private String firstName, lastName;
    private int totalSales;

    //------------------
    // constructor
    //------------------
    public Salesperson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //----------------------------------------
    // Returns the sales person as a string
    //----------------------------------------
    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //------------------------------------------
    // Returns true if the sales people have
    // the same name
    //------------------------------------------
    public boolean equals (Object other){
        return (lastName.equals(((Salesperson)other).getLastName())&&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    //-----------------------------------------
    // Order is based on total sales with
    // the name (last, then first) breaking a tie
    //-----------------------------------------

    @Override
    public int compareTo(Salesperson other) {
        // Compare total sales
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales; // Descending order by total sales
        }

        // If total sales are equal, compare last names
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        // If last names are equal, compare first names
        return this.firstName.compareTo(other.firstName);
    }

    //Getter and Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
}
