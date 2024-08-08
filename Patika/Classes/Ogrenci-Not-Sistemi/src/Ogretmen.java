public class Ogretmen {
    String isim;
    String telefonNo;
    String bolum;

    Ogretmen(String isim, String telefonNo, String bolum){
        this.isim = isim;
        this.telefonNo = telefonNo;
        this.bolum = bolum;
    }

    void print() {
        System.out.println("Adı : " + isim);
        System.out.println("Telefonu : " + telefonNo);
        System.out.println("Bölümü : " + bolum);
    }
}
