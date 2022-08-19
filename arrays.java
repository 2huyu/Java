import java.util.Scanner;
public class arrays {
	public static void main(String[] args) {
		
		int[][] lista1 = {{2, 4, 6}, {13, 15, 17, 19, 21}}; 
		int[][] lista2 = {{1, 2, 3, 4}, {8}, {5, 6, 9}};
		
		System.out.println("os valores na lista1 passados na linha são:");
		listaprint(lista1);
		System.out.println("os valores na lista2 passados na linha são:");
		listaprint(lista2);
		
		}
		
	public static void listaprint(int[][] lista) {
		for(int linha = 0; linha < lista.length; linha++){
            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for( int coluna = 0; coluna < lista[linha].length; coluna++)
                System.out.printf("%d ", lista[linha][coluna]);
            System.out.println();
		}
	}
}
