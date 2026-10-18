package jijuji;

import java.util.Scanner;

public class buclesAnidados {
	public static void main(String[] args) {
		/*
		================================================================================
		EJERCICIO 1: Rectángulo de asteriscos
		================================================================================
		System.out.print("Introduce el número de filas: ");
		int filas = sc.nextInt();
		System.out.print("Introduce el número de columnas: ");
		int columnas = sc.nextInt();
		int totalAsteriscos = 0;

		for (int i = 1; i <= filas; i++) {
		    for (int j = 1; j <= columnas; j++) {
		        System.out.print("*");
		        totalAsteriscos++;
		    }
		    System.out.println();
		}
		System.out.println("Total de asteriscos: " + totalAsteriscos);
		*/

		/*
		================================================================================
		EJERCICIO 2: Triángulo creciente
		================================================================================
		System.out.print("Introduce un número N: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		*/

		/*
		================================================================================
		EJERCICIO 3: Números y sus divisores
		================================================================================
		System.out.print("Introduce un número entero positivo N: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
		    int contDivisores = 0;
		    System.out.print(i + ": ");
		    for (int j = 1; j <= i; j++) {
		        if (i % j == 0) {
		            System.out.print(j);
		            contDivisores++;
		        }
		    }
		    System.out.println(" -> " + i + " tiene " + contDivisores + " divisores.");
		}
		*/

		/*
		================================================================================
		EJERCICIO 4: Números primos hasta N
		================================================================================
		System.out.print("Introduce N: ");
		int n = sc.nextInt();
		int totalPrimos = 0;

		for (int i = 2; i <= n; i++) {
		    int contDivisores = 0;
		    for (int j = 1; j <= i; j++) {
		        if (i % j == 0) {
		            contDivisores++;
		        }
		    }
		    if (contDivisores == 2) {
		        System.out.println(i + " es primo");
		        totalPrimos++;
		    }
		}
		System.out.println("Total de números primos: " + totalPrimos);
		*/
	}
	
}