package org.bedu.calculator;

import java.util.Scanner;
import org.bedu.calculator.util.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

	@Autowired
	private Calculator calculator;

	@Autowired
	private Scanner sc;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("¿Qué operación quieres realizar?");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		int opcion = sc.nextInt();
		sc.nextLine();

		if (opcion < 1 || opcion > 3) {
			System.out.println("No existe la operación...");
			return;
		}

		System.out.println("Ingresa el primer número:");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("Ingresa el segundo número:");
		int b = sc.nextInt();
		sc.nextLine();

		int resultado = 0;

		switch(opcion) {
			case 1:
			resultado = calculator.sum(a, b);
			break;

			case 2:
			resultado = calculator.subs(a, b);
			break;

			case 3:
			resultado = calculator.mult(a, b);
			break;
		}

		System.out.println("Resultado: " + resultado);
		sc.close();
	}
}
