package com.company;

import java.util.Scanner;

public class Main {

    //C(n,r) = n! / (r! * (n-r)!)

    public static void main(String[] args) {

        int n = 0, r = 1;
        int total = 1;
        int total2 = 1;
        int total3 = 1;
        int fark = n - r;


        Scanner scanner = new Scanner(System.in);

        System.out.print("L�tfen Bir n say�s� giriniz :");
        n = scanner.nextInt();

        System.out.print("L�tfen Bir r say�s� giriniz ");
        r = scanner.nextInt();


        if (n < r) {

            System.out.println(" n say�s� r say�s�ndan b�y�k olmal�d�r l�tfen tekrar deneyiniz: ");
            n = scanner.nextInt();

        } else {


            for (int i = 1; i <= n; i++) {

                total = total * i;
                System.out.println(n + " Fakt�riyel =  " + total);


            }
            for (int j = 1; j <= r; j++) {

                total2 = total2 * j;
                System.out.println(r + " Faktoriyel " + total2);


            }
            for (int k = 1; k <= fark; k++) {

                total3 = total3 * k;


                System.out.println(k + " Faktoriyel " + total3);


            }

            System.out.println("(n-r) ' nin Fakt�riyeli : " + total3);
            int carpim = total2 * total3;
            int kombinasyon = total / carpim;

            System.out.println(n + " Say�s�n�n " + r + "li " + " kombinasyonu " + kombinasyon);

        }
    }
}