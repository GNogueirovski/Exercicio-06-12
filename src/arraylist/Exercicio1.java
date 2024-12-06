package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		// Laço for para adicionar as cores ao arraylist
		for (int i = 0; i < 5; i++) {
			System.out.println("\nA Digite uma cor: ");
			String corDigitada = leia.next();
			cores.add(corDigitada);
		}
		// Lista todas as cores inseridas
		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		// Ordena as cores
		cores.sort(null);

		// Printa as cores em ordem
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();
	}
}
