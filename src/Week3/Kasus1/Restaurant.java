package Week3.Kasus1;

public class Restaurant {
    private Makanan[] listMakanan;
    private static byte id = 0;
    public Restaurant(){
    }

    /*
    Inisialisasi data
     */
    public Restaurant (int maxMenu){
        this.listMakanan = new Makanan[maxMenu];
    }

    public void tambahMenuMakanan (String nama, double harga, int stok){
        Makanan newMenu = new Makanan(nama, harga, stok);
        listMakanan[id] = newMenu;
        id++;
    }

    public void tampilMenuMakanan(){
        System.out.println("Stok yang kini tersedia");
        System.out.println("=========================");
        for (int i = 0; i< id; i++){
            if(!isOutOfStock(i)){
                System.out.println(listMakanan[i].getNama() + "[" + listMakanan[i].getStok() + "]" + "\tRp. " + listMakanan[i].getHarga());
            }
        }
    }

    public boolean isOutOfStock (int id) {
        if (listMakanan[id].getStok() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void decStock(String nama){
        for (int i = 0; i < id; i++){
            if (nama.equals(listMakanan[i].getNama())){
                listMakanan[i].setStok(listMakanan[i].getStok() - 1);
            }
        }
    }

    public void order(String nama){
        decStock(nama);
        System.out.println("\n-------------------------------");
        System.out.println("Berhasil memesan " + nama);
        System.out.println("-------------------------------\n");
    }
}
