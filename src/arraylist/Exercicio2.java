package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);

		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		// entrada do número para encontrar a posição dele
		System.out.println("Digite o número para encontrar sua posição:");
		Integer numerousuario = leia.nextInt();

		// checa se o numero do usuario está dentro do array.
		numeros.contains(numerousuario);
		// localiza numero do usuario dentro do array
		numeros.indexOf(numerousuario);

		// if e else if checando se o numero digitado foi encontrado e qual é. Se não
		// achar, retorna pro usuario
		if (numeros.contains(numerousuario) == true) {
			System.out.printf("O número %d foi encontrado na posição %d", numerousuario,
					numeros.indexOf(numerousuario));
		} else if (numeros.contains(numerousuario) != true) {
			System.out.printf("O número %d não foi encontrado", numerousuario);
		}
		// fecha scanner
		leia.close();

	}

}
