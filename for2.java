import java.util.Scanner;
public class for2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtd;
		System.out.println("digite a quantidade de números que quer somar");
		qtd = entrada.nextInt();
		
		int nums[] = new int[qtd], somacont = 0;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = entrada.nextInt();
			somacont += nums[i];
		}
		System.out.println("A soma desses números é "+somacont);
	}
}
