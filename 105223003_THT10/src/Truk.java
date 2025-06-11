public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    double kapasitas;

    public Truk(String platNomor, String merk, int tahunProduksi, double kapasitas) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitas = kapasitas;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 1200000;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public double kapasitasMuatan() {
        return kapasitas;
    }
}