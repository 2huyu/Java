import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int cont1 = 0, cont2 = 0, cont3 = 0, idadeX = 0, idade2, pesquisados;
		System.out.println("Quantas pessoas você pesquisou?");
		pesquisados = teclado.nextInt();
		int listapesquisa[] = new int[pesquisados];
		
		System.out.println("Digite a idade de cada pessoa: ");
		for (int i=0; i < listapesquisa.length; i++) {
			listapesquisa[i] = teclado.nextInt();
			if (listapesquisa[i] <= 18 && listapesquisa[i] >= 0) {
				cont1 += 1;
			}
			else if (listapesquisa[i] > 18 && listapesquisa[i] < 60) {
				cont2 += 1;
			}
			else if (listapesquisa[i] < 0) {
				idadeX = idadeX + 1;
				System.out.println(idadeX+" Não existe ainda");
			}
			else {
				cont3 += 1;
			}
		}
	
		System.out.println("tem "+cont1+" jovens pesquisados.");
		System.out.println("tem "+cont2+" adultos pesquisados.");
		System.out.println("tem "+cont3+" idosos pesquisados.");
	}
}
