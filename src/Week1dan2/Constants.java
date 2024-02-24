package Week1dan2;

public class Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        /*
        M_PER_INCH = 56;
        Error karena final field tidak dapat diubah
         */
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size ini centimeters: " + paperWidth*CM_PER_INCH + " by " + paperHeight*CM_PER_INCH);
    }
    /*void CovertCmtoInch(int panjang){
        System.out.println(panjang*CM_PER_INCH);
        Error karena CM_PER_INCH tidak dikenali (di luar scope)
         */
    }

