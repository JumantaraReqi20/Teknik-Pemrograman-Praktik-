/*
Author  :   Reqi Jumantara Hapid (232524023)
Tanggal :   28 Februari 2024
 */

package Week4;

public class DVDMusik extends DVD{

    private String penyanyi;
    private String produser;
    private String topHits;
    private String kategori;

    public DVDMusik(){}

    public DVDMusik(String judul, String publisher, int stok, String penyanyi, String produser, String topHits, String kategori) {
        super(judul, publisher, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
        this.kategori = kategori;
    }

    public void headerDisplay(){
        System.out.println("\n------------------------------");
        System.out.println("Daftar DVD Musik Yang Tersedia");
        System.out.println("------------------------------");
    }
    public void displayInfo(){
        System.out.println("Judul      \t:\t" + getJudul());
        System.out.println("Kategori   \t:\t" + getKategori());
        System.out.println("Penyanyi   \t:\t" + getPenyanyi());
        System.out.println("Publisher  \t:\t" + getPublisher());
        System.out.println("Produser   \t:\t" + getProduser());
        System.out.println("Top Hits   \t:\t" + getTopHits());
        System.out.println("Stok       \t:\t" + getStok());
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String getTopHits() {
        return topHits;
    }

    public void setTopHits(String topHits) {
        this.topHits = topHits;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
