package hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		// for para a inserção dos números e depois inserindo ao hash
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			Integer numerousuario = leia.nextInt();
			numeros.add(numerousuario);
		}
		System.out.println("Listar dados do Set:");
		for (Integer num : numeros) {
			System.out.println(num);
			leia.close();
		}

	}

}
