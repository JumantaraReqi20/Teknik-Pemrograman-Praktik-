/*
Author  :   Reqi Jumantara Hapid (232524023)
Tanggal :   28 Februari 2024
 */

package Week4;
import java.util.Scanner;
public class DvdMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DVDMusik dvdMusik2 = new DVDMusik();
        DVDFilm dvdFilm2 = new DVDFilm();

        System.out.println("(1) DVD Film\t\t\t\t (2) DVD Musik");
        System.out.print("Jenis DVD yang akan update data : ");
        int answer = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Jumlah data yang akan ditambahkan (maksimal 25) : ");
        int j = scanner.nextInt();
        scanner.nextLine();

        if(answer == 2) {

            DVDMusik[] dvdArray = new DVDMusik[j]; // Membuat array untuk menyimpan objek dari DVDMusik
            for (int i = 0; i < j; i++) {
                System.out.println("\n===========================");
                System.out.println("Menambahkan Data DVD Musik");
                System.out.println("===========================");

                System.out.print("Judul      \t:\t");
                String judul = scanner.nextLine();

                System.out.print("Kategori   \t:\t");
                String kategori = scanner.nextLine();

                System.out.print("Penyanyi   \t:\t");
                String penyanyi = scanner.nextLine();

                System.out.print("Publisher  \t:\t");
                String publisher = scanner.nextLine();

                System.out.print("Produser   \t:\t");
                String produser = scanner.nextLine();

                System.out.print("Top Hits   \t:\t");
                String topHits = scanner.nextLine();

                System.out.print("Stok       \t:\t");
                int stok = scanner.nextInt();
                scanner.nextLine();

                DVDMusik dvdMusik = new DVDMusik(judul, publisher, stok, penyanyi, produser, topHits, kategori);
                dvdArray[i] = dvdMusik; // Menambahkan objek dari DVDMusik ke array
            }

            dvdMusik2.headerDisplay();
            for (int i = 0; i < j; i++) {
                System.out.println("\nData DVD musik ke-" + (i + 1) + ":");
                dvdArray[i].displayInfo();
            }
        } else {
            DVDFilm[] dvdFilmsArray = new DVDFilm[j];
            for (int i = 0; i < j; i++) {
                System.out.println("\n===========================");
                System.out.println("Menambahkan Data DVD FILM");
                System.out.println("===========================");

                System.out.print("Judul      \t:\t");
                String judul = scanner.nextLine();

                System.out.print("Kategori   \t:\t");
                String kategori = scanner.nextLine();

                System.out.print("Pemeran    \t:\t");
                String pemeran = scanner.nextLine();

                System.out.print("Sutradara  \t:\t");
                String sutradara = scanner.nextLine();

                System.out.print("Publisher  \t:\t");
                String publisher = scanner.nextLine();

                System.out.print("Stok       \t:\t");
                int stok = scanner.nextInt();
                scanner.nextLine();

                DVDFilm dvdFilm = new DVDFilm(judul, kategori, pemeran, sutradara, publisher, stok);
                dvdFilmsArray[i] = dvdFilm; // Menambahkan objek dari DVDFilm ke array
            }

            dvdFilm2.headerDisplay();
            for (int i = 0; i < j; i++) {
                System.out.println("\nData DVD Film ke-" + (i + 1) + ":");
                dvdFilmsArray[i].displayInfo();
            }
        }
    }
}



