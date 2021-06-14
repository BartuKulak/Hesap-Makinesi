import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char islem;
        int birinci,ikinci;
        double sonuc=0;
        System.out.print("İlk Sayıyı Girin: ");
        birinci=input.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        ikinci=input.nextInt();
        System.out.println("Çarpma (*)\n Bölme(/)\n Toplama(+)\n Çıkarma(-)");
        System.out.println("Seçiniz");
        islem=input.next().charAt(0);
        switch (islem) {
            case '*':
                sonuc=birinci*ikinci;
                break;
            case '/':
                sonuc=birinci/ikinci;
                break;

            case '+':
                sonuc=birinci+ikinci;
                break;
            case '-':
                 sonuc=birinci-ikinci;
                break;
            default:
                System.out.println("Geçersiz İşlem!");
        }
        System.out.println("Sonuç: "+sonuc);
    }
}
