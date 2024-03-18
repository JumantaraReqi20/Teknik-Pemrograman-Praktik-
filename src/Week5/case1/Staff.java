//-----------------------------------------
// Reqi Jumantara Hapid - 231524023
//-----------------------------------------
package Week5.case1;

public class Staff {
    StaffMember[] staffList;

    //****************************************//
    //Sets up the list of staff members.
    //****************************************//

    public Staff() {
        staffList = new StaffMember[8];
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[2] = new Employee("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[3] = new Hourly("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[4] = new Volunteer("Sam", "123 Main Line", "555-0469");
        staffList[5] = new Volunteer("Sam", "123 Main Line", "555-0469");
        staffList[6] = new Commission("Reqi", "13 Ama Patinggi", "089-6432",
                "987-65-4321", 6.25, 0.2);
        staffList[7] = new Commission("Reciii", "14 Ama Patinggi", "089-6435",
                "987-65-4320", 9.75, 0.15);

        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);

        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(400);

        ((Commission) staffList[7]).addHours(40);
        ((Commission) staffList[7]).addSales(950);

    }

    public void payday() {
        double amount;
        for (StaffMember staff : staffList) {
            System.out.println(staff);
            amount = staff.pay();
            if (amount == 0.0) {
                System.out.println("Makasih Mas wkwk");
            } else {
                System.out.println("Paid: $" + amount);
            }
            System.out.println("-----------------------------------");
        }
    }

}
