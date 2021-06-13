package projetobichinho;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// System.out.println("oi");

		Scanner scan = new Scanner(System.in);
		int s;
		System.out.println(
				"\nQual Animal voce esta pesquisando: \n1-Cachorro\n2-Gato\n3Animais Silvestres\n0-Para encerrar");
		s = scan.nextInt();

		while (s != 0) {
			switch (s) {
			case 1:
				System.out.println("Digite o nome do cachorro: ");
				String nome = scan.next();

				cachorro cao1 = new cachorro("dog", 1, "LhasaApso", "Grande", "OI", "Preto", "SemDoença", "Vacinado ",
						"Castrado", "Calmo", "RGrau", 11945, "Macho");
				cao1.imprimirInfo();

				break;
			case 2:

				/*
				 * gato gato1 = new gato("Dog",1,"LhasaApso","Grande","OI","Preto"
				 * ,"SemDoença","Vacinado ","Castrado","Calmo","RGrau", 11945,"Macho");
				 * gato1.imprimirInfo();
				 */

				break;
			case 3:

			{

				System.out.println("\nDigite o sexo do pet q vc procura: \n1-Macho\n2Fêmea");
				int sx = scan.nextInt();

				if (sx == 1) {
					System.out.println("\nEsses são nossos animais silvestres machos: ", "Falcão"," raça", "preto", "lenda", "médio", "calmo", "Vacinado ",
							"Castrado", "Calmo", "RGrau", "Macho");
					AnimaisSilvestres Aves1 = new AnimaisSilvestres();
					

				} else if (sx == 2) {
					System.out.println("\nEsses são nossos animais silvestres fêmeas: ");
				}

				else {
					System.out.println("\nComando inválido");
					System.out.println("\nDigite o sexo do pet q vc procura: \n1-Macho\n2Fêmea");
					sx = scan.nextInt();

				}

			}
				break;
			}


		}

		System.out.println("\nEncerrando pesquisa!");
	}

}
