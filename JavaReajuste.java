package javareajuste;
/**
 * @author 32212259
 */
import java.util.Scanner;
public class JavaReajuste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double aumento = 0, salario, novo;
        
        System.out.println("Digite seu salário: ");
        salario = teclado.nextDouble();
        
        if (salario <= 2000) {
            aumento = 0.4;
        } else if ((salario > 2000) && (salario <= 3000)) {
            aumento = 0.3;
        } else if ((salario > 3000) && (salario <= 4000)) {
            aumento = 0.2;
        } else if ((salario > 4000) && (salario <= 5000)) {
            aumento = 0.1;
        } else{
            System.out.println("Você não teve aumento.");
        }
        novo = salario + (salario*aumento);
        System.out.println("Seu salario agora é "+novo);
    }
}
