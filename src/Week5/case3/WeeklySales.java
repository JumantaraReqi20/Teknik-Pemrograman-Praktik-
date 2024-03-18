/*************************************
 * Reqi Jumantara Hapid - 231524023
 *************************************/
package Week5.case3;

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[10];

        salesStaff[0] = new Salesperson("Chan", "deris", 9800);
        salesStaff[1] = new Salesperson("Reqii", "uhuy", 4500);
        salesStaff[2] = new Salesperson("Kasep", "diki", 9800);
        salesStaff[3] = new Salesperson("Gerung", "eko", 9800);
        salesStaff[4] = new Salesperson("Yuhu", "ajeng", 6700);
        salesStaff[5] = new Salesperson("Reci", "uhuy", 9800);
        salesStaff[6] = new Salesperson("Aceng", "siti", 5600);
        salesStaff[7] = new Salesperson("Sugih", "Jumantara", 1200);
        salesStaff[8] = new Salesperson("Rendi", "kiww", 4100);
        salesStaff[9] = new Salesperson("jek", "hasbi", 7900);

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of sales for the week: \n");

        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
