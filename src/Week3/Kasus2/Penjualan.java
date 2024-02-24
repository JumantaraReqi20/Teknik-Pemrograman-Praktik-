package Week3.Kasus2;

public class Penjualan {
    private int id_product;
    private int quantity;
    private String nama_product;
    private double harga_total;
    private final double harga_1batagor = 5000;
    private final double harga_2roti_bakar = 12000;
    private final double harga_3indomie = 10000;
    private final double harga_4kwetiau = 12000;
    private final double harga_5nasi_goreng = 12000;
    private final double harga_6air_mineral = 3000;
    private final double harga_7teh_manis = 4000;
    private final double harga_8jus_alpukat = 8000;
    private final double harga_9teh_botol = 5000;
    private final double harga_10kopi = 3000;

    public Penjualan(){}
    public Penjualan(int id, int quan){
        this.id_product = id;
        this.quantity = quan;
        switch (id){
            case 1:
                this.nama_product = "Batagor";
                break;
            case 2 :
                this.nama_product = "Roti Bakar";
                break;
            case 3 :
                this.nama_product = "Indomie + Telur";
                break;
            case 4 :
                this.nama_product = "Kwetiau";
                break;
            case 5 :
                this.nama_product = "Nasi Goreng";
                break;
            case 6 :
               this. nama_product = "Air Mineral";
                break;
            case 7 :
                this.nama_product = "Teh Manis";
                break;
            case 8 :
                this.nama_product = "Jus Alpukat";
                break;
            case 9 :
                this.nama_product = "Teh Botol";
                break;
            case 10 :
                this.nama_product = "Kopi";
                break;
        }
    }

    public double hitungTotalHarga(int id, int quantity){
        switch (id) {
            case 1: harga_total =  (double) getHarga_1batagor() * quantity;
                break;
            case 2 : harga_total = (double) getHarga_2roti_bakar() * quantity;
                break;
            case 3 : harga_total = (double) getHarga_3indomie() * quantity;
                break;
            case 4 : harga_total =  (double) getHarga_4kwetiau() * quantity;
                break;
            case 5 : harga_total =  (double) getHarga_5nasi_goreng() * quantity;
                break;
            case 6 : harga_total =  (double) getHarga_6air_mineral() * quantity;
                break;
            case 7 : harga_total =  (double) getHarga_7teh_manis() * quantity;
                break;
            case 8 : harga_total =  (double) getHarga_8jus_alpukat() * quantity;
                break;
            case 9 : harga_total =  (double) getHarga_9teh_botol() * quantity;
                break;
            case 10 : harga_total =  (double) getHarga_10kopi() * quantity;
                break;
        }
        return harga_total;
    }

    //Getter


    public String getNama_product() {
        return nama_product;
    }

    public double getHarga_total() {
        return harga_total;
    }

    public int getId_product() {
        return id_product;
    }

    public int getQuantity() {
        return quantity;
    }


    public double getHarga_1batagor() {
        return harga_1batagor;
    }

    public double getHarga_2roti_bakar() {
        return harga_2roti_bakar;
    }

    public double getHarga_3indomie() {
        return harga_3indomie;
    }

    public double getHarga_4kwetiau() {
        return harga_4kwetiau;
    }

    public double getHarga_5nasi_goreng() {
        return harga_5nasi_goreng;
    }

    public double getHarga_6air_mineral() {
        return harga_6air_mineral;
    }

    public double getHarga_7teh_manis() {
        return harga_7teh_manis;
    }

    public double getHarga_8jus_alpukat() {
        return harga_8jus_alpukat;
    }

    public double getHarga_9teh_botol() {
        return harga_9teh_botol;
    }

    public double getHarga_10kopi() {
        return harga_10kopi;
    }

    //setter

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setHarga_total(double harga_total) {
        this.harga_total = harga_total;
    }
}
