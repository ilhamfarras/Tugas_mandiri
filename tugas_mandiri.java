package insetionshort;
import java.util.Scanner;

public class tugas_mandiri {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n"+"Masukkan jumlah angka Fibonacci yang akan dihasilkan: ");
            int n = scanner.nextInt();
            int[] fibonacciNumbers = new int[n];
            fibonacciNumbers[0] = 0;
            fibonacciNumbers[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }

            System.out.println("Angka Fibonacci:");
            for (int i = 0; i < n; i++) {
                System.out.println(fibonacciNumbers[i]);
            }

            int sumOfEvenFibonacciNumbers = 0;
            int numberOfEvenFibonacciNumbers = 0;
            for (int i = 0; i < n; i++) {
                if (fibonacciNumbers[i] % 2 == 0) {
                    sumOfEvenFibonacciNumbers += fibonacciNumbers[i];
                    numberOfEvenFibonacciNumbers++;
                }
            }
            System.out.println("Banyaknya Bilangan Genap: " + numberOfEvenFibonacciNumbers);
            System.out.println("Jumlah Bilangan Fibbonacci: " + sumOfEvenFibonacciNumbers);
        }
    }