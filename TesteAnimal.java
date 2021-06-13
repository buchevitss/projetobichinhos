package Generation;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// System.out.println("oi");

		Scanner scan = new Scanner(System.in);
		int s;
		int sx = 0;
		System.out.println(
				"\nQual Animal voce esta pesquisando, clique no número correspondente: \n1 - Cachorro\n2 - Gato\n3 - Animais Silvestres\n4 - Doar valores para compra de ração\n0-Para encerrar");
		s = scan.nextInt();

		while (s != 0) {
			switch (s) {
			case 1:
				System.out.println("Digite o nome do cachorro: ");
				// String nome = scan.next();

				/*
				 * cachorro cao1 = new cachorro("dog", 1, "LhasaApso", "Grande", "OI", "Preto",
				 * "SemDoença", "Vacinado ", "Castrado", "Calmo", "RGrau", 11945, "Macho");
				 * cao1.imprimirInfo();
				 */

				break;
			case 2:

				/*
				 * gato gato1 = new gato("Dog",1,"LhasaApso","Grande","OI","Preto"
				 * ,"SemDoença","Vacinado ","Castrado","Calmo","RGrau", 11945,"Macho");
				 * gato1.imprimirInfo();
				 */

				break;
			case 3:

				do {

					System.out.println("\nDigite o sexo do pet q vc procura: \n1-Macho\n2Fêmea");
					sx = scan.nextInt();

					if (sx == 1) {
						System.out.println("\nEsses são nossos animais silvestres machos: ");

						AnimaisSilvestres Aves1 = new AnimaisSilvestres("Gunter", 3, "preta", "vacinado", "castrado",
								"bonzinho", "Rua Capixaba", 959129749, "macho", "ave", "pequeno");
						Aves1.imprimirInfo();
						System.out.println(
								"\n======================================================================================\n");
						AnimaisSilvestres Jabuti1 = new AnimaisSilvestres("Jamelão", 8, "cinza", "vacinada",
								"Não castrada", "dócil", "Rua da concórdia", 545514, "Macho", "Jabuti", "Pequeno");
						Jabuti1.imprimirInfo();

					} else if (sx == 2) {
						System.out.println("\nEsses são nossos animais silvestres fêmeas: ");

						AnimaisSilvestres Papagaio1 = new AnimaisSilvestres("Lora", 2, "verde", "vacinada",
								"não castrada", "dócil", "Rua Bahia", 119343454, "Fêmea", "Ave", "Pequeno");
						Papagaio1.imprimirInfo();
						System.out.println(
								"\n======================================================================================\n");

						AnimaisSilvestres Cobra1 = new AnimaisSilvestres("Gertrude", 15, "cinza", "vacinada",
								"Não castrada", "dócil", "Rua da gruta", 54543234, "Fêmea", "Réptil(cobra)", "Médio");
						Cobra1.imprimirInfo();

					}

				} while (sx != 1 && sx != 2);

				// Coloquei um número diferente de 0, para que saia do primeiro laço de
				// repetição while, que informava != 0 como condição.
				System.out.println("\nPara voltar ao menu, insira um número");
				s = scan.nextInt();

				break;
			case 4:

				Doacao doador = new Doacao("amanda", "959", 11);
				doador.printD();

				System.out.println("\nOs bichinhos agradecem!");
				System.out.println("\nPara voltar ao menu, insira um número.");
				s = scan.nextInt();
				break; 
				
			default:  
				System.out.println(
				"\nQual Animal voce esta pesquisando, clique no número correspondente: \n1 - Cachorro\n2 - Gato\n3 - Animais Silvestres\n4 - Doar valores para compra de ração\n0-Para encerrar");
				s = scan.nextInt();
			} 
			
		}
		System.out.println("\nOs animaizinhos também recebem visitas sem compromisso.\n"
				+ "\nJabuti Jamelão: Sou feliz em dizer, que nos lares provisórios somos bem tratados."
				+ "\nGata Peneloppe: Quando pedimos muito carinho, vem crianças nos ver! "
				+ "\nCão Thor:E é cada adulto cheio de amor, que me enche de abraços."
				+ "\n\nGostou de algo? Fale com a gente! Org Hakuna."
				+ "\nTelefone: 11 98477-0988. End: Rua Bituva, 56. Jd. Capela. São Paulo - SP.");
	}

}