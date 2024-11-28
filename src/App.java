import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Quis quis = new Quis(sc);
        quis.setTeks("Siapakah yang mendesain bahasa pemrograman Java?");
        quis.setJawaban("James Gosling");
        quis.display();

        QuisPilihan pilihan = new QuisPilihan("Apa nama asli dari bahasa pemrograman Java?", sc);
        pilihan.tambahPilihan("*7", false);
        pilihan.tambahPilihan("Duke", false);
        pilihan.tambahPilihan("Oak", true);
        pilihan.tambahPilihan("Gosling", false);
        pilihan.display();

        sc.close();
    }
}
