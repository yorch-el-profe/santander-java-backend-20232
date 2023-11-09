package org.bedu.introduccion;

import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroduccionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IntroduccionApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa el primer número: ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("Ingresa el segundo número:");
		int b = sc.nextInt();
		sc.nextLine();

		int resultado = a + b;

		System.out.println("Resultado: " + resultado);
		sc.close();
	}
}
