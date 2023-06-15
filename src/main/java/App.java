
import salary.*;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("=========PENJUALAN DAN PERSEDIAAN PRODUK PERALATAN PERTANIAN=========");
        supplier supplier = new supplier();
        // Membuat objek supplier
        supplier.setKodeSupplier(001);
        System.out.println("kode Supplier: " + supplier.getKodeSupplier());

        supplier.setNamaSupplier("pt pertanian");
        System.out.println("Nama Supplier: " + supplier.getNamaSuplier());

        supplier.setAlamatSupplier("Jalan Jenderal Sudirman, Kavling 76-78 Jakarta");
        System.out.println("Masukkan Alamat Supplier: " + supplier.GetAlamatSupplier());

        // Membuat objek barang
        barang barang = new barang();
        barang.setKodeBarang(001);
        System.out.println("Kode Barang: " + barang.getKodeBarang());

        barang.setNamaBarang("Arang sekam padi murni");
        System.out.println("Nama Barang: " + barang.getNamaBarang());

        barang.setHarga(6500.00);
        System.out.println("Harga Barang: " + barang.getHarga());

        // Membuat objek barang masuk
        barangMasuk barangMasuk = new barangMasuk();
        barangMasuk.setBarangMasuk(1);
        System.out.println("kode Barang Masuk: " + barangMasuk.getBarangMasuk());
        barangMasuk.setJumlah(barangMasuk.getBarangMasuk());
        System.out.println("Jumlah Barang Masuk: ");

        // Tanggal masuk dapat menggunakan objek Date atau library lain yang sesuai
        // Membuat objek barang keluar
        barangKeluar barangKeluar = new barangKeluar();
        barangKeluar.setKodeBarangKeluar(1);
        System.out.println("kode Barang Keluar: " + barangKeluar.getKodeBarangKeluar());
        barangKeluar.setJumlah(1);
        System.out.println("Jumlah Barang Keluar: " + barangKeluar.getJumlah());
        System.out.println("=====================================================================");
    }
}
