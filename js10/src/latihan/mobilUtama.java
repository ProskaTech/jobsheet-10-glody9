//Created by 21343077_Glody Syah Rabbynawa
package latihan;

public class mobilUtama {
    public static void main(String[] args) {
        mobil Honda = new mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merek \t : " + Honda.merk);
        System.out.println("Warna \t : " + Honda.warna);
        System.out.println("Tahun \t : " + Honda.tahunproduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
