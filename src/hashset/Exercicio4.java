package hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		// entrada do número para encontrar a posição dele
		System.out.println("Digite o número para saber se ele é encontrado na lista:");
		Integer numerousuario = leia.nextInt();

		// checa se o numero do usuario está dentro do hashset.
		numeros.contains(numerousuario);

		// if e else if checando se o numero digitado foi encontrado. Se não achar,
		// retorna pro usuario
		if (numeros.contains(numerousuario) == true) {
			System.out.printf("O número %d foi encontrado! ", numerousuario);
		} else if (numeros.contains(numerousuario) != true) {
			System.out.printf("O número %d não foi encontrado!", numerousuario);
		}
		// fecha scanner
		leia.close();

	}

}
