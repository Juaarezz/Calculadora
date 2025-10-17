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
		} else if (operador.equals("*")) {
			System.out.print(multiplicar(a, b));
		} else if (operador.equals("/")) {
			System.out.print(dividir(a, b));
		} else {
			System.out.print("Error: Introduce un valor válido.");
		}
	}
	
	public static double sumar(double a, double b) {
		 return a + b;
	}
	public static double restar(double a, double b) {
		 return a - b;
	}
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	public static double dividir(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir entre cero");
		} else {
			return a / b;
		}
	}
}
