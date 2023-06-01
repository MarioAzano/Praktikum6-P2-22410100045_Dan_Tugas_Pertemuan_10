package Tugas_Kelas_Pertemuan_10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Priority_Queue {
    /*PriorityQueue mengurutkan elemen berdasarkan prioritasnya.
Elemen dengan prioritas tertinggi akan diambil terlebih dahulu dari antrian.
 */
    static PriorityQueue<String> tugas = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        output();
    }

    private static void output() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input();
        System.out.println("Pilih Salah Satu Aksi Dibawah");
        System.out.println("Pilih 1 Untuk Melihat Isi Data");
        System.out.println("Pilih 2 Untuk Hapus Data");
        System.out.print("Masukkan Pilihan = ");
        int d = Integer.parseInt(br.readLine());
        // Memproses tugas sesuai prioritas
        if (d == 1) {
            while (!tugas.isEmpty()) {
                String tugasSekarang = tugas.poll();
                System.out.println("Matkul Yang Harus Dikerjakan = " + tugasSekarang);

            }
        } else if (d == 2) {
            System.out.print("Berapa MatKul Yang Ingin Dihapus = ");
            int e = Integer.parseInt(br.readLine());
            hapus(e);
        } else if (d > 2 || d < 1) {
            System.out.println("Inputan Anda Salah");

        }
    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Berapa MatKul Yang akan Dikerjakan = ");
        int j = Integer.parseInt(br.readLine());
        for (int i = 1; i <= j; i++) {
            System.out.print("Masukkan Nama MatKul Ke " + i + " Yang Ingin Dikerjakan = ");
            tugas.add(br.readLine());
        }
    }

    public static void hapus(int d) {
        for (int i = 1; i <= d; i++) {
            if (!tugas.isEmpty()) {
                String tugasSekarang = tugas.poll();
                System.out.println("Tugas ke " + i + " Yang Dihapus Adalah " + tugasSekarang);
            } else {
                System.out.println("Antrian Kosong. Tidak ada tugas yang dihapus.");
                break;
            }
        }System.out.println("Antrian Setelah Penghapusan = " + tugas);
    }
}


