package Tugas_Kelas_Pertemuan_10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Queue {
    static java.util.Queue<String> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException{
output();
    }

    private static void output() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input();
        System.out.println("Pilih Salah Satu Aksi Dibawah");
        System.out.println("Pilih 1 Untuk Melihat Isi Data");
        System.out.println("Pilih 2 Untuk Hapus Data");
        System.out.print("Masukkan Pilihan Anda = ");
        int d = Integer.parseInt(br.readLine());
        if (d==1){
            System.out.println("Isis dari Queue Adalah = " + queue);
        } else if (d==2) {
            hapus();
        } else if (d<1 || d>2) {
            System.out.println("Nomor Yang Anda Masukkan Anda Salah");
        }
    }

    private static void hapus() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Menghapus elemen dari antrian menggunakan metode poll()
        System.out.print("Masukkan Berapa Data Yang Ingin Dihapus = ");
        int d=Integer.parseInt(br.readLine());
        for (int i = 1; i <= d; i++) {
            System.out.println();
            String removedElement = queue.poll();
            System.out.println("Elemen ke " + i + " yang dihapus: " + removedElement);

        }
    }

    private static void input() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        // Menambahkan elemen ke antrian
        System.out.print("Masukkan Berapa Data Yang Mau Dimasukkan = ");
        int d = Integer.parseInt(br.readLine());
        for (int i = 1; i <= d; i++) {
            System.out.print("Masukkan Data ke " + i + " = ");
            queue.add(br.readLine());
        }
    }
}

