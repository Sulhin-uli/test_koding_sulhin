package com.javainterviewpoint;

import java.util.Scanner;

public class TestKodingSulhin
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris untuk mencetak pola ");

        int rows = scanner.nextInt();
        
        System.out.println("** ...hasil... **");
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
            rows++;
        }

    }
}