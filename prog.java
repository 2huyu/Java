import java.util.Scanner;
public class prog {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float peso;
		int idade, somaidade, acimadopeso, contador;
		
		acimadopeso = 0;
		somaidade = 0;
		
		for (contador = 0; contador < 5; contador++) {
			idade = teclado.nextInt();
			peso = teclado.nextFloat();
			somaidade = somaidade + idade;
			
			if (peso >= 90) {
				acimadopeso++;
			}
		}
		System.out.println("Média das idades: "+somaidade/5);
		System.out.println("Quantidade de pessoas acima de 90 kg: "+acimadopeso);
	}
}
