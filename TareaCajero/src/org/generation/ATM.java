package org.generation;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ATM {
		static double initialBalance = 10_000.00;
		static double maxWithdraw = 6_000.00;
		static double gatetesDonation = 200.00;
		int invalidChoices = 0;
		DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		static double balance = initialBalance;
		static LocalDateTime lastMovement;
		static boolean active = false;
		
		public static void main(String[] args) {
			int invalidChoices = 0;
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Bienvenido al cajero automático");
	        System.out.println("Su saldo disponible es  $" + initialBalance);

		
		while ( active) {
			System.out.println("Por favor seleccione una opción");
			System.out.println("1. Retirar dinero");
			System.out.println("2. Hacer un depósito");
			System.out.println("3. Consultar saldo");
			System.out.println("4. Aclaraciones y quejas");
			System.out.println("5. Consultar último movimiento");
			System.out.println("9. Salir del sistema");
			
			int choice = scanner.nextInt();
			
			if(choice <1 || choice > 5) {
				invalidChoices++;
				if (invalidChoices >=3) {
					System.out.println("Saliendo del sistema");
					break;
				} else {
					System.out.println("Opción inválida, intente de nuevo");
					continue;
					
				   }
				
			 } else {
				   invalidChoices = 0;
			   }
		 
		
			switch(choice) {
				
			case 1: 
				System.out.println("Retirar dinero");
		        System.out.println("Cantidad disponible para retirar: $" + balance);
		        System.out.print("Ingrese la cantidad a retirar: ");
		        double amount = scanner.nextDouble();
		        scanner.nextLine(); 

		        if (amount <= 0 || amount % 50 != 0 || amount > maxWithdraw) {
		            System.out.println("Cantidad inválida, no se pudo realizar el retiro");
		            return;
		        }

		        if (balance < amount) {
		            System.out.println("Saldo insuficiente. No se pudo realizar el retiro");
		            return;
		        }

		        balance -= amount;
		        
		        lastMovement = LocalDateTime.now();
		        System.out.println("Retiro de $" + amount+ " realizado exitosamente");

		        System.out.print("¿Desea donar $" + gatetesDonation + " para los Gatetes? (S/N): ");
		        String donationChoice = scanner.nextLine().toUpperCase();

		        if (donationChoice.equals("S")) {
		            if (balance < gatetesDonation) {
		                System.out.println("Saldo insuficiente para realizar la donación");
		            } else {
		                balance -= gatetesDonation;
		                System.out.println("Gracias por su donación a los Gatetes");
		            }
		        }

		        System.out.println("Saldo actual: $" + balance);
		        
		        
			case 2:
				    
				System.out.println("Hacer un depósito");
				System.out.println("Seleccione una opción:");
				System.out.println("1. Cuenta de cheques");
				System.out.println("2. Depósito a tarjeta de crédito");

				int depositChoice = scanner.nextInt();
				scanner.nextLine();
				    
				    if (depositChoice == 1) {
				            System.out.println("Depósito en cuenta de cheques");
				            System.out.print("Ingrese la cantidad a depositar: ");
				            double checkDeposit = scanner.nextDouble();
				            scanner.nextLine();

				            if (checkDeposit <= 0 || checkDeposit % 50 != 0) {
				                System.out.println("Cantidad inválida. No se pudo realizar el depósito");
				                System.out.println("Saldo actual: $" + balance);
				                return;
				            } else { 
				            balance += checkDeposit;
				            lastMovement = LocalDateTime.now();
				            System.out.println("Depósito de $" + checkDeposit + " en cuenta de cheques realizado exitosamente");
				            System.out.println("Saldo actual: $" + balance);
				            break;
				            }
				    } else if (depositChoice == 2) {
				            System.out.println("Depósito a tarjeta de crédito");
				            System.out.print("Ingrese la cantidad a depositar: ");
				            double creditCardDeposit = scanner.nextDouble();
				            scanner.nextLine();

				            if (creditCardDeposit <= 0) {
				                System.out.println("Cantidad inválida. No se pudo realizar el depósito.");
				                return;
				            } else {
				            balance -= creditCardDeposit;
				            lastMovement = LocalDateTime.now();
				            System.out.println("Depósito de $" + creditCardDeposit + " a tarjeta de crédito realizado exitosamente.");
				            System.out.println("Saldo actual: $" + balance);
				            break;
				            }
				    } else {
				            System.out.println("Opción inválida. No se pudo realizar el depósito.");
				            return;
				    }

				 
				
				
				
		    }
		        
		        
		        
		        
		        
				
			}	
			
			}
			
			
			
		}
	


