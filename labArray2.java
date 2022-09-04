import java.util.Scanner;
public class labArray2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[10];
		
		for (int i=0; i<vetor.length;i++) {
			vetor[i] = entrada.nextInt();
		}
		for (int i=9; i <= vetor.length && i > -1;i--) {
			System.out.println(vetor[i]);
		}
	}
}
