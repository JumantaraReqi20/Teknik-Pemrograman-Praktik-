/*
Author  :   Reqi Jumantara Hapid (232524023)
Tanggal :   28 Februari 2024
 */

package Week4;

public class DVDFilm extends DVD{
    private String sutradara;
    private String pemeran;
    private  String kategori;

    public DVDFilm (){}

    public DVDFilm (String judul, String kategori, String pemeran, String sutradara, String publisher, int stok){
        super(judul, publisher, stok);
        this. sutradara = sutradara;
        this. pemeran = pemeran;
        this. kategori = kategori;
    }

    public void headerDisplay(){
        System.out.println("\n------------------------------");
        System.out.println("Daftar DVD Film Yang Tersedia");
        System.out.println("------------------------------");
    }

    public void displayInfo(){
        System.out.println("Judul      \t:\t" + getJudul());
        System.out.println("Kategori   \t:\t" + getKategori());
        System.out.println("Pemeran    \t:\t" + getSutradara());
        System.out.println("Sutradara  \t:\t" + getSutradara());
        System.out.println("Publisher  \t:\t" + getPublisher());
        System.out.println("Stok       \t:\t" + getStok());
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getPemeran() {
        return pemeran;
    }

    public void setPemeran(String pemeran) {
        this.pemeran = pemeran;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
