package Generation;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// System.out.println("oi");

		Scanner scan = new Scanner(System.in);
		int s;
		int sx = 0;
		System.out.println(
				"\nQual Animal voce esta pesquisando, clique no n�mero correspondente: \n1 - Cachorro\n2 - Gato\n3 - Animais Silvestres\n0-Para encerrar");
		s = scan.nextInt();

		while (s != 0) {
			switch (s) {
			case 1:
				System.out.println("Digite o nome do cachorro: ");
				//String nome = scan.next();

				/*cachorro cao1 = new cachorro("dog", 1, "LhasaApso", "Grande", "OI", "Preto", "SemDoen�a", "Vacinado ",
						"Castrado", "Calmo", "RGrau", 11945, "Macho");
				cao1.imprimirInfo();*/

				break;
			case 2:

				/*
				 * gato gato1 = new gato("Dog",1,"LhasaApso","Grande","OI","Preto"
				 * ,"SemDoen�a","Vacinado ","Castrado","Calmo","RGrau", 11945,"Macho");
				 * gato1.imprimirInfo();
				 */

				break;
			case 3:

			do {

				System.out.println("\nDigite o sexo do pet q vc procura: \n1-Macho\n2F�mea");
				sx = scan.nextInt();

				if (sx == 1) {
					System.out.println ("\nEsses s�o nossos animais silvestres machos: ");
					
					AnimaisSilvestres Aves1 = new AnimaisSilvestres("Gunter", 3, "preta", "vacinado",  "castrado", "bonzinho",
							 "Rua Capixaba", 959129749, "macho", "ave", "pequeno");
					Aves1.imprimirInfo();

				} else if (sx == 2) {
					System.out.println("\nEsses s�o nossos animais silvestres f�meas: ");
				}
				
			}while (sx != 1 && sx != 2);
			
				//Coloquei um n�mero diferente de 0, para que saia do primeiro la�o de repeti��o while, que informava != 0 como condi��o.
				System.out.println ("\nPara finalizar, clique em 0:");
				s = scan.nextInt ();
				
				break;
			}
		}
	}

}