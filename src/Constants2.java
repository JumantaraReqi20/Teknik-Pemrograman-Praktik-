public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperheight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth*CM_PER_INCH +
                " by " + paperheight*CM_PER_INCH);
    }
    void ConvertCmtoInch(int panjang){

        /*
        CM_PER_INCH = 567;
        error karena nilai final field tidak dapat diubah
         */
        System.out.println(panjang*CM_PER_INCH);
        /*
        Tidak error karena CM_PER_INCH di atur sebagai public static variable sehingga
        bisa dikenali oleh method (scope) manapun
         */
    }
}
