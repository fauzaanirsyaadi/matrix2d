package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();
        PrintPosisi(x,y);
    }

    public static void PrintPosisi(int jumlahBaris, int jumlahKolom){
        // validasi
        if (jumlahBaris <= 0 || jumlahKolom <= 0) {
            System.out.println("Nilai x dan y harus lebih besar dari 0");
            return;
        }

        int top = 0, bottom = jumlahBaris - 1, left = 0, right = jumlahKolom - 1;
        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {
            // Pindah dari kiri ke kanan pada baris atas
            for (int i = left; i <= right; i++) {
                result.append(top).append(".").append(i).append(", ");
            }
            top++;

            // Pindah dari atas ke bawah pada kolom kanan
            for (int i = top; i <= bottom; i++) {
                result.append(i).append(".").append(right).append(", ");
            }
            right--;

            if (top <= bottom) {
                // Pindah dari kanan ke kiri pada baris bawah
                for (int i = right; i >= left; i--) {
                    result.append(bottom).append(".").append(i).append(", ");
                }
                bottom--;
            }

            if (left <= right) {
                // Pindah dari bawah ke atas pada kolom kiri
                for (int i = bottom; i >= top; i--) {
                    result.append(i).append(".").append(left).append(", ");
                }
                left++;
            }
        }

        // hapus koma terakhir
        if (result.length() > 2) {
            result.setLength(result.length() - 2);
        }
        System.out.print(result);
    }
}