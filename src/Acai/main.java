package Acai;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		rodando ();




	}
	public static void rodando () {
		Scanner read = new Scanner(System.in);
		
		String nomeCliente;
		boolean control = false;
		int aux = 0;
		
		System.out.println("Qual o seu nome: ");
		nomeCliente = read.nextLine();
		System.out.println("Olá " + nomeCliente + " o que deseja fazer?");
		
		Sorvete acai = new Sorvete();
		do {
			System.out.println("");
			System.out.println("(1)MONTAR AÇAI\n(2)CONSULTAR AÇAI\n(3)FINALIZAR COMPRA\n(4)SAIR");
			aux = read.nextInt();
			switch (aux) {
			case 1:
				acai.montarAçai();
				break;
			case 2:
				acai.statusAcai();
				break;
			case 3:
				acai.comprarAcai();
				break;
			case 4:
				System.out.println("Finalizando o progama...");
				break;

			default:
				System.out.println("Numero invalido, tente novamente.");
				break;
			}

			if (aux == 4) {
				control = true;
			}
			
		} while (control == false);
		
		System.out.println("Tchau.");

		







	}
}
