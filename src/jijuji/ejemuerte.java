package jijuji;

import java.util.Scanner;

public class ejemuerte {

	public static void main(String[] args) {
		/*
		================================================================================
		EJERCICIO 1: Factura de electricidad
		================================================================================
		        Scanner sc = new Scanner(System.in);

		        System.out.println("1. basica 0,18");
		        System.out.println("2. estandar 0,15");
		        System.out.println("3. premium 0,12");
		        
		        System.out.println("Cuanto es el consumo: ");
		        double consumo = sc.nextDouble();
		        
		        System.out.println("que servicio tienes contratado: ");
		        int opcion = sc.nextInt();
		        
		        System.out.println("Tiene bono social (true/false): ");
		        boolean bonoSocial = sc.nextBoolean();
		        
		        if (consumo < 0 || opcion < 1 || opcion > 3) {
		            System.out.println("Error: Datos de entrada incorrectos.");
		        } else {
		            double precioKwh = 0;
		            switch (opcion) {
		                case 1:
		                    precioKwh = 0.18;
		                    break;
		                case 2:
		                    precioKwh = 0.15;
		                    break;
		                case 3:
		                    precioKwh = 0.12;
		                    break;
		            }

		            double costeConsumo = consumo * precioKwh;
		            double recargo = 0;

		            if (consumo > 600) {
		                recargo = costeConsumo * 0.20;
		            } else if (consumo > 300) {
		                recargo = costeConsumo * 0.10;
		            }

		            double importeTrasRecargo = costeConsumo + recargo;
		            double descuento = 0;

		            if (bonoSocial && consumo <= 400) {
		                descuento = importeTrasRecargo * 0.25;
		            }

		            double subtotal = importeTrasRecargo - descuento;
		            double costeFijo = 8.0;
		            double baseImponible = subtotal + costeFijo;
		            double iva = baseImponible * 0.21;
		            double total = baseImponible + iva;

		            System.out.println("Coste del consumo: " + costeConsumo + " €");
		            System.out.println("Recargo: " + recargo + " €");
		            System.out.println("Descuento: " + descuento + " €");
		            System.out.println("Coste fijo: " + costeFijo + " €");
		            System.out.println("IVA: " + iva + " €");
		            System.out.println("Total: " + total + " €");
		        }
		    }
		}
		*/

		/*
		================================================================================
		EJERCICIO 2: Análisis de números de un intervalo
		================================================================================
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int inicio, fin;

		        do {
		            System.out.println("Introduce el número de inicio (positivo): ");
		            inicio = sc.nextInt();
		            System.out.println("Introduce el número de fin (mayor que inicio y positivo): ");
		            fin = sc.nextInt();
		        } while (inicio <= 0 || fin <= 0 || fin <= inicio);

		        int totalPrimos = 0;
		        int maxDivisores = -1;
		        int numeroMaxDivisores = 0;
		        int cuantosTresDivisores = 0;
		        int sumaPrimos = 0;

		        for (int i = inicio; i <= fin; i++) {
		            int contadorDivisores = 0;

		            for (int j = 1; j <= i; j++) {
		                if (i % j == 0) {
		                    contadorDivisores++;
		                }
		            }

		            boolean esPrimo = (contadorDivisores == 2);

		            if (esPrimo) {
		                totalPrimos++;
		                sumaPrimos += i;
		                System.out.println(i + " -> " + contadorDivisores + " divisores (primo)");
		            } else {
		                System.out.println(i + " -> " + contadorDivisores + " divisores");
		            }

		            if (contadorDivisores > maxDivisores) {
		                maxDivisores = contadorDivisores;
		                numeroMaxDivisores = i;
		            }

		            if (contadorDivisores == 3) {
		                cuantosTresDivisores++;
		            }
		        }

		        System.out.println("\nTotal primos: " + totalPrimos);
		        System.out.println("Número con más divisores: " + numeroMaxDivisores);
		        System.out.println("Números con exactamente 3 divisores: " + cuantosTresDivisores);
		        System.out.println("Suma de primos: " + sumaPrimos);
		    }
		}
		*/

		/*
		================================================================================
		EJERCICIO 3: Funciones (operaciones matemáticas)
		================================================================================
		    public static boolean esPerfecto(int numero) {
		        if (numero <= 0) return false;
		        int suma = 0;
		        for (int i = 1; i < numero; i++) {
		            if (numero % i == 0) {
		                suma += i;
		            }
		        }
		        return suma == numero;
		    }

		    public static double potenciaRecursiva(double base, int exponente) {
		        if (exponente == 0) {
		            return 1;
		        }
		        return base * potenciaRecursiva(base, exponente - 1);
		    }

		    public static int contarDigitos(int numero) {
		        if (numero == 0) return 1;
		        int contador = 0;
		        while (numero > 0) {
		            contador++;
		            numero /= 10;
		        }
		        return contador;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Introduce un número para comprobar si es perfecto: ");
		        int numPerfecto = sc.nextInt();
		        System.out.println("¿Es perfecto? " + esPerfecto(numPerfecto));

		        System.out.println("Introduce la base para la potencia: ");
		        double base = sc.nextDouble();
		        System.out.println("Introduce el exponente (entero no negativo): ");
		        int exponente = sc.nextInt();
		        System.out.println("Resultado de la potencia: " + potenciaRecursiva(base, exponente));

		        System.out.println("Introduce un número entero no negativo para contar dígitos: ");
		        int numDigitos = sc.nextInt();
		        System.out.println("Cantidad de dígitos: " + contarDigitos(numDigitos));
		    }
		}
		*/

		/*
		================================================================================
		EJERCICIO 4: Gestión de ventas de una tienda
		================================================================================

		    public static double calcularImporte(int tipo, int cantidad) {
		        double precioUnitario = 0;
		        switch (tipo) {
		            case 1: precioUnitario = 15; break;
		            case 2: precioUnitario = 30; break;
		            case 3: precioUnitario = 40; break;
		            default: return -1;
		        }
		        return precioUnitario * cantidad;
		    }

		    public static double calcularDescuento(double importe, boolean socio) {
		        double porcentaje = 0;
		        if (importe >= 100) {
		            porcentaje += 0.15;
		        } else if (importe >= 50) {
		            porcentaje += 0.10;
		        }

		        if (socio) {
		            porcentaje += 0.05;
		        }

		        if (porcentaje > 0.20) {
		            porcentaje = 0.20;
		        }

		        return importe * porcentaje;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int opcion;

		        int totalVentas = 0;
		        double recaudacionTotal = 0;
		        double ventaMasCara = -1;
		        int ventasSuperiores100 = 0;

		        do {
		            System.out.println("\n--- MENÚ TIENDA ---");
		            System.out.println("1. Registrar venta");
		            System.out.println("2. Consultar estadísticas");
		            System.out.println("3. Salir");
		            System.out.print("Elige una opción: ");
		            opcion = sc.nextInt();

		            if (opcion == 1) {
		                System.out.print("Tipo de producto (1. Camiseta, 2. Pantalón, 3. Sudadera): ");
		                int tipo = sc.nextInt();

		                double importeInicial = calcularImporte(tipo, 1);
		                if (importeInicial == -1) {
		                    System.out.println("Error: Producto no existe.");
		                    continue;
		                }

		                int cantidad;
		                do {
		                    System.out.print("Cantidad (debe ser positiva): ");
		                    cantidad = sc.nextInt();
		                } while (cantidad <= 0);

		                importeInicial = calcularImporte(tipo, cantidad);

		                System.out.print("¿Es socio? (true/false): ");
		                boolean socio = sc.nextBoolean();

		                double descuento = calcularDescuento(importeInicial, socio);
		                double precioFinal = importeInicial - descuento;

		                totalVentas++;
		                recaudacionTotal += precioFinal;

		                if (precioFinal > ventaMasCara) {
		                    ventaMasCara = precioFinal;
		                }

		                if (precioFinal > 100) {
		                    ventasSuperiores100++;
		                }

		                System.out.println("Importe inicial: " + importeInicial + " €");
		                System.out.println("Descuento: " + descuento + " €");
		                System.out.println("Precio final: " + precioFinal + " €");

		            } else if (opcion == 2) {
		                System.out.println("\n--- ESTADÍSTICAS ---");
		                System.out.println("Número total de ventas: " + totalVentas);
		                System.out.println("Recaudación total: " + recaudacionTotal + " €");
		                System.out.println("Importe de la venta más cara: " + (ventaMasCara == -1 ? 0 : ventaMasCara) + " €");
		                System.out.println("Ventas con importe final > 100 €: " + ventasSuperiores100);
		            }

		        } while (opcion != 3);
		    }
		}
		*/
	}
}