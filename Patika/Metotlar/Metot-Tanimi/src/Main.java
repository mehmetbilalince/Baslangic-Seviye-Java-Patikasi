public class Main {
    static int UsAlma(int sayi,int ussu){
        int result=1;
        for (int i=1;i<=ussu;i++){
            result*=sayi;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(UsAlma(2,3));
        System.out.println(UsAlma(5,2));
    }
}