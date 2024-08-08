public class Main {
    public static void main(String[] args) {
        Car audi=new Car("Audi A4",10,"Mavi");
        audi.increaseSpeed(20);//Mevcut hızı 20 arttırdık.
        audi.printInfo();

        Car bmw=new Car("Bmw M3",50,"Kırmızı");
        bmw.decreaseSpeed(20);//Mevcut hızı 20 azalttık.
        bmw.printInfo();

        Car mercedes=new Car("Mercedes Maybach",40,"Siyah");
        mercedes.increaseSpeed(40);//Mevcut hızı 40 arttırdık.
        mercedes.printInfo();
    }
}
