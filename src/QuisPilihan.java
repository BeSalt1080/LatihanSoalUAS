import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuisPilihan extends Quis {
    private List<Pilihan> pilihans = new ArrayList<Pilihan>();

    public QuisPilihan(String pertanyaan, Scanner scanner) {
        super(scanner);
        teks = pertanyaan;
    }

    public void tambahPilihan(String str, boolean bool) {
        pilihans.add(new Pilihan(str, bool));
    }

    public void display() {
        System.out.println(teks);
        int i = 1;
        for (Pilihan pilihan : pilihans) {
            System.out.printf("%d. %s\n", i++, pilihan.getTeks());
        }
        System.out.print("Jawaban Anda: ");
        int jawaban = scanner.nextInt();
        if (pilihans.get(jawaban - 1).getBenar()) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
    }
}
