public class Main {
    public static void main(String[] args) {
        Ogretmen ogr1 = new Ogretmen("Mehmet Bilal", "5457659190", "NTP");
        Ogretmen ogr2 = new Ogretmen("Ardahan İnce", "54182447", "TMU");
        Ogretmen ogr3 = new Ogretmen("Dusan Tadic", "1907", "MAT");

        Ders ntp = new Ders("Nesne Tabanlı Programlama", "101", "NTP", 0.20);
        ntp.ogretmenEkle(ogr1);

        Ders mat = new Ders("Matematik", "102", "MAT", 0.30);
        mat.ogretmenEkle(ogr3);

        Ders tmu = new Ders("Temel Mesleki Uygulamalar", "103", "TMU", 0.10);
        tmu.ogretmenEkle(ogr2);

        Ogrenci ogrenci1 = new Ogrenci("Jose Mourinho", "11", "10/B", ntp, mat, tmu);
        ogrenci1.topluSinavNotuEkle(100, 80, 70);
        ogrenci1.topluSozluNotuEkle(90, 85, 75);
        ogrenci1.sinifGecmeDurumu();

        Ogrenci ogrenci2 = new Ogrenci("Edin Dzeko", "9", "12/A", ntp, mat, tmu);
        ogrenci2.topluSinavNotuEkle(50, 50, 40);
        ogrenci2.topluSozluNotuEkle(60, 55, 45);
        ogrenci2.sinifGecmeDurumu();

        Ogrenci ogrenci3 = new Ogrenci("Sebastian Szymanski", "35", "11/C", ntp, mat, tmu);
        ogrenci3.topluSinavNotuEkle(100, 80, 70);
        ogrenci3.topluSozluNotuEkle(95, 85, 75);
        ogrenci3.sinifGecmeDurumu();
    }
}
