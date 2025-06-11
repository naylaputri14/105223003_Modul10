public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new MobilPribadi("B5052WLG", "Hyundai", 2024);
        Kendaraan bus = new Bus("D7045FTS", "Mercedes", 2018);
        Truk truk = new Truk("F5750BBE", "Hino", 2015, 5000);

        Kendaraan[] daftarKendaraan = {mobil, bus, truk};

        for (Kendaraan k : daftarKendaraan) {
            System.out.println("\nInformasi Kendaraan");
            k.tampilkanInfo();
            System.out.println("Biaya Sewa 2 hari: Rp " + k.hitungBiayaSewa(2));
            System.out.println("Perlu Supir: " + (k.perluSupir() ? "Ya" : "Tidak"));
            if (k instanceof Muatan) {
                System.out.println("Kapasitas Muatan: " + ((Muatan) k).kapasitasMuatan() + " kg");
            }
        }
    }
}