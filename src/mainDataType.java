import java.util.Scanner;
public class mainDataType {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // Membaca jumlah test case

            for (int i = 0; i < t; i++) {
                long n = scanner.nextLong(); // Membaca nilai n
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    /*
                    Tipe data byte memiliki rentang -128 <= n <=127
                     */
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    /*
                    Tipe data short memiliki rentang -32768 <= n <= 32767
                     */
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    /*
                    Tipe data integer memiliki rentang 0x80000000 <= n <= 0x7fffffff
                     */
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    /*
                    Tipe data long memiliki rentang 0x8000000000000000L <= n <= 0x7fffffff
                     */
                    System.out.println("* long");
                }
               else {
                    System.out.println(n +" can't be fitted anywhere.");
                }
            }
            scanner.close();
        }
}
