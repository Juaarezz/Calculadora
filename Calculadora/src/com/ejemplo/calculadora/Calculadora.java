package com.ejemplo.calculadora;
import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		String operador;
		
		System.out.print("Introduce un número: ");
		a = sc.nextDouble();
		
		System.out.print("Introduce otro número: ");
		b = sc.nextDouble();
		
		System.out.print("Introduce el operador (+, -, *, /): ");
		operador = sc.next();
		
		if (operador.equals("+")) {
			System.out.print(sumar(a, b));
		} else if (operador.equals("-")) {
			System.out.print(restar(a, b));
		}
	}
	
	public static double sumar(double a, double b) {
		 return a + b;
	}
	public static double restar(double a, double b) {
		 return a - b;
	}
}
