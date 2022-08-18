import java.util.Scanner;
public class Teste1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Olá, iniciação científica");
		
		double n1, n2, n3, n4, n5;
		int p1, p2, p3;
		float mediaaritmetica;
		
		System.out.println("Digite aqui a sua nota 1:");
		n1 = entrada.nextDouble();
		System.out.println("Digite aqui a sua nota 2:");
		n2 = entrada.nextDouble();
		System.out.println("Digite aqui a sua nota 3:");
		n3 = entrada.nextDouble();
		System.out.println("Digite aqui a sua nota 4:");
		n4 = entrada.nextDouble();
		System.out.println("Digite aqui a sua nota da prova final");
		n5 = entrada.nextDouble();
		
		System.out.println("Digite aqui o 1° peso: ");
		p1 = entrada.nextInt();
		System.out.println("Digite aqui o 2° peso: ");
		p2 = entrada.nextInt();
		p3 = 10;
		
		mediaaritmetica = (float) ((n1*p1)+(n2+p1)+(n3*p2)+(n4*p2)+(n5*p3))/(p1+p1+p2+p2+p3);
		
		System.out.println("Sua média ponderada é: "+mediaaritmetica);
		System.exit(0);
	}
}
