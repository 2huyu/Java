import java.util.Scanner;
public class for3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int pessoas[] = new int[7], somacont = 0, maioridade = 0;
		double media;
		
		for (int i=0; i < pessoas.length; i++) {
			System.out.println("Digite uma idade da lista: ");
			pessoas[i] = entrada.nextInt();
			somacont += pessoas[i];
			if (pessoas[i] >= 18) {
				maioridade += 1;
			}
		}
		media = somacont/7;
		System.out.println("A média das idades é "+media);
		System.out.println("e a quantidade maior de 18 é "+maioridade);
	}
}
