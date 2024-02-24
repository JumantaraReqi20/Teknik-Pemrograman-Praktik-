package Week1dan2;

/*
Nama    : Reqi Jumantara Hapid
NIM     : 231524023
Kelas   : 1A - D4
 */

class NilaiMatkul{
    private String nameMatkul;
    private String idMatkul;
    private float nilai;

    public String getNameMatkul() {
        return nameMatkul;
    }

    public void setNameMatkul(String nameMatkul) {
        this.nameMatkul = nameMatkul;
    }

    public String getIdMatkul() {
        return idMatkul;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public float getNilai() {
        return nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }


    void setNilaiMatkul (String name, String idMatkul, float nilai){
        setNameMatkul(name);
        setIdMatkul(idMatkul);
        setNilai(nilai);
    }
    void setPredikat(){
        if (nilai >= 80){
            System.out.println("Predikat : LULUS");
        }
        else {
            System.out.println("Predikat : Tak lulus");
        }
    }



}

class Mahasiswa{
    private String name;
    private String nim;
    private String kelas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    void setMahasiswa(String name, String nim, String kelas){
        setName(name);
        setNim(nim);
        setKelas(kelas);
    }
    void displayNilai(NilaiMatkul nilaiMatkul){
        System.out.println("Nama matkul : " + nilaiMatkul.getNameMatkul());
        System.out.println("Nomor ID matkul : " + nilaiMatkul.getIdMatkul());
        System.out.println("Nilai : " + nilaiMatkul.getNilai());
    }

    void displayMahasiswa(Mahasiswa mahasiswa, NilaiMatkul nilaiMatkul){
        System.out.println("Nama : " + getName());
        System.out.println("NIM : " + getNim());
        System.out.println("Kelas : " + getKelas());
        displayNilai(nilaiMatkul);
        nilaiMatkul.setPredikat();
    }
}


public class mainNilaiMatkul {
    public static void main(String[] args) {

        NilaiMatkul nilaiMatkul = new NilaiMatkul();
        nilaiMatkul.setNilaiMatkul("Tekpro", "A05", 95);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setMahasiswa("Reqi", "231524023", "1A");
        mahasiswa.displayMahasiswa(mahasiswa, nilaiMatkul);

    }
}
