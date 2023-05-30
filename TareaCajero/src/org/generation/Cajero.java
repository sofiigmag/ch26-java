package org.generation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cajero {

		private static final double SALDO_INICIAL = 10000.00;
	    private static final double MAX_RETIRO = 6000.00;
	    private static final double DONACION_GATETES = 200.00;
	    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

	    private static double saldo = SALDO_INICIAL;
	    private static LocalDateTime ultimoMovimiento;

	    public static void main1(String[] args) {
	        int intentosInvalidos = 0;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Bienvenido al cajero automático");
	        System.out.println("Condiciones iniciales: $" + SALDO_INICIAL);

	        while (true) {
	            mostrarMenu();

	            int opcion = scanner.nextInt();
	            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

	            if (opcion < 1 || opcion > 5) {
	                intentosInvalidos++;
	                if (intentosInvalidos >= 3) {
	                    System.out.println("Ha excedido el número máximo de intentos inválidos. Saliendo del sistema...");
	                    break;
	                } else {
	                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
	                    continue;
	                }
	            } else {
	                intentosInvalidos = 0;
	            }

	            switch (opcion) {
	                case 1:
	                    retirarDinero(scanner);
	                    break;
	                case 2:
	                    hacerDeposito(scanner);
	                    break;
	                case 3:
	                    consultarSaldo();
	                    break;
	                case 4:
	                    System.out.println("No disponible por el momento");
	                    break;
	                case 5:
	                    verUltimoMovimiento1();
	                    break;
	                case 9:
	                    System.out.println("Gracias por utilizar nuestro cajero automático. ¡Hasta luego!");
	                    return;
	            }
	        }
	    }

	    private static void mostrarMenu() {
	        System.out.println("\nOpciones disponibles:");
	        System.out.println("1. Retirar dinero");
	        System.out.println("2. Hacer depósitos");
	        System.out.println("3. Consultar saldo");
	        System.out.println("4. Quejas");
	        System.out.println("5. Ver último movimiento");
	        System.out.println("9. Salir del cajero");
	        System.out.print("Seleccione una opción: ");
	    }

	    private static void retirarDinero(Scanner scanner) {
	        System.out.println("\nRetirar dinero");
	        System.out.println("Cantidad disponible para retirar: $" + saldo);
	        System.out.println("No se puede retirar más de $" + MAX_RETIRO);
	        System.out.println("Solo se pueden retirar múltiplos de $50");

	        System.out.print("Ingrese la cantidad a retirar: ");
	        double cantidad = scanner.nextDouble();
	        scanner.nextLine(); // Consumir el salto de línea después de leer la cantidad

	        if (cantidad <= 0 || cantidad % 50 != 0 || cantidad > MAX_RETIRO) {
	            System.out.println("Cantidad inválida. No se pudo realizar el retiro.");
	            return;
	        }

	        if (saldo < cantidad) {
	            System.out.println("Saldo insuficiente. No se pudo realizar el retiro.");
	            return;
	        }

	        saldo -= cantidad;
	        
	        ultimoMovimiento = LocalDateTime.now();
	        System.out.println("Retiro de $" + cantidad + " realizado exitosamente.");

	        System.out.print("¿Desea donar $" + DONACION_GATETES + " para los Gatetes? (S/N): ");
	        String opcionDonacion = scanner.nextLine().toUpperCase();

	        if (opcionDonacion.equals("S")) {
	            if (saldo < DONACION_GATETES) {
	                System.out.println("Saldo insuficiente para realizar la donación.");
	            } else {
	                saldo -= DONACION_GATETES;
	                System.out.println("Gracias por su donación a los Gatetes.");
	            }
	        }

	        System.out.println("Saldo actual: $" + saldo);
	    }
	      
	        private static void hacerDeposito(Scanner scanner) {
	            System.out.println("\nHacer depósitos");
	            System.out.println("Seleccione una opción:");
	            System.out.println("1. Cuenta de cheques");
	            System.out.println("2. Depósito a tarjeta de crédito");

	            int opcionDeposito = scanner.nextInt();
	            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

	            switch (opcionDeposito) {
	                case 1:
	                    System.out.println("Depósito en cuenta de cheques");
	                    System.out.print("Ingrese la cantidad a depositar: ");
	                    double depositoCheques = scanner.nextDouble();
	                    scanner.nextLine(); // Consumir el salto de línea después de leer la cantidad

	                    if (depositoCheques <= 0 || depositoCheques % 50 != 0) {
	                        System.out.println("Cantidad inválida. No se pudo realizar el depósito.");
	                        return;
	                    }

	                    saldo += depositoCheques;
	                    ultimoMovimiento = LocalDateTime.now();
	                    System.out.println("Depósito de $" + depositoCheques + " en cuenta de cheques realizado exitosamente.");
	                    break;
	                case 2:
	                    System.out.println("Depósito a tarjeta de crédito");
	                    System.out.print("Ingrese la cantidad a depositar: ");
	                    double depositoTarjeta = scanner.nextDouble();
	                    scanner.nextLine(); // Consumir el salto de línea después de leer la cantidad

	                    if (depositoTarjeta <= 0) {
	                        System.out.println("Cantidad inválida. No se pudo realizar el depósito.");
	                        return;
	                    }

	                    saldo -= depositoTarjeta;
	                    ultimoMovimiento = LocalDateTime.now();
	                    System.out.println("Depósito de $" + depositoTarjeta + " a tarjeta de crédito realizado exitosamente.");
	                    break;
	                default:
	                    System.out.println("Opción inválida. No se pudo realizar el depósito.");
	                    return;
	            }

	            System.out.println("Saldo actual: $" + saldo);
	        }

	        private static void consultarSaldo() {
	            System.out.println("\nConsultar saldo");
	            System.out.println("Saldo disponible: $" + saldo);
	        }

	        private static void verUltimoMovimiento1() {
	            System.out.println("\nÚltimo movimiento");
	            if (ultimoMovimiento != null) {
	                String fechaHora = ultimoMovimiento.format(DATE_FORMATTER);
	                System.out.println(fechaHora + " " + obtenerDescripcionUltimoMovimiento1());
	            } else {
	                System.out.println("No se ha realizado ningún movimiento aún.");
	            }
	        }

	        private static String obtenerDescripcionUltimoMovimiento1() {
	            // En este método puedes implementar la lógica para obtener la descripción del último movimiento
	            // Puedes almacenar información adicional sobre el tipo de movimiento en variables adicionales y utilizarlas aquí
	            return "Movimiento desconocido";
	        }
	        
	        private static void verUltimoMovimiento() {
	            System.out.println("\nÚltimo movimiento");
	            if (ultimoMovimiento != null) {
	                String fechaHora = ultimoMovimiento.format(DATE_FORMATTER);
	                System.out.println(fechaHora + " " + obtenerDescripcionUltimoMovimiento1());
	            } else {
	                System.out.println("No se ha realizado ningún movimiento aún.");
	            }
	        }

	        private static String obtenerDescripcionUltimoMovimiento() {
	            if (saldo >= 0) {
	                return "Depósito de $" + saldo;
	            } else {
	                return "Retiro de $" + Math.abs(saldo);
	            }
	        }

	        public static void main(String[] args) {
	            int intentosInvalidos = 0;
	            Scanner scanner = new Scanner(System.in);

	            System.out.println("Bienvenido al cajero automático");
	            System.out.println("Condiciones iniciales: $" + SALDO_INICIAL);

	            while (true) {
	                mostrarMenu();

	                int opcion = scanner.nextInt();
	                scanner.nextLine(); // Consumir el salto de línea después de leer la opción

	                if (opcion < 1 || opcion > 5) {
	                    intentosInvalidos++;
	                    if (intentosInvalidos >= 3) {
	                        System.out.println("Ha excedido el número máximo de intentos inválidos. Saliendo del sistema...");
	                        break;
	                    } else {
	                        System.out.println("Opción inválida. Por favor, intente de nuevo.");
	                        continue;
	                    }
	                } else {
	                    intentosInvalidos = 0;
	                }

	                switch (opcion) {
	                    case 1:
	                        retirarDinero(scanner);
	                        break;
	                    case 2:
	                        hacerDeposito(scanner);
	                        break;
	                    case 3:
	                        consultarSaldo();
	                        break;
	                    case 4:
	                        System.out.println("No disponible por el momento");
	                        break;
	                    case 5:
	                        verUltimoMovimiento1();
	                        break;
	                    case 9:
	                        System.out.println("Gracias por utilizar nuestro cajero automático. ¡Hasta luego!");
	                        return;
	                }
	            }
	        }
		

	    }


