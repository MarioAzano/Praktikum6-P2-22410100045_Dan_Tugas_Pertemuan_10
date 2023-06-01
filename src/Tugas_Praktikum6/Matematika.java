package Tugas_Praktikum6;
import java.io.*;
public class Matematika {
    public static void main(String[] args) throws IOException {
      input();
    }
public static int penjumlahan() throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a=0,b=0;
    System.out.print("Masukkan Angka 1 = ");
    a=Integer.parseInt(br.readLine());
    System.out.print("Masukkan angka 2 = ");
    b=Integer.parseInt(br.readLine());
int hasil = Math.addExact(a,b);
    System.out.print("Hasilnya Adalah = ");
    return hasil;
}
public static int perkalian()throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a,b;
    System.out.print("Masukkan Angka 1 = ");
    a=Integer.parseInt(br.readLine());
    System.out.print("Masukkan angka 2 = ");
    b=Integer.parseInt(br.readLine());
    int Hasil = Math.multiplyExact(a,b);
    System.out.print("Hasilnya Adalah = ");
    return Hasil;
}
public static int pengurangan()throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a,b;
    System.out.print("Masukkan Angka 1 = ");
    a=Integer.parseInt(br.readLine());
    System.out.print("Masukkan angka 2 = ");
    b=Integer.parseInt(br.readLine());
int hasiL = Math.min(a,b);
    System.out.print("Hasilnya Adalah = ");
    return hasiL;
}
public static void input () throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int s=0;
    System.out.println("Pilih Nomor 1-3 Yang Anda Inginkan Untuk Perhitungan Aritmatika");
    System.out.println("1. Penjumlahan ");
    System.out.println("2. Pengurangan ");
    System.out.println("3. Perkalian ");
    System.out.print("Masukkan Nomor = ");

    s=Integer.parseInt(br.readLine());

    if (s == 1){
        System.out.println(penjumlahan());
    } else if (s == 2) {
        System.out.println(pengurangan());
    } else if (s == 3) {
        System.out.println(perkalian());
    }else {
        System.out.println("Anda Salah Memasukkan Nomor, Silahkan Coba Lagi ");
    }

}
}
