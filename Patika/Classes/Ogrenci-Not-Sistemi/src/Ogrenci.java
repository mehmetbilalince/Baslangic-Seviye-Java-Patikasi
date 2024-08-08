public class Ogrenci {
    Ders d1;
    Ders d2;
    Ders d3;
    String isim;
    String ogrenciNo;
    String sinif;
    double ortalama;
    boolean gecmeDurumu;

    Ogrenci(String isim, String ogrenciNo, String sinif, Ders d1, Ders d2, Ders d3) {
        this.isim = isim;
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ortalama = 0.0;
        this.gecmeDurumu = false;
    }

    void topluSinavNotuEkle(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.d1.sinavNot = not1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.d2.sinavNot = not2;
        }
        if (not3 >= 0 && not3 <= 100) {
            this.d3.sinavNot = not3;
        }
    }

    void topluSozluNotuEkle(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.d1.sozluNot = not1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.d2.sozluNot = not2;
        }
        if (not3 >= 0 && not3 <= 100) {
            this.d3.sozluNot = not3;
        }
    }

    void printNot() {
        System.out.println(this.d1.isim + " Notu: " + this.d1.sinavNot);
        System.out.println(this.d1.isim + " Sözlü Notu: " + this.d1.sozluNot);
        System.out.println(this.d2.isim + " Notu: " + this.d2.sinavNot);
        System.out.println(this.d2.isim + " Sözlü Notu: " + this.d2.sozluNot);
        System.out.println(this.d3.isim + " Notu: " + this.d3.sinavNot);
        System.out.println(this.d3.isim + " Sözlü Notu: " + this.d3.sozluNot);
        System.out.println("Ortalamanız: " + this.ortalama);
    }

    void sinifGecmeDurumu() {
        System.out.println("==================");
        double d1Ortalama = this.d1.ortalamaHesapla();
        double d2Ortalama = this.d2.ortalamaHesapla();
        double d3Ortalama = this.d3.ortalamaHesapla();
        this.ortalama = (d1Ortalama + d2Ortalama + d3Ortalama) / 3.0;
        if (this.ortalama > 55) {
            System.out.println("Sınıfı Geçtiniz!");
            this.gecmeDurumu = true;
        } else {
            System.out.println("Sınıfta Kaldınız!");
            this.gecmeDurumu = false;
        }
        printNot();
    }
}
