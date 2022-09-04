import java.util.Scanner;
public class labArray3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int vetor[] = new int[10];
		for (int i = 0; i<vetor.length; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		System.out.print("Positivos:");
		for (int j=0; j<vetor.length;j++) {
			if (vetor[j] >= 0) {
				System.out.print(" "+vetor[j]);
			}
		}
		
		System.out.print("\nNegativos:");
		for (int j=0; j<vetor.length;j++) {
			if (vetor[j] < 0) {
				System.out.print(" "+vetor[j]);
			}
		}
	}
}

/*int vetor[] = new int[10], cont_negativo= 1, cont_positivo=1, guardarpos, guardarneg; 

for (int i=0; i<vetor.length;i++) {
	vetor[i] = entrada.nextInt();
	if (vetor[i] > 0) {
		cont_positivo += 1;
	}
	else if (vetor[i] < 0) {
		cont_negativo += 1;
	}
}
int positivo[] = new int[cont_positivo]; int negativo[] = new int[cont_negativo];
for (int j=0; j < vetor.length; j++) {
	if (vetor[j] >= 0) {
		guardarpos = vetor[j];
		positivo[j] = guardarpos;
	}
	else if (vetor[j] < 0) {
		guardarneg = vetor[j];
		negativo[j] = guardarneg;
	}
}

System.out.printf("Positivo: ");
for (int l = 0; l < positivo.length; l++) {
	System.out.print(" "+positivo[l]);	
}	
System.out.printf("Negativo: ");
for (int l = 0; l < negativo.length; l++) {
	System.out.print(" "+negativo[l]);	
}*/

		/*int vetor[] = new int[10]; int positivo[] = new int[10]; int negativo[] = new int[10];
		int i;
		
		for (i=0; i<vetor.length;i++) {
			vetor[i] = entrada.nextInt();
			if (vetor[i] > 0) {
				positivo[i] = vetor[i];
			}
			else if (vetor[i] < 0) {
				negativo[i] = vetor[i];
			}
			
		}
		System.out.printf("Positivo: ");
		for (int l = 0; l < positivo.length; l++) {
			System.out.printf(" "+positivo[l]);	
			
		}*/