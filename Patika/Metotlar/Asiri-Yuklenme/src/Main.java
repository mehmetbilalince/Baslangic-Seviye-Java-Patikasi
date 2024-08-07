
public class Main {
    static void print(int a){
        System.out.println("Parametreler : "+a);
    }
    static void print(){
        System.out.println("Parametresiz Metot");
    }
    static int print(int a,int b){
        return a+b;
    }
    static int print(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        print();
        print(12);
        System.out.println(print(3,6));
        System.out.println(print(7,4,5));
    }
}