import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        // Kullanıcıdan veri almak için Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);


        //Şimdi ise öncdeden tanımladığımız Scanner sınıfı yardımıyla kullanıcıdan verileri alıyoruz


        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();


        System.out.print("Fizik Notunuzu:");
        fizik = inp.nextInt();


        System.out.print("Kimya Notunuzu:");
        kimya = inp.nextInt();


        System.out.print("Türkçe Notunuzu:");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu:");
        muzik = inp.nextInt();


        //Bu aşamada kullanıcıdan aldığımız not toplamlarını ders sayısına bölüp ortalama alıyoruz.
        int toplam = mat+fizik +kimya +turkce +tarih +muzik;
        double ortalama = toplam /6;


        //Bu aşamada ise Not ortalamasını geçme koşuluna göre değerlendiriyoruz.
        double a=ortalama, b=60;
        boolean x = a>=b;
        boolean pozitif = !x;
        boolean negatif = x;

        //Son olarak kullanıcıya String türünde bir mesajla sonucu gönderiyoruz.
        String durum = pozitif ? "Sınıfta Kaldınız" : "Sınıfı Geçtiniz";
        System.out.println(durum);
    }
}