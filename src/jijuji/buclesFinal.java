package jijuji;

import java.util.Scanner;

public class buclesFinal {
	public static void main(String[] args) {
		/*
		================================================================================
		EJERCICIO 1: Cuenta y suma de múltiplos
		================================================================================
		System.out.print("Introduce un número entero positivo N: ");
		int n = sc.nextInt();
		int cantidad = 0;
		int suma = 0;

		for (int i = 1; i <= n; i++) {
		    if (i % 3 == 0) {
		        System.out.print(i + " ");
		        cantidad++;
		        suma += i;
		    }
		}
		System.out.println("\nCantidad: " + cantidad);
		System.out.println("Suma: " + suma);
		*/

		/*
		================================================================================
		EJERCICIO 2: Estadísticas de una serie de números
		================================================================================
		System.out.print("¿Cuántos números deseas introducir?: ");
		int totalNumeros = sc.nextInt();
		double sumaTotal = 0;
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		int mayor = 0;
		int menor = 0;

		for (int i = 1; i <= totalNumeros; i++) {
		    System.out.print("Introduce el número " + i + ": ");
		    int num = sc.nextInt();
		    sumaTotal += num;

		    if (num > 0) {
		        positivos++;
		    } else if (num < 0) {
		        negativos++;
		    } else {
		        ceros++;
		    }

		    if (i == 1) {
		        mayor = num;
		        menor = num;
		    } else {
		        if (num > mayor) mayor = num;
		        if (num < menor) menor = num;
		    }
		}

		double media = (totalNumeros > 0) ? (sumaTotal / totalNumeros) : 0;
		System.out.println("Suma total: " + sumaTotal);
		System.out.println("Media: " + media);
		System.out.println("Cantidad de positivos: " + positivos);
		System.out.println("Cantidad de negativos: " + negativos);
		System.out.println("Cantidad de ceros: " + ceros);
		System.out.println("Número mayor: " + mayor);
		System.out.println("Número menor: " + menor);
		*/

		/*
		================================================================================
		EJERCICIO 3: Control de contraseña
		================================================================================
		String password = "java123";
		int intentosRestantes = 3;
		boolean acertado = false;

		while (intentosRestantes > 0 && !acertado) {
		    System.out.print("Introduce la contraseña: ");
		    String passIngresada = sc.next();

		    if (passIngresada.equals(password)) {
		        System.out.println("Acceso permitido");
		        acertado = true;
		    } else {
		        intentosRestantes--;
		        if (intentosRestantes > 0) {
		            System.out.println("Contraseña incorrecta. Te quedan " + intentosRestantes + " intentos.");
		        } else {
		            System.out.println("Usuario bloqueado");
		        }
		    }
		}
		*/

		/*
		================================================================================
		EJERCICIO 4: Cajero automático
		================================================================================
		double saldo = 1000.0;
		int operaciones = 0;
		int opcionCajero;

		do {
		    System.out.println("\n1. Consultar saldo");
		    System.out.println("2. Ingresar dinero");
		    System.out.println("3. Retirar dinero");
		    System.out.println("4. Salir");
		    System.out.print("Elige una opción: ");
		    opcionCajero = sc.nextInt();

		    if (opcionCajero == 1) {
		        System.out.println("Saldo actual: " + saldo + " €");
		        operaciones++;
		    } else if (opcionCajero == 2) {
		        double ingreso;
		        do {
		            System.out.print("Cantidad a ingresar (>0): ");
		            ingreso = sc.nextDouble();
		        } while (ingreso <= 0);
		        saldo += ingreso;
		        operaciones++;
		        System.out.println("Ingreso realizado con éxito.");
		    } else if (opcionCajero == 3) {
		        double retiro;
		        do {
		            System.out.print("Cantidad a retirar (>0 y menor/igual al saldo): ");
		            retiro = sc.nextDouble();
		        } while (retiro <= 0 || retiro > saldo);
		        saldo -= retiro;
		        operaciones++;
		        System.out.println("Retiro realizado con éxito.");
		    }
		} while (opcionCajero != 4);

		System.out.println("Saldo final: " + saldo + " €");
		System.out.println("Número de operaciones realizadas: " + operaciones);
		*/

		/*
		================================================================================
		EJERCICIO 5: Análisis de las notas de una clase
		================================================================================
		System.out.print("Introduce el número de alumnos: ");
		int numAlumnos = sc.nextInt();
		double sumaNotas = 0;
		int aprobados = 0;
		int suspensos = 0;
		int sobresalientes = 0;
		double notaMax = -1;
		double notaMin = 11;

		for (int i = 1; i <= numAlumnos; i++) {
		    double nota;
		    do {
		        System.out.print("Introduce la nota del alumno " + i + " (entre 0 y 10): ");
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

		    if (nota > notaMax) notaMax = nota;
		    if (nota < notaMin) notaMin = nota;
		}

		double mediaClase = (numAlumnos > 0) ? (sumaNotas / numAlumnos) : 0;
		double porcentajeAprobados = (numAlumnos > 0) ? ((double) aprobados / numAlumnos) * 100 : 0;

		System.out.println("Media de la clase: " + mediaClase);
		System.out.println("Aprobados: " + aprobados);
		System.out.println("Suspensos: " + suspensos);
		System.out.println("Número de sobresalientes: " + sobresalientes);
		System.out.println("Nota máxima: " + notaMax);
		System.out.println("Nota mínima: " + notaMin);
		System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
		*/

		/*
		================================================================================
		EJERCICIO 6: Juego del número secreto
		================================================================================
		char jugarOtra;
		do {
		    int secreto = (int) (Math.random() * 100) + 1;
		    int intentos = 7;
		    boolean ganado = false;

		    while (intentos > 0 && !ganado) {
		        System.out.print("Adivina el número (1-100, te quedan " + intentos + " intentos): ");
		        int intento = sc.nextInt();

		        if (intento < 1 || intento > 100) {
		            System.out.println("Número no válido. Debe estar entre 1 y 100.");
		            continue;
		        }

		        if (intento == secreto) {
		            System.out.println("¡Has acertado!");
		            ganado = true;
		        } else if (intento < secreto) {
		            System.out.println("El número secreto es mayor.");
		            intentos--;
		        } else {
		            System.out.println("El número secreto es menor.");
		            intentos--;
		        }
		    }

		    if (!ganado) {
		        System.out.println("Has agotado los intentos. El número secreto era: " + secreto);
		    }

		    System.out.print("¿Desea jugar otra partida? (S/N): ");
		    jugarOtra = sc.next().toUpperCase().charAt(0);
		} while (jugarOtra == 'S');
		*/

		/*
		================================================================================
		EJERCICIO 7: Dibujo de un marco
		================================================================================
		System.out.print("Introduce el número de filas: ");
		int filas = sc.nextInt();
		System.out.print("Introduce el número de columnas: ");
		int columnas = sc.nextInt();

		for (int f = 1; f <= filas; f++) {
		    for (int c = 1; c <= columnas; c++) {
		        if (f == 1 || f == filas || c == 1 || c == columnas) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		*/

		/*
		================================================================================
		EJERCICIO 8: Tabla de divisores y números primos
		================================================================================
		System.out.print("Introduce el número de inicio: ");
		int inicio = sc.nextInt();
		System.out.print("Introduce el número de fin: ");
		int fin = sc.nextInt();
		int totalPrimosIntervalo = 0;
		int maxDivisoresIntervalo = -1;

		for (int i = inicio; i <= fin; i++) {
		    System.out.print(i + " -> ");
		    int contDivisores = 0;
		    for (int j = 1; j <= i; j++) {
		        if (i % j == 0) {
		            System.out.print(j + " ");
		            contDivisores++;
		        }
		    }
		    System.out.println("-> " + contDivisores + " divisores");

		    if (contDivisores == 2) {
		        totalPrimosIntervalo++;
		    }

		    if (contDivisores > maxDivisoresIntervalo) {
		        maxDivisoresIntervalo = contDivisores;
		    }
		}
		System.out.println("Total primos en el intervalo: " + totalPrimosIntervalo);
		*/

		/*
		================================================================================
		EJERCICIO 9: Estadísticas de varios grupos
		================================================================================
		System.out.print("Introduce el número de grupos: ");
		int numGrupos = sc.nextInt();
		int totalAlumnosGlobal = 0;
		double sumaNotasGlobal = 0;
		int totalAprobadosGlobal = 0;
		double mejorMediaGrupo = -1;

		for (int g = 1; g <= numGrupos; g++) {
		    System.out.println("\n--- Grupo " + g + " ---");
		    System.out.print("Introduce el número de alumnos del grupo: ");
		    int alumnosGrupo = sc.nextInt();

		    double sumaNotasGrupo = 0;
		    int aprobadosGrupo = 0;
		    int suspensosGrupo = 0;
		    double mejorNotaGrupo = -1;

		    for (int a = 1; a <= alumnosGrupo; a++) {
		        double nota;
		        do {
		            System.out.print("Nota del alumno " + a + " (0-10): ");
		            nota = sc.nextDouble();
		        } while (nota < 0 || nota > 10);

		        sumaNotasGrupo += nota;
		        sumaNotasGlobal += nota;

		        if (nota >= 5) {
		            aprobadosGrupo++;
		            totalAprobadosGlobal++;
		        } else {
		            suspensosGrupo++;
		        }

		        if (nota > mejorNotaGrupo) mejorNotaGrupo = nota;
		    }

		    double mediaGrupo = (alumnosGrupo > 0) ? (sumaNotasGrupo / alumnosGrupo) : 0;
		    totalAlumnosGlobal += alumnosGrupo;

		    if (mediaGrupo > mejorMediaGrupo) {
		        mejorMediaGrupo = mediaGrupo;
		    }

		    System.out.println("Nota media del grupo: " + mediaGrupo);
		    System.out.println("Aprobados: " + aprobadosGrupo);
		    System.out.println("Suspensos: " + suspensosGrupo);
		    System.out.println("Mejor nota: " + mejorNotaGrupo);
		}

		double mediaGlobal = (totalAlumnosGlobal > 0) ? (sumaNotasGlobal / totalAlumnosGlobal) : 0;
		System.out.println("\n=== RESUMEN GLOBAL ===");
		System.out.println("Número total de alumnos: " + totalAlumnosGlobal);
		System.out.println("Media global de todos los alumnos: " + mediaGlobal);
		System.out.println("Cantidad total de aprobados: " + totalAprobadosGlobal);
		*/

		/*
		================================================================================
		EJERCICIO 10: Máquina expendedora
		================================================================================
		int comprasRealizadas = 0;
		int totalProductosVendidos = 0;
		double dineroRecaudado = 0;
		int opcionProducto;

		do {
		    System.out.println("\n--- MÁQUINA EXPENDEDORA ---");
		    System.out.println("1. Agua -> 1,00 €");
		    System.out.println("2. Refresco -> 1,50 €");
		    System.out.println("3. Zumo -> 1,80 €");
		    System.out.println("4. Bocadillo -> 3,50 €");
		    System.out.println("5. Salir");
		    System.out.print("Selecciona un producto: ");
		    opcionProducto = sc.nextInt();

		    if (opcionProducto >= 1 && opcionProducto <= 4) {
		        int cantidadUnidades;
		        do {
		            System.out.print("Introduce la cantidad de unidades (>0): ");
		            cantidadUnidades = sc.nextInt();
		        } while (cantidadUnidades <= 0);

		        double precioUnitario = 0;
		        if (opcionProducto == 1) precioUnitario = 1.00;
		        else if (opcionProducto == 2) precioUnitario = 1.50;
		        else if (opcionProducto == 3) precioUnitario = 1.80;
		        else if (opcionProducto == 4) precioUnitario = 3.50;

		        double precioCompra = precioUnitario * cantidadUnidades;
		        double dineroIntroducido = 0;

		        while (dineroIntroducido < precioCompra) {
		            System.out.print("Faltan " + (precioCompra - dineroIntroducido) + " €. Introduce dinero: ");
		            double moneda = sc.nextDouble();
		            if (moneda > 0) {
		                dineroIntroducido += moneda;
		            } else {
		                System.out.println("Cantidad inválida. Debe ser positiva.");
		            }
		        }

		        double cambio = dineroIntroducido - precioCompra;
		        System.out.println("Compra realizada con éxito. Su cambio es: " + cambio + " €");

		        comprasRealizadas++;
		        totalProductosVendidos += cantidadUnidades;
		        dineroRecaudado += precioCompra;

		        char otraCompra;
		        do {
		            System.out.print("¿Desea realizar otra compra? (S/N): ");
		            otraCompra = sc.next().toUpperCase().charAt(0);
		        } while (otraCompra != 'S' && otraCompra != 'N');

		        if (otraCompra == 'N') {
		            opcionProducto = 5; // Salir
		        }
		    }
		} while (opcionProducto != 5);

		System.out.println("\n=== RESUMEN FINAL ===");
		System.out.println("Número de compras realizadas: " + comprasRealizadas);
		System.out.println("Número total de productos vendidos: " + totalProductosVendidos);
		System.out.println("Dinero total recaudado: " + dineroRecaudado + " €");
		*/
	}
	
}