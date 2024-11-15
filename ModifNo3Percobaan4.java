import java. util. Scanner;
public class ModifNo3Percobaan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = scanner.nextInt();

        int[] arrNilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = scanner.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = scanner.nextInt();

        int hasil = -1;
        for (int i = 0; i < n; i++) {
            if (arrNilai[i] == key) {
                hasil = i + 1; 
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}