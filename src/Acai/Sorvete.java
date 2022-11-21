package Acai;
import java.util.Scanner;
public class Sorvete {

	private String descricao;
	private int tamanhoAcai;
	private String acompanhamento1;
	private String acompanhamento2;
	private String acompanhamento3;
	private int quantidade;
	private double preco;



	public void comprarAcai () {
		if (getTamanhoAcai() == 250) {
			setPreco(9.90);
		}else if (getTamanhoAcai() == 500) {
			setPreco(12.99);
		}else if (getTamanhoAcai() == 750) {
			setPreco(15.99);
		}else if (getTamanhoAcai() == 1000) {
			setPreco(17.99);
		}
		
		System.out.println("Açai finalizado.\nSeu pedido: ");
		statusAcai();
		System.out.println("Preço: R$" + getPreco());
		System.out.println("\nCompra finalizada.");
		
		//Zerando os status
		zerandoAcai();
		
	}
	public void zerandoAcai () {
		this.acompanhamento1 = null;
		this.acompanhamento2 = null;
		this.acompanhamento3 = null;
		this.tamanhoAcai = 0;
		this.preco = 0;
	}
	

	public void statusAcai () {
		if (getAcompanhamento1() == null) {
			System.out.println("Sem pedido pronto.");
		}else {
			System.out.println("Tamanho: " + getTamanhoAcai() + "ml" +
				"\nPrimeiro acompanhamento: " + getAcompanhamento1() + 
				"\nSegundo acompanhamento: " + getAcompanhamento2() + 
				"\nTerceiro acompanhamento: " + getAcompanhamento3());
		}
		
		
	
	}

	public void montarAçai () {
		Scanner read = new Scanner (System.in);
		System.out.println("Iniciando o processo de montagem do açai...");
		escolherTamanho();
		escolherAcompanhamento1();
		escolherAcompanhamento2();
		escolherAcompanhamento3();

	}


	public void escolherTamanho () {
		int aux = 0;
		boolean control = false;
		Scanner read = new Scanner (System.in);
		do {
			System.out.println("Escolha o tamanho: \n(1)250ml\n(2)500ml\n(3)750ml\n(4)1L");
			aux = read.nextInt();
			switch (aux) {
			case 1:
				setTamanhoAcai(250);
				control = true;
				break;
			case 2:
				setTamanhoAcai(500);
				control = true;
				break;
			case 3:
				setTamanhoAcai(750);
				control = true;
				break;
			case 4:
				setTamanhoAcai(1000);
				control = true;
				break;

			default:
				System.out.println("Numero invalido.");
				control = false;
				break;
			}

		} while (control == false);

	}


	public void escolherAcompanhamento1 () {
		int aux = 0;
		boolean control = false;
		Scanner read = new Scanner (System.in);


		do {
			System.out.println("Escolha o primeiro acompanhamento: \n(1)BANANA\n(2)GRANOLA TRADICIONAL\n(3)LEITE NINHO"
					+ "\n(4)LEITE CONDENSADO\n(5)FARINHA LACTEA\n(6)COOKIE CREAM\n(7)MORANGO\n(8)PAÇOCA\n(9)NENHUM");
			aux = read.nextInt();

			switch (aux) {
			case 1:
				setAcompanhamento1("Banana");
				control = true;
				break;
			case 2:
				setAcompanhamento1("Granola Tradicional");
				control = true;
				break;
			case 3:
				setAcompanhamento1("Leite ninho");
				control = true;
				break;
			case 4:
				setAcompanhamento1("Leite condensado");
				control = true;
				break;
			case 5:
				setAcompanhamento1("Farinha lactea");
				control = true;
				break;
			case 6:
				setAcompanhamento1("Cookie Cream");
				control = true;
				break;
			case 7:
				setAcompanhamento1("Morango");
				control = true;
				break;
			case 8:
				setAcompanhamento1("Paçoca");
				control = true;
				break;
			case 9:
				setAcompanhamento1("Nada");
				control = true;
				break;

			default:
				System.out.println("numero invalido");
				break;
			}



		} while (control == false);





	}

