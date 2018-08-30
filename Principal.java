import java.util.Scanner;
public class Principal{
	public static Scanner x = new Scanner(System.in);
	public static void main(String args[]){
		int p;
		float q;
		String opcao = "";
		Carro auto = new Carro();
		System.out.println("\tBem-vindo!\n\tCaso seja novo digite(ajuda) para saber as opções disponíveis!");
		while(!opcao.equals("sair")){
			opcao = x.nextLine();
			String escolha[] = opcao.split(" ");
			switch(escolha[0]){
				case "pass":
					p = Integer.parseInt(escolha[1]);
					auto.entrar(p);
					break;
				case "fuel":
					q = Float.parseFloat(escolha[1]);
					auto.abastecer(q);
					break;
				case "drive":
					q = Float.parseFloat(escolha[1]);
					auto.dirigir(q);
					break;
				case "show":
					System.out.println("pass:  " + auto.pass + ",  gas:  " + auto.gas + ",  km:  " + auto.km);
					break;
				case "ajuda":
					System.out.println("-----------Bem-vindo a central de ajuda!----------\n"+
										"-----------Escolha uma das opções abaixo:---------\n"+
										"pass numero: Número de passageiros!(Máx: 2) Obs: Só pode entrar/sair um passageiro por vez.O número é para dizer se vai entrar(1) ou sair(2) passageiro\n"+
										"fuel numero: Quantidade para abastecer o carro!(Máx: 10)\n"+
										"drive numero: Dirigir o carro!\n"+
										"show: Ver os dados do carro!\n"+
										"sair: Sair do programa!\n"+
										"--------------------------------------------------\n"+
										"--------------------------------------------------\n");	
					break;
				case "sair":
					break;
				default:
					System.out.println("Caractere não identificado!");
			}
		}
	}
}