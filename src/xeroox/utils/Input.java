package xeroox.utils;

import java.util.Scanner;

public class Input {

	private static Scanner scanner = new Scanner(System.in);

	public static int perguntarInt(String pergunta) {
		System.out.print(pergunta);
		Integer valor = scanner.nextInt();
		scanner.nextLine();
		return valor;
	}
	
	public static String perguntarString(String pergunta) {
		System.out.print(pergunta);
		return scanner.nextLine();
	}
	
	public static Double perguntarDouble(String pergunta) {
		System.out.print(pergunta);
		Double valor = scanner.nextDouble();
		scanner.nextLine();
		return valor;
	}
	
}