	public void escolherAcompanhamento2 () {
		int aux = 0;
		boolean control = false;
		Scanner read = new Scanner (System.in);


		do {
			System.out.println("Escolha o segundo acompanhamento: \n(1)BANANA\n(2)GRANOLA TRADICIONAL\n(3)LEITE NINHO"
					+ "\n(4)LEITE CONDENSADO\n(5)FARINHA LACTEA\n(6)COOKIE CREAM\n(7)MORANGO\n(8)PAÇOCA\n(9)NENHUM");
			aux = read.nextInt();

			switch (aux) {
			case 1:
				setAcompanhamento2("Banana");
				control = true;
				break;
			case 2:
				setAcompanhamento2("Granola Tradicional");
				control = true;
				break;
			case 3:
				setAcompanhamento2("Leite ninho");
				control = true;
				break;
			case 4:
				setAcompanhamento2("Leite condensado");
				control = true;
				break;
			case 5:
				setAcompanhamento2("Farinha lactea");
				control = true;
				break;
			case 6:
				setAcompanhamento2("Cookie Cream");
				control = true;
				break;
			case 7:
				setAcompanhamento2("Morango");
				control = true;
				break;
			case 8:
				setAcompanhamento2("Paçoca");
				control = true;
				break;
			case 9:
				setAcompanhamento2("Nada");
				control = true;
				break;
			default:
				System.out.println("numero invalido");
				break;
			}



		} while (control == false);

	}

	public void escolherAcompanhamento3 () {
		int aux = 0;
		boolean control = false;
		Scanner read = new Scanner (System.in);


		do {
			System.out.println("Escolha o terceiro acompanhamento: \n(1)BANANA\n(2)GRANOLA TRADICIONAL\n(3)LEITE NINHO"
					+ "\n(4)LEITE CONDENSADO\n(5)FARINHA LACTEA\n(6)COOKIE CREAM\n(7)MORANGO\n(8)PAÇOCA\n(9)NENHUM");
			aux = read.nextInt();

			switch (aux) {
			case 1:
				setAcompanhamento3("Banana");
				control = true;
				break;
			case 2:
				setAcompanhamento3("Granola Tradicional");
				control = true;
				break;
			case 3:
				setAcompanhamento3("Leite ninho");
				control = true;
				break;
			case 4:
				setAcompanhamento3("Leite condensado");
				control = true;
				break;
			case 5:
				setAcompanhamento3("Farinha lactea");
				control = true;
				break;
			case 6:
				setAcompanhamento3("Cookie Cream");
				control = true;
				break;
			case 7:
				setAcompanhamento3("Morango");
				control = true;
				break;
			case 8:
				setAcompanhamento3("Paçoca");
				control = true;
				break;
			case 9:
				setAcompanhamento3("Nada");
				control = true;
				break;

			default:
				System.out.println("numero invalido");
				break;
			}



		} while (control == false);





	}



	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Sorvete() {
		this.quantidade = 0;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTamanhoAcai() {
		return tamanhoAcai;
	}
	public void setTamanhoAcai(int tamanhoAcai) {
		this.tamanhoAcai = tamanhoAcai;
	}
	public String getAcompanhamento1() {
		return acompanhamento1;
	}
	public void setAcompanhamento1(String acompanhamento1) {
		this.acompanhamento1 = acompanhamento1;
	}
	public String getAcompanhamento2() {
		return acompanhamento2;
	}
	public void setAcompanhamento2(String acompanhamento2) {
		this.acompanhamento2 = acompanhamento2;
	}
	public String getAcompanhamento3() {
		return acompanhamento3;
	}
	public void setAcompanhamento3(String acompanhamento3) {
		this.acompanhamento3 = acompanhamento3;
	}





}
