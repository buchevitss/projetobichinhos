package Generation;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// System.out.println("oi");

		Scanner scan = new Scanner(System.in);
		int s;
		int sx = 0;
		System.out.println(
				"\nQual Animal voce esta pesquisando, clique no n�mero correspondente: \n1 - Cachorro\n2 - Gato\n3 - Animais Silvestres\n4 - Doar valores para compra de ra��o\n0-Para encerrar");
		s = scan.nextInt();

		while (s != 0) {
			switch (s) {
			case 1:
				System.out.println("Digite o nome do cachorro: ");
				// String nome = scan.next();

				/*
				 * cachorro cao1 = new cachorro("dog", 1, "LhasaApso", "Grande", "OI", "Preto",
				 * "SemDoen�a", "Vacinado ", "Castrado", "Calmo", "RGrau", 11945, "Macho");
				 * cao1.imprimirInfo();
				 */

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
						System.out.println("\nEsses s�o nossos animais silvestres machos: ");

						AnimaisSilvestres Aves1 = new AnimaisSilvestres("Gunter", 3, "preta", "vacinado", "castrado",
								"bonzinho", "Rua Capixaba", 959129749, "macho", "ave", "pequeno");
						Aves1.imprimirInfo();
						System.out.println(
								"\n======================================================================================\n");
						AnimaisSilvestres Jabuti1 = new AnimaisSilvestres("Jamel�o", 8, "cinza", "vacinada",
								"N�o castrada", "d�cil", "Rua da conc�rdia", 545514, "Macho", "Jabuti", "Pequeno");
						Jabuti1.imprimirInfo();

					} else if (sx == 2) {
						System.out.println("\nEsses s�o nossos animais silvestres f�meas: ");

						AnimaisSilvestres Papagaio1 = new AnimaisSilvestres("Lora", 2, "verde", "vacinada",
								"n�o castrada", "d�cil", "Rua Bahia", 119343454, "F�mea", "Ave", "Pequeno");
						Papagaio1.imprimirInfo();
						System.out.println(
								"\n======================================================================================\n");

						AnimaisSilvestres Cobra1 = new AnimaisSilvestres("Gertrude", 15, "cinza", "vacinada",
								"N�o castrada", "d�cil", "Rua da gruta", 54543234, "F�mea", "R�ptil(cobra)", "M�dio");
						Cobra1.imprimirInfo();

					}

				} while (sx != 1 && sx != 2);

				// Coloquei um n�mero diferente de 0, para que saia do primeiro la�o de
				// repeti��o while, que informava != 0 como condi��o.
				System.out.println("\nPara voltar ao menu, insira um n�mero");
				s = scan.nextInt();

				break;
			case 4:

				Doacao doador = new Doacao("amanda", "959", 11);
				doador.printD();

				System.out.println("\nOs bichinhos agradecem!");
				System.out.println("\nPara voltar ao menu, insira um n�mero.");
				s = scan.nextInt();
				break; 
				
			default:  
				System.out.println(
				"\nQual Animal voce esta pesquisando, clique no n�mero correspondente: \n1 - Cachorro\n2 - Gato\n3 - Animais Silvestres\n4 - Doar valores para compra de ra��o\n0-Para encerrar");
				s = scan.nextInt();
			} 
			
		}
		System.out.println("\nOs animaizinhos tamb�m recebem visitas sem compromisso.\n"
				+ "\nJabuti Jamel�o: Sou feliz em dizer, que nos lares provis�rios somos bem tratados."
				+ "\nGata Peneloppe: Quando pedimos muito carinho, vem crian�as nos ver! "
				+ "\nC�o Thor:E � cada adulto cheio de amor, que me enche de abra�os."
				+ "\n\nGostou de algo? Fale com a gente! Org Hakuna."
				+ "\nTelefone: 11 98477-0988. End: Rua Bituva, 56. Jd. Capela. S�o Paulo - SP.");
	}

}