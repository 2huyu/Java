import java.util.Scanner;
public class padawan4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int terceirolink, segundolink, primeirolink;
		terceirolink = entrada.nextInt();
		segundolink = terceirolink*2;
		primeirolink = segundolink*2;
		
		System.out.println(primeirolink);
	}
}
