import java.util.Scanner;
public class desafiopadawan {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double salariofixo, lucromes, salariodolucro, salariototal;
		String nome;
		
		nome = entrada.nextLine();
		salariofixo = entrada.nextDouble();
		lucromes = entrada.nextDouble();
		
		salariodolucro = (lucromes*0.15);
		salariototal = salariofixo + salariodolucro;
		System.out.printf("TOTAL =  R$ %.2f", salariototal);
	}
}
