package Week3.Kasus2;
//import java.awt.*;
import java.util.Scanner;
public class OrderMain {

    public static void main(String[] args) {
        Product products = new Product();
        Penjualan[] productsOrdered = new Penjualan[10];
        Scanner scanner = new Scanner(System.in); //Untuk input nilai dari keyboard
        double harga_total = 0;
        int counter = 0; //Digunakan sebagai index array


        boolean again = false;
        while (!again) {
            products.displayProduct(); // Menampilkan daftar produk
            System.out.println("\nMasukkan pilihan Anda");
            System.out.println("----------------------");
            boolean valid = false;
            int id_produk = 0;
            while (!valid) {
                System.out.println("\nNo Produk\n(Tuliskan angkanya saja)\t:");
                id_produk = scanner.nextInt();
                if ((id_produk < 1) || (id_produk > 10)) {
                    System.out.println("Masukkan angka yang valid"); /* jika angka yang dimasukkan tidak
                    sesuai dengan daftar menu*/
                } else {
                    valid = true;
                }
            }
            System.out.println("\nQuantity \n(Berapa porsi?)         \t:");
            int quantity = scanner.nextInt();

            Penjualan penjualan = new Penjualan(id_produk, quantity);
            harga_total += penjualan.hitungTotalHarga(id_produk, quantity);

            productsOrdered[counter] = penjualan; //memasukkan data ke array

            System.out.println("Ingin menambah makanan?");
            System.out.println("1. Ya\t\t 2. Tidak");
            int againConf = scanner.nextInt();
            if (againConf == 2){
                again = true;
            }else{
                counter++;
            }
        }

        System.out.println("\n--------------------");
        System.out.println("Rincian Pesanan");
        System.out.println("--------------------");

        System.out.println("No\t" + "Nama Makanan \t\t" + "Quantity");
        for (int i = 0; i <= counter; i++){
            System.out.println((i+1) + "\t" + productsOrdered[i].getNama_product()  + "\t\t\t\t" + productsOrdered[i].getQuantity());
        }
        System.out.println("\nHarga Total \tRp. " + harga_total);

    }

}
