import java.util.Scanner;
public class for1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0, termo, contador = 1, finale;
		System.out.println("Digite o número que queira saber a soma total: ");
		finale = entrada.nextInt();
		
		for (int rep = 0; rep < finale; rep++) {
			
			termo = contador;
			soma = soma + termo;
			contador += 1;
		}
		System.out.println("a soma final é " +soma);
		
		String nome;
		
		System.out.println("Digite o seu nome de usuário: ");
		nome = entrada.nextLine();
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.println("Seu nome: " +nome);
		}
	}
}