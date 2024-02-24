package Week1dan2;

public class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.84;
        int nx = (int) Math.round(x);
        /*
        Error karena kembalian Math.round() adalah Long, sehingga tidak bisa
        di assign ke variabel bertipe data integer
         */
        long dx = Math.round(x);
        /*
        Tidak error karena keduanya sama-sama bertipe long
         */
        System.out.println("Nilai nx sekarang: " + nx);
    }
}
