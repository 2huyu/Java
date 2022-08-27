
package aulapratica32;
import java.util.Scanner;
public class Aulapratica32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lojas;
        System.out.println("Digite a quantidade de lojas que quer analisar: ");
        lojas = entrada.nextInt();
        double lista[] = new double[lojas];
        double somacont = 0, media;
        int contador = 0;
        
        for (int i=0; i < lista.length; i++){
            System.out.println("digite o preco do produto que quer comparar");
            lista[i] = entrada.nextDouble();
            somacont = somacont + lista[i];
        }
        media = somacont / lojas;
        System.out.println("media é "+media);
        for (int b=0; b < lista.length; b++){
            if (lista[b] > media){
                contador = contador + 1;
            }
        }
        System.out.println("a quantidade de preços acima da média é "+contador);
    }
}
