import java.util.Scanner;
public class labArray {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
		int vetor[] = new int[10];
		int auxiliar;
		
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = entrada.nextInt();	
			for (int j=0; j<vetor.length; j++) {
				
				if (vetor[i] > vetor [j]) {
					auxiliar = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = auxiliar;
				}
			}
		}
		System.out.println("Ordem Decrescente: ");
		for (int k = 0; k < vetor.length; k++) {
			System.out.println(vetor[k]);
		}
		
		for (int i=0; i<vetor.length; i++) {	
			for (int j=0; j<vetor.length; j++) {
				
				if (vetor[i] < vetor [j]) {
					auxiliar = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = auxiliar;
				}
			}
		}
		System.out.println("Ordem Crescente: ");
		for (int k = 0; k < vetor.length; k++) {
			System.out.println(vetor[k]);
		}
	}
}
