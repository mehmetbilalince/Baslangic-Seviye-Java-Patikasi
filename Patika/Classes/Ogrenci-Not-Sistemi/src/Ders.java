public class Ders {
    Ogretmen ogretmen;
    String isim;
    String dersKodu;
    String dersKisaltilisi;
    int sinavNot;
    int sozluNot;
    double sozluNotEtkisi;

    Ders(String isim, String dersKodu, String dersKisaltilisi, double sozluNotEtkisi) {
        this.isim = isim;
        this.dersKodu = dersKodu;
        this.dersKisaltilisi = dersKisaltilisi;
        this.sinavNot = 0;
        this.sozluNot = 0;
        this.sozluNotEtkisi = sozluNotEtkisi;
    }

    void ogretmenEkle(Ogretmen ogretmen) {
        if (ogretmen.bolum.equals(this.dersKisaltilisi)) {
            this.ogretmen = ogretmen;
        } else {
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor!");
        }
    }

    void printOgretmen() {
        this.ogretmen.print();
    }

    double ortalamaHesapla() {
        double sinavNotEtkisi = 1.0 - this.sozluNotEtkisi;
        return (this.sozluNot * this.sozluNotEtkisi) + (this.sinavNot * sinavNotEtkisi);
    }
}
