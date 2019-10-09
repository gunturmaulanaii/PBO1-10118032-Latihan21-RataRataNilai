/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Menghitung Rata Rata Nilai Mahasiswa
 */
public class PBO110118032Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
	System.out.print("Masukkan Banyaknya Mahasiswa : ");
	int jumlahMahasiswa = scanner.nextInt();
	double rataMahasiswa = 0;
	for( int i = 0; i < jumlahMahasiswa; i++){
		System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
		rataMahasiswa += scanner.nextInt();
	}
	rataMahasiswa /= jumlahMahasiswa;
	System.out.println("Maka, Rata-rata Nilainya adalah " + rataMahasiswa);
    }
    
}
