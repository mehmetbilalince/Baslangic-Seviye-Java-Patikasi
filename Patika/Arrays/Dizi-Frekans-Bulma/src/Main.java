public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] tekrarSayilari = new int[dizi.length];
        int[] elemanlar = new int[dizi.length];
        int farkliElemanSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            boolean bulundu = false;
            for (int j = 0; j < farkliElemanSayisi; j++) {
                if (elemanlar[j] == eleman) {
                    tekrarSayilari[j]++;
                    bulundu = true;
                    break;
                }
            }
            if (!bulundu) {
                elemanlar[farkliElemanSayisi] = eleman;
                tekrarSayilari[farkliElemanSayisi] = 1;
                farkliElemanSayisi++;
            }
        }

        for (int i = 0; i < farkliElemanSayisi; i++) {
            System.out.println(elemanlar[i] + " sayısı " + tekrarSayilari[i] + " kere tekrar edildi.");
        }
    }
}
