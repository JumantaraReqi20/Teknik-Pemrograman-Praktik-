package Week3.Kasus2;

public class Product {
    private String name_product;
    private double price;
    private int quantity;

    public Product(){}
    public Product(String name, double price, int quantity){
        this.name_product = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayProduct(){
        System.out.println("Daftar Menu Makanan");
        System.out.println("====================");
        System.out.println("1. Batagor          = Rp. 5000 ");
        System.out.println("2. Roti Bakar       = Rp. 12000 ");
        System.out.println("3. Indomie + telur  = Rp. 10000 ");
        System.out.println("4. Kwetiau          = Rp. 12000 ");
        System.out.println("5. Nasi Goreng      = Rp. 12000 ");
        System.out.println("6. Air Mineral      = Rp. 3000 ");
        System.out.println("7. Teh Manis        = Rp. 4000 ");
        System.out.println("8. Jus Alpukat      = Rp. 8000 ");
        System.out.println("9. Teh Botol        = Rp. 5000 ");
        System.out.println("10. Kopi            = Rp. 3000 ");
    }

}
