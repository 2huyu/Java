import java.util.Scanner;
public class switch1 {
	public static void main(String[] args ) {
		int opcao;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("-:: Menu de opções::-");
			System.out.println("1. Adicionar um novo contato");
			System.out.println("2. Pesquisar por um contato");
			System.out.println("3. Remover um contato");
			System.out.println("4. Sair");
			System.out.print("Opção: ");
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1:
					System.out.println("Adicionar");
					break;
				case 2:
					System.out.println("Pesquisar");
					break;
				case 3:
					System.out.println("Remover");
					break;
				}
			}
		while (opcao != 4);
		entrada.close();
	}
}