package Week3;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant(15);

        menu.tambahMenuMakanan("Bala-Bala", 1000, 20);
        //Restaurant.nextId();
        /*
        Tidak dibutuhkan karena sudah dimasukkan ke method
        tambahMenuMakanan()
         */
        menu.tambahMenuMakanan("Gehu", 1000, 20);
        menu.tambahMenuMakanan("Ayam", 40000, 0);
        menu.tambahMenuMakanan("Molen", 2000, 10);

        menu.tampilMenuMakanan();

        menu.order("Molen");
        menu.order("Gehu");

        menu.tampilMenuMakanan();
    }
}
