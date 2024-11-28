import java.util.Scanner;

public class Quis {
    protected String teks;
    protected String jawaban;
    protected Scanner scanner;

    public Quis(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setTeks(String teks) {
        this.teks = teks;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public void display() {
        System.out.println(teks);
        System.out.print("Jawaban Anda: ");
        String jawaban = scanner.nextLine();
        if (jawaban.equals(this.jawaban)) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
    }
}
