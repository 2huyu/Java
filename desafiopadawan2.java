import java.util.Scanner;
public class desafiopadawan2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N, cont = 0, cont2 = 1, soma = 0;
		N = entrada.nextInt();
		
		for (int i = 0 ; i < N; i++ ) {
			System.out.printf(cont+" ");
			soma = cont + cont2;
			cont=cont2;
			cont2=soma;
		}
	}
}
