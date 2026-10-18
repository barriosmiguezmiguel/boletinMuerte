package jijuji;

import java.util.Scanner;

public class forrr {

	public static void main(String[] args) {
		/*
		================================================================================
		EJERCICIO 1: Eco
		================================================================================
		System.out.print("Introduce un número entero positivo: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    System.out.println("Eco...");
		}
		*/

		/*
		================================================================================
		EJERCICIO 2: Números en un intervalo
		================================================================================
		System.out.print("Primer número: ");
		int primero = sc.nextInt();
		System.out.print("Segundo número: ");
		int segundo = sc.nextInt();
		int contador = 0;

		for (int i = primero; i <= segundo; i++) {
		    System.out.print(i + " ");
		    contador++;
		}
		System.out.println("\nSe han escrito " + contador + " números.");
		*/

		/*
		================================================================================
		EJERCICIO 3: Tabla de multiplicar completa
		================================================================================
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		int sumaResultados = 0;

		for (int i = 1; i <= 10; i++) {
		    int resultado = num * i;
		    System.out.println(num + " x " + i + " = " + resultado);
		    sumaResultados += resultado;
		}
		System.out.println("Suma de todos los resultados: " + sumaResultados);
		*/

		/*
		================================================================================
		EJERCICIO 4: Estadísticas de números
		================================================================================
		System.out.print("¿Cuántos números quieres introducir?: ");
		int cantidad = sc.nextInt();
		double suma = 0;
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		int pares = 0;
		int impares = 0;

		for (int i = 1; i <= cantidad; i++) {
		    System.out.print("Introduce el número " + i + ": ");
		    int n = sc.nextInt();
		    suma += n;

		    if (n > 0) {
		        positivos++;
		    } else if (n < 0) {
		        negativos++;
		    } else {
		        ceros++;
		    }

		    if (n % 2 == 0) {
		        pares++;
		    } else {
		        impares++;
		    }
		}

		double media = (cantidad > 0) ? (suma / cantidad) : 0;
		System.out.println("Suma de todos los números: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Cantidad de positivos: " + positivos);
		System.out.println("Cantidad de negativos: " + negativos);
		System.out.println("Cantidad de ceros: " + ceros);
		System.out.println("Cuántos son pares: " + pares);
		System.out.println("Cuántos son impares: " + impares);
		*/

		/*
		================================================================================
		EJERCICIO 5: Factorial y suma
		================================================================================
		System.out.print("Introduce un número entero positivo N: ");
		int n = sc.nextInt();
		int suma = 0;
		long factorial = 1;

		for (int i = 1; i <= n; i++) {
		    suma += i;
		    factorial *= i;
		}

		System.out.println("Suma: " + suma);
		System.out.println("Factorial: " + factorial);
		*/

		/*
		================================================================================
		EJERCICIO 6: Análisis de las notas de una clase
		================================================================================
		System.out.print("Introduce el número de alumnos de una clase: ");
		int numAlumnos = sc.nextInt();
		double sumaNotas = 0;
		int aprobados = 0;
		int suspensos = 0;
		int sobresalientes = 0;
		double notaAlta = -1;
		double notaBaja = 11;

		for (int i = 1; i <= numAlumnos; i++) {
		    double nota;
		    do {
		        System.out.print("Nota del alumno " + i + " (0 a 10): ");
		        nota = sc.nextDouble();
		    } while (nota < 0 || nota > 10);

		    sumaNotas += nota;
		    if (nota >= 5) {
		        aprobados++;
		    } else {
		        suspensos++;
		    }

		    if (nota >= 9) {
		        sobresalientes++;
		    }

		    if (nota > notaAlta) notaAlta = nota;
		    if (nota < notaBaja) notaBaja = nota;
		}

		double notaMedia = (numAlumnos > 0) ? (sumaNotas / numAlumnos) : 0;
		double porcentajeAprobados = (numAlumnos > 0) ? ((double) aprobados / numAlumnos) * 100 : 0;

		System.out.println("Nota media: " + notaMedia);
		System.out.println("Número de aprobados: " + aprobados);
		System.out.println("Número de suspensos: " + suspensos);
		System.out.println("Número de alumnos con sobresaliente (>=9): " + sobresalientes);
		System.out.println("Nota más alta: " + notaAlta);
		System.out.println("Nota más baja: " + notaBaja);
		System.out.println("Porcentaje de alumnos aprobados: " + porcentajeAprobados + "%");
		*/

		/*
		================================================================================
		EJERCICIO 7: Números primos de un intervalo
		================================================================================
		System.out.print("Inicio: ");
		int inicio = sc.nextInt();
		System.out.print("Fin: ");
		int fin = sc.nextInt();
		int cantidadPrimos = 0;

		System.out.println("Números primos:");
		for (int i = inicio; i <= fin; i++) {
		    int divisores = 0;
		    for (int j = 1; j <= i; j++) {
		        if (i % j == 0) {
		            divisores++;
		        }
		    }
		    if (divisores == 2) {
		        System.out.println(i);
		        cantidadPrimos++;
		    }
		}
		System.out.println("Cantidad de primos: " + cantidadPrimos);
		*/

	}

}
