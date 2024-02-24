package Week3.Kasus2;
import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {

        Product[] products = new Product[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan sejumlah detil produk");
        System.out.println("=================================");
        for (int i = 0; i < 10; i++){
            System.out.println("Nama Produk\t:\t");
            String name = scanner.nextLine();
            System.out.println("Harga Produk\t:\t");
            double price = scanner.nextDouble();
            System.out.println("Stok Produk\t:\t");
            int quantity = scanner.nextInt();

            products[i] = new Product(name, price, quantity);
            System.out.println("Berhasil ditambahkan");
            scanner.nextLine();
        }

        System.out.println("Telah ditambahkan" );
        System.out.println("==================");
        System.out.println("Nama Produk\t\t Harga\t\t Quantity");
        for (int i = 0; i < 10; i++){
            System.out.println(products[i].getName_product() + "\t" +
                    "\t" + products[i].getPrice() + "\t" + products[i].getQuantity());
        }
    }
}